package Exercice_Interface;

	public abstract class Vehicule {
		
		protected static Integer vitesse;
		public Integer Vehicule;
		
		
public Vehicule(Integer vitesse) {
			
			this.setVitesse(vitesse);
		}

	public abstract void transporter(Personne p);

	public Integer getVitesse() {
		return vitesse;
	}

	public void setVitesse(Integer vitesse) {
		this.vitesse = vitesse;
	}
	
}
