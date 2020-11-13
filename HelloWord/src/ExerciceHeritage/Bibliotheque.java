package ExerciceHeritage;

public class Bibliotheque extends Adresse {
	
	
	private String nom;
	private Adresse adresse;
	private Document [] documents;
	
	public Bibliotheque(Integer numero, String rue, String ville, Integer codePostal) {
		super(numero, rue, ville, codePostal);
		
	}

		
	public Bibliotheque(String Lilliad, Adresse adresse, Document[] documents) {
		super(Lilliad);
		






	}





		public void afficherDocuments() {
	}
	

}
