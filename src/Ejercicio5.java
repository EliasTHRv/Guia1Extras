
import java.util.Scanner;


/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio
 */
public class Ejercicio5 {
    public static void main(String[] args){
        String socio,A,B;
        int costo;
        double pre1, pre2;
        Scanner letra = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio(A o B)");
        socio = letra.nextLine();
        System.out.println("Ingrese costo del tratamiento");
        costo = letra.nextInt();
      
      
        pre1=((costo*50)/100);
        pre2=((costo*35)/100);
        
        if (socio.equalsIgnoreCase("A")) {
            System.out.println("El costo del tratamiento con desccuento socio A: $"+(costo - pre1));
            
        }
        if (socio.equalsIgnoreCase("B")) {
            System.out.println("El costo del tratamiento con desccuento socio B: $"+(costo - pre2));
            
        }
        
        
    }
}
