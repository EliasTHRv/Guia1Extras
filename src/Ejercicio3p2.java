
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Ejercicio3p2 {

    public static void main(String[] args) {

        String cad1, cad2, cad3, cad4, cad5;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();
        cad1 = "a";
        cad2 = "e";
        cad3 = "i";
        cad4 = "o";
        cad5 = "u";

        if (letra.equals(cad1)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

        if (letra.equals(cad2)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

        if (letra.equals(cad3)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

        if (letra.equals(cad4)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

        if (letra.equals(cad5)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
