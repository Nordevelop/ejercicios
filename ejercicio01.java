package misClases;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*Pedir Dato-numero (n)
		 * si es impar multiplicar x3 y sumar 1
		 * si es par dividir (n/2)
		 * Nordevelop
		 */
		int n=0;
		
		Scanner entra = new Scanner(System.in);
		while(n < 421) {
			System.out.println("ingrese un numero ");
			  n=entra.nextInt();
			  if (n%2==0) {
				 n= n/2;//si es par dividir (n/2)
				 System.out.println(n);			  
			 }
			  else
				 n=n*3+1; //si es impar multiplicar x3 y sumar 1
			     System.out.println(n);
			      
		}
		   

	}

}
