package gestion;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class document {
	
	protected int id;
	protected String titre;
	protected SimpleDateFormat Date;
	protected int nombreDePages;
	protected boolean  etat;
	
	
	public document(String titre,int nombreDePages){
		this.Date = new SimpleDateFormat("dd/MM/yyyy");
		this.titre = titre;
		this.nombreDePages = nombreDePages;	
		long seed = System.currentTimeMillis();
		Random  ran = new Random(seed);
		this.id=ran.nextInt();
		this.etat = false;
	}
	
	
	protected void emprunter() {
		 this.etat = true;	 
	}
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
	
	
	


}
