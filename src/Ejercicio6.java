
import java.util.Scanner;


/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int perS1, contador, nPer, contador2;
        double altuRa, promA, promB, sumaA, sumaB;
        contador = 1;
        contador2 = 1;
        promA = 0;
        promB = 0;
        sumaA = 0;
        sumaB = 0;
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        perS1 = leer.nextInt();

        do {
            contador = contador + 1;

            System.out.println("Ingrese la altura de las personas: ");
            altuRa = leer1.nextDouble();
            sumaB = sumaB + altuRa;
            promB = (sumaB/perS1);
        } while (contador <= perS1);
        if (altuRa < 1.6) {
                contador2 = contador2 +1;
                sumaA = sumaA + altuRa;
                promA = (sumaA/contador2);
            }
        System.out.println("El promedio de estaturas debajo de 1.6 es: " + promA);
        System.out.println("El promedio general de alturas es: " + promB);

    }

}
