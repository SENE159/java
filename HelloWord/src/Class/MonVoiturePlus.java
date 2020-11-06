package Class;

public class MonVoiturePlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture v1 = new Voiture("Rose","Renault","Clio 4");
		Voiture v2 = new Voiture("Blanche","BMW","Serie 5");
		
		VoitureRoue roue1 = new VoitureRoue();
		VoitureRoue roue2 = new VoitureRoue();
		VoitureRoue roue3 = new VoitureRoue();
		VoitureRoue roue4 = new VoitureRoue();
		
		VoiturePorte portiere1 = new VoiturePorte();
		VoiturePorte portiere2= new VoiturePorte();
		VoiturePorte portiere3 = new VoiturePorte();
		VoiturePorte portiere4 = new VoiturePorte();
		
		VoitureMoteur moteur = new VoitureMoteur();
		
		
		
		v1.couleur();
		v1.marque();
		v1.modele();
		
		v2.couleur();
		v2.marque();
		v2.modele();
		
		
		
	}

}
