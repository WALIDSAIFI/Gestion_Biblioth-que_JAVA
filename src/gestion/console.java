package gestion;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class console {
  
	private Bibliotheque bibliotheque;


	public console(){
    this.bibliotheque = new Bibliotheque();
	}
	
	public void  afficherMenu() {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-------------------------------------------------------");
			System.out.println("-------------------------------------------------------");
			System.out.println("1-Ajouter un document\n");
			System.out.println("2-Emprunter un document\n");
			System.out.println("3-Retourner un document\n");
			System.out.println("4-Afficher tous les documents\n");
			System.out.println("5-Rechercher un document\n");
			System.out.println("6-Quitter\n");
			System.out.println("Veuillez entrer votre choix (1-6) : ");
			int choix = scanner.nextInt();

			switch (choix) {
                case 1:
                    ajouterDocument();
                    break;
                case 2:
                    emprunterDocument();
                    break;
                case 3:
                    retournerDocument();
                    break;
                case 4:
                     afficherDetailsDocument();
                    break;
                case 5:
                    rechercherDocument();
                    break;
                case 6:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Choix invalide.");
            }

			
		}
	
	}

	public void ajouterDocument() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("Type de document (1-livre / 2-magazine) : ");
		int type = scanner.nextInt();
	
		if (type == 1 || type == 2) {
	
			scanner.nextLine();
			System.out.println("Auteur : ");
			String auteur = scanner.nextLine();
	
			
			System.out.println("Titre : ");
			String titre = scanner.nextLine();

			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = null;
	
			while (date == null) {
				

				System.out.println("Date de publication (JJ/MM/AAAA) : ");
				String dateInput = scanner.nextLine();
	
				try {
					date = LocalDate.parse(dateInput, formatter);
				} catch (DateTimeParseException e) {
					System.out.println("Format de date invalide. Veuillez entrer une date au format JJ/MM/AAAA.");
				}
			}

		
	
			System.out.print("Nombre de pages : ");
			int nombreDePages = scanner.nextInt();
			scanner.nextLine();
	
			if (type == 1) {
				System.out.println("ISBN :");
				String isbn = scanner.nextLine();
				Livre livre = new Livre(auteur, titre, nombreDePages, date, false, isbn);
				bibliotheque.ajouterDocument(livre);
			} else if (type == 2) {
				System.out.print("Numéro : ");
				int numero = scanner.nextInt();
				scanner.nextLine(); 
	
				Magazine magazine = new Magazine(auteur, titre, nombreDePages, date, false, numero);
				bibliotheque.ajouterDocument(magazine);
			}
		} else {
			System.out.println("Type de document invalide. Veuillez entrer 'livre' ou 'magazine'.");
		}
	}
	


	private void emprunterDocument() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("ID du document à emprunter : ");
        int  id = scanner.nextInt();

        bibliotheque.emprunterDocumment(id);
    }

    private void retournerDocument() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("ID du document à retourner : ");
        String id = scanner.nextLine();
        bibliotheque.retournerDocument(id);
    }

    private void rechercherDocument() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("ID du document à rechercher : ");
        String id = scanner.nextLine();
        bibliotheque.rechercherDocument(id);
    }

	public void afficherDetailsDocument(){
		bibliotheque.afficherDocuments();
	}

}
