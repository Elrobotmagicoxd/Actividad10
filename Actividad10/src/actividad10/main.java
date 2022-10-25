package actividad10;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception{

        deck deck= new deck();
        deck.construir();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opciones;
        System.out.println("DECK DE CARTAS PARA INICIAR EL JUEGO: ");

        while (!salir){
            System.out.println("SELECCIONA UNA OPCION:");
            System.out.println("1. Shuffle");
            System.out.println("2. Head");
            System.out.println("3. Pick");
            System.out.println("4. Hand");
            System.out.println("5. Salir");
            try {
                System.out.println("SELECCIONE UNA OPCION:");
                opciones = scanner.nextInt();
                switch (opciones){
                    case 1:
                        deck.Shuffle();
                        break;
                    case 2:
                        deck.head();
                        break;
                    case 3:
                        deck.pick();
                        break;
                    case 4:
                        deck.hand();
                        break;
                    case 0:
                        salir = true;
                        System.out.println("TERMINA EL JUEGO");
                        break;
                    default:
                        throw new IllegalStateException("OPCION NO VALIDA " + opciones);
                }
            }
            catch (InputMismatchException e){
                System.out.println("¡¡¡OPCION NO VALIDA!!!");
                scanner.next();
            }
            catch (Exception a){
                a.printStackTrace();
            }
        }
    }
}
