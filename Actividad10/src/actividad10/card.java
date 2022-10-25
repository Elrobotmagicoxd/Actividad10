package actividad10;

public class card {
    private String VALOR;
    private String PALO;
    private String COLOR;

    card(String PALO, String COLOR, String VALOR) {
        this.VALOR = VALOR;
        this.PALO = PALO;
        this.COLOR = COLOR;
    }

    card(String PALO, String COLOR) {
        this.PALO = PALO;
        this.COLOR = PALO;
    }

    public String getPALO() {
        return this.PALO;
    }

    public void setPALO(String PALO) {
        this.PALO = PALO;
    }

    public String getCOLOR() {
        return this.COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public String getVALOR() {
        return this.VALOR;
    }

    public void setVALOR(Integer VALOR) {
        if (VALOR <= 10) {
            if (VALOR == 1) {
                this.VALOR = "A";
            }

            this.VALOR = VALOR.toString();
        } else if (VALOR == 11) {
            this.VALOR = "J";
        } else if (VALOR == 12) {
            this.VALOR = "Q";
        } else {
            this.VALOR = "k";
        }

    }

    public String toString() {
        return "VALOR=" + this.VALOR + ", PALO=" + this.PALO + ",COLOR=" + this.COLOR;
    }
}
