package gestion;

import java.util.Random;

public class Livre extends document{
	
	private String isbn;

	public Livre(String titre, int nombreDePages) {
		super(titre, nombreDePages);
		Random  ran = new Random();
		this.isbn = titre+ran.nextInt(100);
		
	}

	
	
	@Override
	public void afficherDetails() {
		System.out.println("-------------------------------------------------------");
		System.out.println("ISBN: "+ this.isbn + "\n");
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
