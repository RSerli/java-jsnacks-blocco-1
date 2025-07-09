import java.util.Scanner;

public class Snack5 {

    public static void main(String[] args) {
        /* VARIABILI */
        Scanner scan = new Scanner(System.in);
        /* CORE */
        System.out.println("Inserire 6 numeri interi in seguenza e il softawre ti restituisce la somma");
        for (int i = 1; i <= 6; i++) {
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
                default:
                    break;
            }
            int userValue = scan.nextInt();
            int moduloValue = userValue %2;
            if (moduloValue != 0){
                System.out.println("AAAARGH!!!! Numero dispari!");
            }
        }
    }
}
