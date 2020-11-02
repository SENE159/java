package Traitement_perso;
import java.util.ArrayList;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> array = new ArrayList<String>();
     
     array.add("momo");// get(0) pour afficher l'élement à l'indice 0 qui est "momo"
     array.set(0,"toto)"); // Modifie l'élement à l'indice 0 donc "toto" prend la place de "momo"
     
     array.add(0,"toto"); // Si on ajoute add "toto" à la place de "momo" l'indice 0 devient "toto" et "momo" prend l'indice 1
     
     System.out.println(array.get(0));
	}

}
