package gestion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
       /* Livre livre = new Livre("test", 20);
        
        livre.afficherDetails();*/
    	/*console con = new console();
    	con.afficherMenu();*/
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	String date = LocalDate.now().format(formatter);
        System.out.println(date);
    }

}
