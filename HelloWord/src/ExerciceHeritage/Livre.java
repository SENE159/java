package ExerciceHeritage;

public class Livre extends Document {

	protected String isbn;
	
	public Livre(String autheur, String titre, Integer anneeDeParution, String isbn) {
		super(autheur, titre, anneeDeParution);
		this.isbn = isbn;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
