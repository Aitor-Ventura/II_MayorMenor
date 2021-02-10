import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        mayor();
    }    
    
    // Método  a modificar. Debe leer dos números enteros
    // y mostrar en pantalla el mayor 
    public static void mayor () {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame un número entero: ");
        int num1 = input.nextInt();
        System.out.print("Dame otro número entero: ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.print("El mayor de los dos números es: " + num1);
        } else {
            System.out.print("El mayor de los dos números es: " + num2);
        }
    }
}
