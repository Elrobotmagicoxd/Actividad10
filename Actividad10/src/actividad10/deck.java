package actividad10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class deck {
    private HashMap<String, String> PALOS = new HashMap();
    private ArrayList<card> mazo = new ArrayList();
    private String strFormat = "Queda %s";
    int a;

    public deck() {
    }

    public ArrayList<card> getMazo() {
        return this.mazo;
    }

    public void mazo() {
        this.PALOS.put("Diamante", "rojo");
        this.PALOS.put("Trebol", "Negro");
        this.PALOS.put("Pica", "Negro");
        this.PALOS.put("Corazon", "rojo");
    }

    public void construir() {
        this.mazo();
        Iterator var1 = this.PALOS.entrySet().iterator();

        while(var1.hasNext()) {
            Entry<String, String> palo = (Entry)var1.next();
            String paloCard = (String)palo.getKey();
            String color = (String)palo.getValue();

            for(int i = 1; i <= 13; ++i) {
                card card = new card(paloCard, color);
                card.setVALOR(i);
                this.mazo.add(card);
            }
        }

    }

    public void Shuffle() {
        Collections.shuffle(this.mazo);
        System.out.println("Mezclamos el deck");
    }

    public void head() throws Exception {
        card card = (card)this.mazo.get(this.mazo.size() - 1);
        this.mazo.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(this.strFormat, this.mazo.size()));
        this.a = this.mazo.size();
        if (this.a == 0) {
            throw new Exception("Se han agotado las cartas");
        }
    }

    private card azar() {
        int max = this.mazo.size() - 1;
        int rd = (int)Math.floor(Math.random() * (double)(0 - max + 1) + (double)max);
        return (card)this.mazo.get(rd);
    }

    public card pick() throws Exception {
        card card = this.azar();
        this.mazo.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(this.strFormat, this.mazo.size()));
        this.a = this.mazo.size();
        if (this.a == 0) {
            throw new Exception("Se han agotado las cartas");
        } else {
            return card;
        }
    }

    private void printHand(ArrayList<card> cards) {
        Iterator var2 = cards.iterator();

        while(var2.hasNext()) {
            card card = (card)var2.next();
            System.out.println(card.toString());
        }

    }

    public void hand() throws Exception {
        ArrayList<card> cards = new ArrayList();
        if (this.mazo.isEmpty()) {
            throw new Exception("Se han agotado las cartas");
        } else if (this.mazo.size() < 5) {
            throw new Exception("Quedan pocas cartas");
        } else {
            for(int i = 1; i <= 5; ++i) {
                cards.add(this.pick());
            }

        }
    }
}
