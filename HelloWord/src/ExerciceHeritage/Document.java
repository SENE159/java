package ExerciceHeritage;

public abstract class Document  {
	
	
	protected String Autheur;
	protected String titre;
	protected Integer anneeDeParution;
	    
	public String toString() {
		return "titre" + titre +"Autheur"+ Autheur + "anneeDeParution"+ anneeDeParution;
}
}
