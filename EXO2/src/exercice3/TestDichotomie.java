package exercice3;


interface Fonction {
	
	double appel(double x) ;
}

public class TestDichotomie {
	
	/* l’appel de la méthode */
	public static void main(String[] args) {
		
		// en utilisant une classe anonyme
		
		Fonction f = new Fonction() {

			public double appel(double x) {
				return Math.cos(x) - x;
			}
			
		} ;
		
		// l'autre methode pour utiliser l'interface fonctionnelle
		
		Fonction g = (x) -> {
			return Math.cos(x) - x;
			
		};
		double y = zero(f,0, 4, 1e-10);
		System.out.println(y);
	}
	
	static double zero(Fonction f, double a, double b, double epsilon) {
		
		
		if (f.appel(a) > 0) {
			
			double w = a; 
			a = b; 
			b = w;
		
		}
		
		while (Math.abs(b - a) > epsilon) {
			
			double c = (a + b) / 2;
			if (f.appel(c) < 0)
				a = c;
			else
				b = c;
		}
		
		return (a + b) / 2;
	}
	
	
}