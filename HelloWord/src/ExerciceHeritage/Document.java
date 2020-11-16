package ExerciceHeritage;

public abstract class Document  {
	
	
	protected String Autheur;
	protected String titre;
	protected Integer anneeDeParution;

	
	
public Document(String autheur, String titre, Integer anneeDeParution2) {
		super();
		Autheur = autheur;
		this.titre = titre;
		this.anneeDeParution = anneeDeParution;
	}


public String toString() {
	return this.titre+" de "+this.Autheur+" paru en "+this.anneeDeParution;
}


}
