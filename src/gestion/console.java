package gestion;
import java.util.*;
public class console {
  
	private Bibliotheque bibliotheque;
	private Scanner scanner;

	public console(){
    this.bibliotheque = new Bibliotheque();
	this.scanner = new Scanner(System.in);
	}
	
	public void  afficherMenu() {

		while (true) {
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
					
					break;

			
				default:
					break;
			}



			
		}
	
	}

	public void ajouterDocument(){
		System.out.println("");
		System.out.print("Type de document (livre/magazine) : ");
		String type = scanner.nextLine();
		System.out.print("ID : ");
        String id = scanner.nextLine();
        System.out.print("Titre : ");
        String titre = scanner.nextLine();
        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();
        System.out.print("Date de publication (YYYY-MM-DD) : ");
         
        System.out.print("Nombre de pages : ");
        int nombreDePages = scanner.nextInt();
        scanner.nextLine();
		System.out.println("Entre la date de publication");
		String date =scanner.nextLine();
		if(type.equals("livre")){

			
		}
	}

}
