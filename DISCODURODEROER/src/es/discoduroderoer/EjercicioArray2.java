package es.discoduroderoer;
import java.util.Scanner;


public class EjercicioArray2 {
	
	private int tamano = 0;
	private int ar0[];
	private Scanner teclado;
	private int suma=0;
	
	public void cargaDatos(){
		teclado = new Scanner (System.in);
		System.out.println("Determinar dimension del Arreglo");
		this.tamano = teclado.nextInt(); 
	}
	
	private void llenaArreglo(int a , int b){
		ar0 = new int [tamano];
		System.out.println("Llenando arreglo...");
		for (int i = 0; i < ar0.length; i++) {
			this.ar0[i] = ((int)Math.floor(Math.random()*(a-b)+b));
		}
		
	}
	
	public void imprimeDatos(){
		for (int i = 0; i < ar0.length; i++) {
			System.out.println("El valor de la posicion: " + i +" es: " + ar0[i]);	
			}
	
		for (int i = 0; i < ar0.length; i++) {
			suma = ar0[i]+suma;
		}
		
		if (suma == 0){
			System.out.println("==Falla en llenado de Arreglo==");
		}
		else{
		System.out.println("La suma de todos los elementos es: " + suma);
	}
		}
	
	public static void main(String[] args) {
		
		EjercicioArray2 ej = new EjercicioArray2();
		ej.cargaDatos();
		ej.llenaArreglo(0,9);
		ej.imprimeDatos();
		
	}
	
}
