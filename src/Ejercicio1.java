
import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejercicio1 {
   public static void main(String[] args){
       
       int dias, horas, minutos, horas2;
       Scanner leer = new Scanner(System.in);
      
       System.out.println("Ingrese la cantidad de minutos a convertir: ");
       
       minutos = leer.nextInt();
       
       horas = minutos/60;
       dias = horas/24;
       horas2 = horas % 24;
       
       System.out.println(minutos + " minutos equivalen a: " + dias + " dia/s "+ " y " + horas2 + " hora/s" );
        
   }
}
