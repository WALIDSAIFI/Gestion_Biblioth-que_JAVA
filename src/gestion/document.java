package gestion;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.format.DateTimeParseException;

public abstract class document {
	
	protected int id;
	protected String titre;
	protected LocalDate dateDePublication;
	protected int nombreDePages;
	protected boolean  etat;

	
	/**
	 * Constructeur de la classe Document.
	 *
	 * @param titre Le titre du document.
	 * @param nombreDePages Le nombre de pages du document.
	 * 
	 * 
	 */
	
	public document(String titre,int nombreDePages,LocalDate dateDePublication){
	    
		SetTitre(titre);
		SetnombreDePages(nombreDePages);
		SetDatepublication(dateDePublication);
		Random  ran = new Random(1000);
		this.id=ran.nextInt();
		this.etat = false;
		
	}
	/*
	 * la méthode pour emprunter un document
	 * 
	 * 
	 * */
	
	protected void emprunter() {
		 this.etat = true;	 
	}
	/*
	 *la méthode pour retourner un document
	 * 
	 * */
	protected void retourner() {
		this.etat = false;
	}
	
	protected void afficherDetails() {
		
	}
	/*les getters de class document */
	
	 protected int getId() {
		  return id;
	 }
	 
	 protected String getTitre() {
		  return titre;
	 }
	 

	 protected int getNombreDePages() {
		 return nombreDePages;
	 }
	 
	 /* les Setters de class document*/
	 
	 protected void SetTitre(String titre) {
		Scanner scanner = new Scanner(System.in);
	
		while (titre.isEmpty()) {
			System.out.print("Veuillez entrer un titre valider !!!!: ");
			titre = scanner.nextLine();
	
		}
	
		this.titre = titre;
	}
	 
	 protected void SetnombreDePages(int nombre) {
		Scanner scanner = new Scanner(System.in);

		 while (nombre<0) {
			if(nombre<=0){
				System.out.print("Le nombre de pages doit être supérieur à 0. Veuillez essayer à nouveau : ");
				nombre = scanner.nextInt();
			}

		 }
		 this.nombreDePages = nombre;
	 }

	 protected void SetDatepublication(LocalDate Datepublication) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		boolean validDate = false;
	
		while (!validDate) {
			System.out.print("Entrez la date de publication (jj/MM/aaaa) : ");
			String input = scanner.nextLine();
	
			try {
				Datepublication = LocalDate.parse(input, formatter);
				validDate = true;  // Sort de la boucle si la date est valide
			} catch (DateTimeParseException e) {
				System.out.println("Format de date invalide. Veuillez réessayer.");
			}
		}
	
		this.dateDePublication = Datepublication;
	}
	
	


}
