package fr.esipe.tp1 ;

public class PrintArgs {
	
	public static void afficherArgsBoucleClassique(String[] args) {
		System.out.println("boucle classique");
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]) ;
		}
	}
	
	public static void afficherArgsBoucleForeach(String[] args) {
		System.out.println("Boucle :");
		 
		for(var i: args)
		{
			System.out.println(i) ;
		}
	}

	public static void main(String[] args) {
		if(args.length <= 0) {
			throw new NullPointerException("Usage : saisir au moins 1 argument") ;
		}
		
		System.out.println("Premier arg") ;
		System.out.println(args[0]) ;
		
		afficherArgsBoucleClassique(args) ;
		
		afficherArgsBoucleForeach(args) ;
		
		
	}
}
