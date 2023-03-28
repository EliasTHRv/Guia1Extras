
import java.util.Scanner;

/**
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano
 */
public class Ejercicio4 {
    public static void main(String[] args){
        int num1;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10: ");
        
        num1 = leerN.nextInt();
        
        if (num1==1) {
            System.out.println("El numero romano es: I");
           }
        if (num1==2) {
            System.out.println("El numero romano es: II");
           }
        if (num1==3) {
            System.out.println("El numero romano es: III");
           }
        if (num1==4) {
            System.out.println("El numero romano es: IV");
           }
        if (num1==5) {
            System.out.println("El numero romano es: V");
           }
        if (num1==6) {
            System.out.println("El numero romano es: VI");
           }
        if (num1==7) {
            System.out.println("El numero romano es: VII");
           }
        if (num1==8) {
            System.out.println("El numero romano es: VIII");
           }
        if (num1==9) {
            System.out.println("El numero romano es: IX");
           }
        if (num1==10) {
            System.out.println("El numero romano es: X");
           }
    }
}
