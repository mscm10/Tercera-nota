package operadoreAritmeticos;
import java.util.Scanner;
public class ejercicio {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de los tres números es: " + media);

        scanner.close();
    }
}



