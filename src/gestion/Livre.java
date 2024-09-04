package gestion;
import java.util.*;
import java.time.LocalDate;


public class Livre extends document{
	private String isbn;

    public Livre(String auteur, String titre, int nombreDePages, LocalDate dateDePublication, boolean etat, String isbn) {
        super(auteur, titre, nombreDePages, dateDePublication, etat);
        this.isbn = isbn;
    }

	 
	@Override
	public void afficherDetails() {
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------Livre-------------------------");
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


	@Override
	public void emprunter(){
		this.etat =true;
	}

	@Override

	public void retourner(){
		this.etat=false;
	}
	
	
}
