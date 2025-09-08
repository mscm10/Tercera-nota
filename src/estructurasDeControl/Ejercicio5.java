package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio5 {

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int num = sc.nextInt();

        // Generar la tabla con ciclo for
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}


}
