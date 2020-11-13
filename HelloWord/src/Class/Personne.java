package Class;

public class Personne {

	 String nom;
	 String prenom;
	 Integer age;
	 String sexe;
	 String adresse;
	
	public Personne(String nom,String prenom,Integer age,String sexe,String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.sexe = sexe;
		this.adresse = adresse;
		
	}
   public Personne() {
		
	}
   public void setNom(String nom) {
	   this.nom = nom;
   }
   public  String getNom(){
	   return nom;
   }   
     
   public void setPrenom(String prenom) {
	   this.prenom = prenom;
  
}
   public String getPrenom(){
	   return prenom;			
	}
   public void setAge(Integer prenom) {
	   this.age = age;
  
}
   public Integer getAge(){
	   return age;	
   }
  public void setSexe(String sexe) {
		   this.sexe = sexe; 
   
	 }
   public String getsexe(){
	   return sexe;	 	
}
   public void setAdresse(String adresse) {
	   this.adresse = adresse; 

 }
   public String getAdresse(){
	   return adresse;	
	 	
	 }
public void sePresenter() {
	System.out.println("Bonjou,M." +nom +" "+ prenom +" j'ai "+ age+ " ans et je vis au " + adresse);
	
}
public void jouer() {
	System.out.println("Je joue au club de tennis de ma Région.");
	
	
}
public void dormir() {
	System.out.println("Je me couche tous les soirs à 22h.");
	
}
public void travailler() {
	System.out.println("Je travaille à l'hopital de Jean d'Arc.");
	
}

}

	





