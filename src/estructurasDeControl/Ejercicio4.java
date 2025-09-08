package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número al usuario
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();

        long factorial = 1; // Usamos long por si el número es grande
        int i = 1;

        // Ciclo while para calcular el factorial
        while (i <= num) {
            factorial *= i; // factorial = factorial * i
            i++;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);

        sc.close();
    }
}



