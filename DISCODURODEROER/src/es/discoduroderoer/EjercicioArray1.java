package es.discoduroderoer;
import java.util.Scanner;

public class EjercicioArray1 {

	int ar0[];
	Scanner teclado;
	
	
	public void cargaDatos(){
		teclado = new Scanner(System.in);
		ar0 = new int [10] ;
		
		for (int i = 0; i < ar0.length; i++) {
		System.out.println("Introduce el valor de la posicion " + i +" / "+ar0.length );
		 ar0[i] = teclado.nextInt(); 
		}
	}
	
	public void muestraDatos(){
		for (int i = 0; i < ar0.length; i++) {
		System.out.println("El valor de la posicion: " + i +" es: " + ar0[i]);	
		}
		
	} 
	
	public static void main(String[] args) {
		
		EjercicioArray1 ej = new EjercicioArray1();
		
		ej.cargaDatos();
		ej.muestraDatos();
		
	}
}
