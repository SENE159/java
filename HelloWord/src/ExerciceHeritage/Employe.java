package ExerciceHeritage;

public class Employe extends Personne{
	
	private String employeur;
	private String posteOccupe;
	
	
	public void sePresenter() {
		super.sePresenter();
		System.out.println("De plus je travaille "+this.employeur+ " en tant que "+ this.posteOccupe+".");
	}
		
	public Employe(String Durant, String Pierre, Integer age) {
		super(Durant, Pierre, 28);
		this.employeur = "EDF";
		this.posteOccupe = "Technicien";
		
	}

	}

	
	

	
		

	
	


