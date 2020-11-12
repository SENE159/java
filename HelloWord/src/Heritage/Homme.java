package Heritage;

public class Homme {

	private Integer age;
	private Double taille;
	private Double poids;
	private String nom;
	
	
	public Homme() {
		
	}
	public Homme(String nom, Integer age, Double poids,Double taille) {
		this.nom = nom;
		this.age = age;
		this.poids = poids;
		this.taille = taille;
	}
	

	public String parler() {
		return "L'heure de pause du déjeuner est prévu 12h";
	
}
	public String manger() {
		return "Le repas est à prendre au resto";
}  
	public String boire() {
		return "Pas d'alcool au volant";
}
	public void dort() {
		
}
	
		
}
	
