package fr.esipe.tp1 ;
import java.util.Scanner;

public class Calc {
    	
    	public static void afficherResultatOperation(char operateur, int a, int b) {
    		var res = "Result " ;
    		
    		if(operateur == '+') {
    			System.out.println(res + "addition :") ;
    			System.out.println(a + b) ;
    		} else if(operateur == '-') {
    			System.out.println(res + "difference :") ;
    			System.out.println(a - b) ;
    		} else if(operateur == '*') {
    			System.out.println(res + "product :") ;
    			System.out.println(a * b) ;
    		} else if(operateur == '/') {
    			System.out.println(res + "quotient :") ;
    			System.out.println(a / b) ;
    		} else if(operateur == '%') {
    			System.out.println(res + "modulo :") ;
    			System.out.println(a % b) ;
    		} else {
    			throw new IllegalArgumentException("Invalid operation. Valids choices are : +, -, *, / or %") ;
    		}
    	}
    	
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in) ;
    		
    		System.out.println("Saisir un entier a $>") ;
    		
    		int a = scanner.nextInt() ;
    		
    		System.out.println("Saisir un entier b $>") ;
    		
    		int b = scanner.nextInt() ;
    		
    		afficherResultatOperation('+', a, b) ;
    		afficherResultatOperation('-', a, b) ;
    		afficherResultatOperation('*', a, b) ;
    		afficherResultatOperation('/', a, b) ;
    		afficherResultatOperation('%', a, b) ;
    		
    		scanner.close() ;
    	}
}
