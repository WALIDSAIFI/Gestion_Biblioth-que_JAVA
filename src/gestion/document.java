package gestion;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class document {
	
	protected int id;
	protected String titre;
	protected Date Date;
	protected int nombreDePages;
	protected boolean  etat;
	/**
	 * Constructeur de la classe Document.
	 *
	 * @param titre Le titre du document.
	 * @param nombreDePages Le nombre de pages du document.
	 */
	
	public document(String titre,int nombreDePages){
		this.Date = new Date();
		this.titre = titre;
		this.nombreDePages = nombreDePages;	
		long seed = System.currentTimeMillis();
		Random  ran = new Random(seed);
		this.id=ran.nextInt();
		this.etat = false;
	}
	/*
	 * la méthode pour emprunter un document
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
		System.out.println("-------------------------------------------------------");
		System.out.println("Titre : "+ this.titre + "\n");
		System.out.println("Date de publication : "+ this.Date + "\n");
		System.out.println("Nombre des page : "+ this.nombreDePages+ "\n");
		if(etat == false) {
			System.out.println("Ce document n'est pas emprunté. \n");
		}else{
			System.out.println("Ce document est  emprunté.\n");
		}
		System.out.println("--------------------------------------------------------");
	}
	/*les getters de class document */
	
	 protected int getId() {
		  return id;
	 }
	 
	 protected String getTitre() {
		  return titre;
	 }
	 
	 protected  SimpleDateFormat getDatepublication() {
		 return Date;
	 }
	
	 protected int getNombreDePages() {
		 return nombreDePages;
	 }
	 
	 /* les Setters de class document*/
	 
	 protected void setTitre(String titre) {
		 if(!titre.isEmpty()) {
		 this.titre = titre;
		 }
	 }
	 
	 protected void setnombreDePages(int nombre) {
		 if(nombre>0) {
			 this.nombreDePages = nombre;
		 }
	 }
	 
	


}
