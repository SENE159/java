package Exercice_Interface;

public class Velo extends Vehicule{
	
	Integer velo;

	public Velo(Integer velo) {
		super(velo);
		this.velo = velo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transporter(Personne p) {
		System.out.println("Jean transporte son vélo pour une réparation.");
		
	}

	

}
