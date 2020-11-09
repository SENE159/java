package ExerciceAlgo3;

public  class Rectangle {

	
	private int x1;
	private int x2;
	private int y2;
	private int y1;
	
	public Rectangle(int x1, int y1, int x2 , int y2) {
	    this.x1 = 2;
	    this.y1 = 4;
	    this.x2 = 9;
	    this.y2 = 6;
		
		
	}
	public int Surface() {
		return ((this.x2 - this.x1) * (this.y2 - this.y1) );
	}
	public String toString() {
		return("Surface : " + Surface());
		
	}
	
}
