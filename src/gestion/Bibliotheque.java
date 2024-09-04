package gestion;
import java.util.*;
public class Bibliotheque {

    private List<document> documents;

    private Map<String, document> documentMap = new HashMap<>();

    public Bibliotheque(){

        this.documents = new ArrayList();
        
    }

 
    public void ajouterDocument(document Doc){
       this.documents.add(Doc);
       this.documentMap.put(Doc.titre,Doc);
    }
    public void emprunterDocument(int id) {
        document document = documentMap.get(id);
        System.out.println(document);
        if (document != null) {
            document.emprunter();
        } else {
            System.out.println("Document non trouvé.");
        }
    }    
    public void retournerDocument(int  id){
        String str = String.valueOf(id);
        
        document Document = documentMap.get(str);
        if(Document != null){
            Document.retourner();
        }else{
            System.out.println("Document non trouvé.");
        }
    }

    public void afficherDocuments() {
        for (document Document : documents) {
             Document.afficherDetails();  
        }
    }

    public document rechercherDocument(String id) {
        return documentMap.get(id);
    }

}
