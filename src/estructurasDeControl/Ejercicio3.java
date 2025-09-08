package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentar el menú
        System.out.println("=== MENÚ DE OPERACIONES ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        double num1, num2, resultado;

        switch (opcion) {
            case 1: // Suma
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;

            case 2: // Resta
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;

            case 3: // Multiplicación
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;

            case 4: // División
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}



