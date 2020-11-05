package Class;

public class Voiture {
	
 public String marque;
 public String modele;
 public String couleur;
public Voiture() {
	
	
	
}
public Voiture(String couleur,String marque, String modele) {
	
	this.marque = marque;
	this.modele = modele;
	this.couleur = couleur;
	
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele = modele;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public void couleur() {
	System.out.println("La voiture que j'ai acheté est " + couleur);
	
}
public void marque() {
	System.out.println("La marque est " + marque);
	
}
public void modele() {
	System.out.println("La marque est " + modele);
	
}


	
}
 
 
	 
 
 
	 
	
		 
	


