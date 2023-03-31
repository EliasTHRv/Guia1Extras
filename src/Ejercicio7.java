
import java.util.Scanner;


/*Realice un programa que calcule y visualice el valor máximo, el 
valor mínimo y el promedio de n números (n>0). El valor de n se 
solicitará al principio del programa y los números serán introducidos 
por el usuario. Realice dos versiones del programa, una usando el bucle 
“while” y otra con el bucle “do - while”.
 * @author elias
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        int nNum, i;

        double proM, valMin, valMax, nuM, suM;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        nNum = leerN.nextInt();
        i = 1;
        proM = 0;
        suM = 0;
        valMin = Double.POSITIVE_INFINITY;
        valMax = Double.NEGATIVE_INFINITY;
        while (i <= nNum) {
            i++;
            System.out.println("Ingrese los numeros: ");
            nuM = leerN.nextDouble();
            suM += nuM;

            valMax = Math.max(valMax, nuM);
            valMin = Math.min(valMin, nuM);

        }
        proM = suM / nNum;
        System.out.println("El promedio de los numeros es: " + proM);
        System.out.println("El valor minimo es: " + valMin);
        System.out.println("El valor maximo es: " + valMax);
    }

}
