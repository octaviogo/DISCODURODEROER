package es.discoduroderoer;

import java.util.Scanner;

public class EjercicioArray5 {


public static void main(String[] args) {
        
        //restamos La posicion mayor Z a la posicion menor (sumamos 1 para que no se quede un espacio de menos)
        char abecedario[]=new char[('Z'-'A')+1];
        
        //creamos el abecedario
        for(int i='A', indice=0;i<='Z';i++, indice++){
            abecedario[indice]=(char)i;
        }
        
        Scanner sn=new Scanner(System.in);
        
        //Pedimos un numero, que ser�n posiciones del array
        System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
        int num=sn.nextInt();
        
        String cadena="";
        
        while(num!=-1){
            
            //Comprobamos que el n�mero es correcto
            if(num>=0 && num<abecedario.length){
                
                cadena+=abecedario[num];
                System.out.println("Inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
            }else{
                System.out.println("Numero no valido inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
            }
            
            num=sn.nextInt(); //lo pedimos de nuevo
            
        }
        
        //Resultado final
        System.out.println("La cadena resultante es "+cadena);
        
    }
	
	
}
