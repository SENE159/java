package ExerciceHeritage;

public class Personne {
	
	private String nom;
	private String prenom;
	private Integer age;
	
	public Personne (String Dupont,String Marc,Integer age) {
		this.nom = Dupont;
		this.prenom = Marc;
		this.age = age;

}
	public void sePresenter() {
	System.out.println("Je m'appele "+this.nom +" "+this.prenom+ " et j'ai " +this.age+" ans");	
		
}
}
