package gestion;
import java.util.*;
import java.time.*;
public class Magazine extends document {
     private int numero;

	public Magazine(String titre,int nombreDePages,LocalDate dateDePublication,int numero){
		super(titre, nombreDePages, null);
		
	}

	@Override
	public void afficherDetails() {
		System.out.println("--------------------------------------------------------");
		System.out.println("-------------------------Magazine------------------------");
		System.out.println("Titre : "+ this.titre + "\n");
		System.out.println("Date de publication : "+ this.dateDePublication + "\n");
		System.out.println("Nombre des page : "+ this.nombreDePages+ "\n");
		System.out.println("--------------------------------------------------------");
	}
	
    	
	

}
