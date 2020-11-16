package ExerciceHeritage;

public class Bibliotheque  {
	
	
	protected String nom;
	protected Adresse adresse;
	protected Document [] documents;
	


		public Bibliotheque(String nom, Adresse adresse, Document[] documents) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.documents = documents;
	}


		public void afficherDocuments() {
			int i = 0;
			while ( i < this.documents.length && this.documents[i] != null) {
				System.out.println(this.documents[i++]);
			
	}
		}
}



