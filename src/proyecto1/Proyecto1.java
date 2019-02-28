
package proyecto1;

import java.util.Scanner;


public class Proyecto1 {

    public static void main(String[] args) {
        
        int n ;
        Scanner lector = new Scanner(System.in);
       
        float contador=0, promedio=0, contadordesviacion =0, desviacion=0;
        
        
        
        
        
        
        System.out.println("ingrese la cantidad de valores: ");
        n = lector.nextInt();
        float[] valores = new float [n];
         
        for (int i=0;i<n; i++){
            System.out.println("ingrese un numero:");
            valores[i]= lector.nextFloat();
            contador+= valores[i];
        }
       promedio=contador/n;
       
       for (int i=0;i<n; i++){
         contadordesviacion+=Math.pow((valores[i]-promedio), 2.0);
         
         }
       
       desviacion=(float) Math.sqrt(contadordesviacion/(n-1));
       
       
        System.out.println("el promedio es: "+promedio);
        System.out.println("la desviacion es: "+desviacion);
        
       
    }
    
}
