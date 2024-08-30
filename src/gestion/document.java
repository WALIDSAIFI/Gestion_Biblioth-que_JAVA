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
		
	}
	
	
	


}
