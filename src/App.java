// Importo lo scanner
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Creo un nuovo scanner 
        Scanner scanner = new Scanner(System.in);

        // Raccolgo nome 
        System.out.println("Inserisci il tuo nome");
        String nome = scanner.nextLine();
        
        // Raccolgo cognome
        System.out.println("Inserisci il tuo cognome");
        String cognome = scanner.nextLine();
        
        // Raccolgo colore preferito
        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = scanner.nextLine();
        
        // Raccolgo data di nascita per giorno/mese/anno separatamente e converto le stringe in numeri
         System.out.println("Inserisci giorno di nascita");
        String giornoNascitaStringa = scanner.nextLine();
        int giornoNascita = Integer.parseInt(giornoNascitaStringa);

        System.out.println("Inserisci mese di nascita");
        String meseNascitaStringa = scanner.nextLine();
        int meseNascita = Integer.parseInt(meseNascitaStringa);

        System.out.println("Inserisci anno di nascita");
        String annoNascitaStringa = scanner.nextLine();
        int annoNascita = Integer.parseInt(annoNascitaStringa);

        // Sommo i tre interi 
        int sommaDate = giornoNascita + meseNascita + annoNascita;

        // Scrivo l'output finale
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDate;
        System.out.println(password);








        

    }
}
