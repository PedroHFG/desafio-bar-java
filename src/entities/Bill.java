package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	public double feeding() {
		return 5.0 * beer + 3.0 * softDrink + 7.0 * barbecue;
	}
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double total() {
		return ticket() + feeding() + cover();
	}

}
