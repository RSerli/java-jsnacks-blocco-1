
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digitare la prima parola: ");
        String primaParola = scan.nextLine();
        System.out.print("Digitare la seconda parola: ");
        String secondaParola = scan.nextLine();
        System.out.println("Ecco qua le parole ordinate per lunghezza:");
        if (primaParola.length()>secondaParola.length()){
            System.out.println(primaParola);
            System.out.println(secondaParola);
        } else if (primaParola.length()<secondaParola.length()){
            System.out.println(secondaParola);
            System.out.println(primaParola);
        }else{
            System.out.println("Le tue due parole sono di ugual lunghezza");
        }
    }
}
