
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

        int valMin, valMax, nNum,valN, suM, i;
        double proM;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        nNum = leerN.nextInt();
        i = 1;

        while (i<=nNum) {
            i++;
            System.out.println("Ingrese los numeros: ");
            valN = leerN.nextInt();
            
            if (true) {
                System.out.println(Math.min(i, i));
            } else if (true){
            }
            else{
            }
            
        }

    }

}
