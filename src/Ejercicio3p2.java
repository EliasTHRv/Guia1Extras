
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Ejercicio3p2 {

    public static void main(String[] args) {

        String cad1,cad2,cad3,cad4,cad5;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();
        cad1 = "a";
        cad2 = "e";
        cad3 = "i";
        cad4 = "o";
        cad5 = "u";

        if (letra.equals(cad1)||(letra.equals(cad2))||(letra.equals(cad3))||(letra.equals(cad4))||(letra.equals(cad5))) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
