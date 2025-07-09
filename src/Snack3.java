import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        /* VARIABILI */
        double sommaFinale = 0;
        Scanner scan = new Scanner(System.in);
        /* CORE */
        System.out.println("Inserire 10 numeri in seguenza e il softawre ti restituisce la somma");
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    System.out.print("Inserisci il primo numero: ");
                    break;
                case 2:
                    System.out.print("Inserisci il secondo numero: ");
                    break;
                case 3:
                    System.out.print("Inserisci il terzo numero: ");
                    break;
                case 4:
                    System.out.print("Inserisci il quarto numero: ");
                    break;
                case 5:
                    System.out.print("Inserisci il quinto numero: ");
                    break;
                case 6:
                    System.out.print("Inserisci il sesto numero: ");
                    break;
                case 7:
                    System.out.print("Inserisci il settimo numero: ");
                    break;
                case 8:
                    System.out.print("Inserisci il ottavo numero: ");
                    break;
                case 9:
                    System.out.print("Inserisci il nono numero: ");
                    break;
                case 10:
                    System.out.print("Inserisci il decimo numero: ");
                    break;
                default:
                    break;
            }
            double userValue = scan.nextDouble();
            sommaFinale = userValue + sommaFinale;
            System.out.println(sommaFinale);
        }
        System.out.print("La somma finale è "+ sommaFinale);
    }
}
