package gestion;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.format.DateTimeParseException;

public abstract class document {
	
	protected int id;
	protected String auteur;
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
	
	public document(String auteur,String titre,int nombreDePages,LocalDate dateDePublication,boolean etat){
	    
		this.auteur=auteur;
		this.titre=titre;
		this.nombreDePages = nombreDePages;
		this.dateDePublication = dateDePublication;
		Random  ran = new Random(1000);
		this.id=ran.nextInt();
		this.etat = false;
		
	}
	/*
	 * la méthode pour emprunter un document
	 * 
	 * 
	 * */
	
	public abstract void emprunter();

	/*
	 *la méthode pour retourner un document
	 * 
	 * */
	public abstract void  retourner();
	
	
	public abstract void afficherDetails();


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
	
		this.titre = titre;
	}
	 
	 protected void SetnombreDePages(int nombre) {

		 this.nombreDePages = nombre;
	 }

	 protected void SetDatepublication(LocalDate Datepublication) {
	
		this.dateDePublication = Datepublication;
	}
	protected void SetAuteur(String auteur){
		this.auteur = auteur;
	}
	
	


}
