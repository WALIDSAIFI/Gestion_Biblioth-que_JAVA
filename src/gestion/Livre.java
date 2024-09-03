package gestion;
import java.util.*;
public class Livre extends document{
	
	private String isbn;

	public Livre(String titre, int nombreDePagesnDate ,Date DatePublication,String isbn) {
		super(titre, nombreDePagesnDate,DatePublication);
		this.isbn = isbn;
		
	}

	 
	@Override
	public void afficherDetails() {
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------Livre------------------------");
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
