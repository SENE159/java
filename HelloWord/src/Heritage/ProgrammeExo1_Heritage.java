package Heritage;

import ExerciceHeritage.Employe;
import ExerciceHeritage.Personne;

public class ProgrammeExo1_Heritage {

	

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Dupont","Marc",17);
		Employe p2 = new Employe("Durant","Pierre",28);

		p1.sePresenter();
		p2.sePresenter();

	}

}
