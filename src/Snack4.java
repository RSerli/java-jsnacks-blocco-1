import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
    /*
     * VARIABILI
     */
    String[] elencoInvitati = {
            "Leonardo DiCaprio",
            "Marie Curie",
            "Cristiano Ronaldo",
            "Elon Musk",
            "Frida Kahlo",
            "Albert Einstein",
            "Taylor Swift",
            "Usain Bolt",
            "Emma Watson",
            "Barack Obama",
            "Oprah Winfrey",
            "Pablo Picasso",
            "Ada Lovelace",
            "Michael Jordan",
            "Greta Thunberg",
            "Stephen Hawking",
            "Beyoncé Knowles",
            "Nelson Mandela",
            "Angelina Jolie",
            "Mark Zuckerberg"
        };
    Boolean isInTheList = false;
     /*
      * CORE
      */
    System.out.println("BENVENUTI ALLA FESTA DEL GRANDE GATSBY!");
    System.out.print("Inserite il nome: ");
    String nomeInvitato = scan.nextLine();
    // controllo presenza invitato-a nella lista
    for (int i = 0; i < elencoInvitati.length; i++) {
        if (nomeInvitato.equals(elencoInvitati[i])){
            isInTheList = true;
        }
    }
    /*
     * OUTPUT
     */
    if (isInTheList) {
        System.out.println("Entri pure " + nomeInvitato);
    }else {
        System.out.println("Il suo nome non è presente nella lista! Vadia via! Non sei degno!");
    }
    }
}
