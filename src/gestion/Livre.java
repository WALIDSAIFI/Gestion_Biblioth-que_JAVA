package gestion;
import java.util.*;
import java.time.LocalDate;


public class Livre extends document{
	private  String titre;
	private  LocalDate dateDePublication;
	private  int nombreDePages;
	private  boolean  etat;
	private  String isbn;
	private String auteur;

	public Livre(String titre, int nombreDePages ,LocalDate DatePublication,String isbn,String auteur) {
		super(titre, nombreDePages,DatePublication);
		this.isbn = isbn;
		this.auteur=auteur;
		
	}

	 
	@Override
	public void afficherDetails() {
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------Livre------------------------");
		System.out.println("ID: " + this.getId()); 
		System.out.println("ISBN: "+ this.isbn + "\n");
		System.out.println("Titre : "+ this.titre + "\n");
		System.out.println("Date de publication : "+ this.dateDePublication + "\n");
		System.out.println("Nombre des page : "+ this.nombreDePages+ "\n");
		if(etat == false) {
			System.out.println("Ce Livre n'est pas emprunté. \n");
		}else{
			System.out.println("Ce Livre est  emprunté.\n");
		}
		System.out.println("--------------------------------------------------------");
	}
	
	
}
