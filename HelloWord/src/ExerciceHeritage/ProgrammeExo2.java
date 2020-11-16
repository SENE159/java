package ExerciceHeritage;

public class ProgrammeExo2 {

	public static void main(String[] args) {
		Adresse adresse = new Adresse(2,"Avenue Jean Perrin" ,"Villeneuve d'Ascq ",59650);
		Document documents[] = new Document[100];
		Livre leSeigneurDesAnneaux = new Livre("J.R.R Tolkien","The Lord Off the Rings",1954,"9782075134040");
        Article articleScientifique = new Article("Brian De Carrier, Joe Grand", "A hardeware-based memory acquisition procedure", 2004, "10.1016/j.diin.2003.12.001");
        
        documents[0] = leSeigneurDesAnneaux;
        documents[1] = articleScientifique;
        
        Bibliotheque b = new Bibliotheque("Lilliad",adresse,documents);
        
       b.afficherDocuments();
        
        
       
		}
       
	}


