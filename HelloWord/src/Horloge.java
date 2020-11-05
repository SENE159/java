
public class Horloge {

	Double  heure;
	Double minute;
	Double seconde;
	
		
	
	public Horloge(Double heure, Double minute, Double seconde) {
		
		this.heure = heure;
		this.minute = minute;
		this.seconde = seconde;
	}
	public Double getHeure() {
		return heure;
	}
	public void setHeure(Double heure) {
		this.heure = heure;
	}
	public Double getMinute() {
		return minute;
	}
	public void setMinute(Double minute) {
		this.minute = minute;
	}
	public Double getSeconde() {
		return seconde;
	}
	public void setSeconde(Double seconde) {
		this.seconde = seconde;
	}
	public void heure() {
		
		System.out.print("Horloge affiche l'heure : " + heure+"h"+" ");	
	}
	public void minute() {
		System.out.print(+ minute+"minutes"+"");	
		
	}
	public void seconde() {
		System.out.print(+ seconde+"secondes");	
		
	}
	
}
