package es.discoduroderoer;

public class EjercicioArray3 {

	private int arr0[];
	private int media = 0;
	
	
	public static void main(String[] args) {
		EjercicioArray3 ej = new EjercicioArray3();
		ej.cargaArreglo();
		ej.calculaMedia();
		ej.calculaMediana();
		ej.calculaModa();
	}
	
	
	private void cargaArreglo(){
		arr0 = new int[100];
		
		for (int i = 0; i < arr0.length; i++) {
			
			arr0[i]= ((int) Math.floor(Math.random()*(0-100)*-1));
		}
		
		for (int j = 0; j < arr0.length; j++) {
			
		System.out.println( j + "["+ arr0[j] +"]");
		}
		
		
	}
	
	private void calculaMedia(){
		
	
		for (int i = 0; i < arr0.length; i++) {
			media = media + arr0[i];
		}
		
		
		System.out.println("La media del vector es: "+(media/arr0.length));
	}
	
	private void calculaMediana(){
		
		System.out.println("El valor de la mediana del vector es: " + arr0[arr0.length/2]);
		
	}
	
	private void calculaModa(){
		
		System.out.println("::Calcular Moda::");
		System.out.println("¿Cuantos numeros desea buscar? ");
		
		
		//int arr01[] = {8,9,10};
		
		
		for (int i = 0; i < arr0.length; i++) {
			for (int j = 0; j < arr0.length; j++) {
				if(arr0[i] == arr0[j]){
					
					
				} 
			}
		}
		
		
		System.out.println("La moda del vector es: ");
		
		
	}
}
