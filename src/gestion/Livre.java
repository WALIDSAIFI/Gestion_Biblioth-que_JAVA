package gestion;

import java.util.Random;

public class Livre extends document{
	private String isbn;

	public Livre(String titre, int nombreDePages) {
		super(titre, nombreDePages);
		Random  ran = new Random();
		this.isbn = titre+ran;
		
	}

}
