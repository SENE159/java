package ExerciceCollections;

import java.util.List;

public class Carte implements Comparable<Carte>{
	
	
	private Integer numero;
	private String couleur;
	
	public Carte(String couleur,Integer numero) {
		this.couleur = couleur;
		this.numero = numero;
		
	}

	public  Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public int compareTo(Carte c) {
		if (this.getNumero() == c.getNumero()) {
			return 0;
		}else if (this.getNumero() < c.getNumero()) {
			return -1;
		}else {
			return 1;	
	}
			
	}

	public String toString() {
		return this.couleur + this.numero; 
}

	
		
		
	}

	
	

