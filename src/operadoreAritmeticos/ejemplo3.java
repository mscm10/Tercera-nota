package operadoreAritmeticos;
import java.util.Scanner;
public class ejemplo3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una línea de texto: ");
        String linea = scanner.nextLine();

        System.out.println("Línea de texto leída: " + linea);
        scanner.close();
    }
}


