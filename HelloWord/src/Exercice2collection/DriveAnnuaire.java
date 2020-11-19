package Exercice2collection;

public class DriveAnnuaire {

	public static void main(String[] args) {
		
		Personne martinJean = new Personne("Martin","Jean");
		Personne durantPierre = new Personne("Durant","Pierre");
		Personne dupontMarie = new Personne("Dupont","Marie");
		
		NumeroTelephone numero1 = new NumeroTelephone("0612345678");
		NumeroTelephone numero2 = new NumeroTelephone("0652369574");
		
		Annuaireinverse annuaire = new Annuaireinverse();
		annuaire.ajouter(numero1,martinJean);
		annuaire.ajouter(numero2,durantPierre);
		
		System.out.println("Affichage avant l'ajout du numero déjà present:");
		System.out.println(annuaire);
		System.out.println();
		
		annuaire.ajouter(numero1, dupontMarie);
		System.out.println("Affichage aprés l'ajout du numero déjà present:");
		System.out.println(annuaire);
		System.out.println();
		
		System.out.println("Recuperation de la personne avec le numero 2:");
		System.out.println(annuaire.chercher(numero2));
		System.out.println();
		
		annuaire.supprimer(numero2);
		System.out.println("Affichage aprés la suppression du numero2:");
		System.out.println(annuaire);
		System.out.println();

	
	}

}
