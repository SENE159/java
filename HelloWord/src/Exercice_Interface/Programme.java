package Exercice_Interface;


public class Programme {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		Personne jean = new Personne("jean");
		
		
		Vehicule mesVehicules[] = new Vehicule[3];
		
		mesVehicules[0] = new Voiture();
		mesVehicules[1] = new Avion();
		mesVehicules[2] = new Velo(30);
		
		for (Vehicule v : mesVehicules) {
			if(v instanceof AMoteur) {
				((AMoteur) v).faireLePlein();
			v.transporter(jean);
		}
		}
	}
}
	


