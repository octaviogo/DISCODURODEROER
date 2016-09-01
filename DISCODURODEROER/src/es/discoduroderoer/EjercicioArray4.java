package es.discoduroderoer;



public class EjercicioArray4 {

	private int ar0[];
	private int suma;
	
	public void llenaArreglo(){
		ar0 = new int [100];
		
		for (int i = 0; i < ar0.length; i++) {
			this.ar0[i] = i+1;
		}
		
		
	} 

	
	public void operacion(){
		 for (int i = 0; i < ar0.length; i++) {
			 System.out.println("los valores de la posicion [" + i + "] son: " +ar0[i]);  
			 suma = ar0[i] + suma;
		}
		
		 System.out.println("La suma del arreglo es: " + suma);
		 System.out.println("La media de los valores es " + (suma/ar0.length));
		 
		 
	}

	
	public static void main(String[] args) {
		EjercicioArray4 ej = new EjercicioArray4();
		ej.llenaArreglo();
		ej.operacion();
	}
	
}
