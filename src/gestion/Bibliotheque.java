package gestion;
import java.util.*;
public class Bibliotheque {

    private List<document> documents;

    private Map<String,document> documentMap;

    public Bibliotheque(){

        this.documents = new ArrayList();
        this.documentMap = new HashMap();
    }

 
    public void ajouterDocument(document Doc){
       this.documents.add(Doc);
       this.documentMap.put(Doc.titre,Doc);
    }
    public void emprunterDocumment(int id){
        document Document =documentMap.get(id);
        if(Document !=null){
            Document.emprunter();
        }else{
            System.out.println("Document non trouvé.");
        }

    }

    public void retournerDocument(String id){
        document Document = documentMap.get(id);
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
