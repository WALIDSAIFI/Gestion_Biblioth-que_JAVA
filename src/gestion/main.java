package gestion;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {


     Livre livre1 = new Livre("Paulo Coelho", "L'Alchimiste", 208, LocalDate.of(1988, 4, 1), "978-0061122415");
        Livre livre2 = new Livre("George Orwell", "1984", 328, LocalDate.of(1949, 6, 8), "978-0451524935");

        // Création d'une instance de Bibliothèque
        Bibliotheque bibliotheque = new Bibliotheque();

        // Ajout des livres à la bibliothèque
        bibliotheque.ajouterDocument(livre1);
        bibliotheque.ajouterDocument(livre2);
        bibliotheque.afficherDocuments();

        console con = new console();
        con.afficherMenu();
    

    }

}
