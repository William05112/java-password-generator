package org.lessons.java.security;

// Importo lo scanner
import java.util.Scanner;

public class PasswordGenerator {
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
        
        // Raccolgo data di nascita per giorno/mese/anno separatamente
         System.out.println("Inserisci giorno di nascita");
        String giornoNascita = scanner.nextLine();
        

        System.out.println("Inserisci mese di nascita");
        String meseNascita = scanner.nextLine();
        

        System.out.println("Inserisci anno di nascita");
        String annoNascita = scanner.nextLine();
        

        // Sommo i tre interi 
        int sommaDate = Integer.parseInt(giornoNascita) + Integer.parseInt(meseNascita) + Integer.parseInt(annoNascita);

        // Scrivo l'output finale
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDate;
        System.out.println(password);

        // Chiudo lo scanner
        scanner.close();
    }
}








        





