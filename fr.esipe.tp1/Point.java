package fr.esipe.tp1 ;
import java.lang.Integer ;

public record Point(int x, int y) {
	
	private long carre(int x) { // je la met en private car on a pas besoin d'y accéder à l'extérieur de ce record
		return x * x ;
	}
	
	public double distance(Point other) {
		return Math.sqrt(carre(x - other.x) + carre(y - other.y)) ;
	}
	
	public void afficherPoint() {
		System.out.println("x=" + x + "," + "  " + "y=" + y) ;
		System.out.println(this.toString()) ;
	}
	

	public static void main(String[] args) {
		if(args.length < 2) {
			throw new NullPointerException("Usage : 2 arguments x et y") ;
		}
		
		Point p = new Point(Integer.parseInt(args[0]), Integer.parseInt(args[1])) ;
		p.afficherPoint() ;
		
		Point o = new Point(0, 0) ; // point � l'origine (0, 0)
		System.out.println("dist = " + o.distance(p)) ;
	}
}
