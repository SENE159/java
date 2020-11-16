package ExerciceHeritage;

public class Article extends Document{

	protected String doi;
	protected String Autheur;
	protected String titre;

	
	public Article(String autheur, String titre, Integer anneeDeParution2, String doi) {
		super(autheur, titre, anneeDeParution2);
		this.doi = doi;
		Autheur = autheur;
		titre = titre;
	}

	@Override
	public String toString() {
		return super.toString()+" (DOI = "+this.doi+")";
	}


	
		
	
}
