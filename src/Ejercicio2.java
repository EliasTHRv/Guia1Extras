/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ejercicio2 {
    public static void main(String[] args){
    
        int A,B,C,D, aux;
        
        A = 5;
        B = 9;
        C = 3;
        D = 12;
        System.out.println("Valor de A: "+ A);
        System.out.println("Valor de B: "+ B);
        System.out.println("Valor de C: "+ C);
        System.out.println("Valor de D: "+ D);
        
        aux = B;
        B = C;
        C = A;
        A = D; 
        D = aux;
       
        System.out.println(" ");
        System.out.println("Valor de A: "+ A);
        System.out.println("Valor de B: "+ B);
        System.out.println("Valor de C: "+ C);
        System.out.println("Valor de D: "+ D);
        
    }
}
