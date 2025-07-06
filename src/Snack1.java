
import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il primo numero da confrontare: ");
        int primoNumero = scan.nextInt();
        System.out.print("Inserisci il secondo numero da confrontare: ");
        int secondoNumero = scan.nextInt();
        if(primoNumero > secondoNumero){
            System.out.println("Il primo numero è maggiore del secondo");
        } else if (primoNumero < secondoNumero) {
            System.out.println("Il secondo numero è maggiore del primo");
        } else if (primoNumero == secondoNumero){
            System.out.println("I due numeri sono uguali");
        }
    }
}
