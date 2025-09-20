package operadoresPreguntas;

import java.util.Scanner;

public class Project {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("ingrese la cantidad de productos que quiere ingresar al inventario");
        byte cantidadProductos = input.nextByte();
        int cantidad[] = new int[cantidadProductos];
        String nombres[] = new String[cantidadProductos];
        double precios[] = new double[cantidadProductos];
        double total[] = new double[cantidadProductos];
        double contador = 0;
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1));
            nombres[i] = input2.nextLine();

            System.out.println("Ingrese la cantidad del producto " + (i + 1));
            cantidad[i] = input.nextInt();

            System.out.println("Ingrese el precio del producto " + (i + 1));
            precios[i] = input.nextDouble();

        }
        for (int i = 0; i < precios.length; i++) {
            System.out.println("El producto es: " + nombres[i]);
            System.out.println("El valor total del stock del producto es: " + (cantidad[i] * precios[i]));
            total[i] = cantidad[i] * precios[i];
            contador = contador + (cantidad[i] * precios[i]);

        }
        System.out.println("reporte final ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto: " + nombres[i] + "-" + "Cantidad: " + cantidad[i] + "-"
                    + "Precio por unidad: " + precios[i] + "-" + "Valor total: " + total[i]);

        }
        System.out.println("valor total del inventario: " + contador);
        System.out.println("¿desea actualizar la cantidad de un producto?");
        String actualizar = input2.nextLine();
        if (actualizar.equalsIgnoreCase("si")) {
            contador = 0;
            System.out.println("que producto desea actualizar");
            actualizar = input2.nextLine();
            for (int i = 0; i < total.length; i++) {
                if (nombres[i].equalsIgnoreCase(actualizar)) {
                    System.out.println("ingrese la nueva cantidad del producto " + nombres[i]);
                    cantidad[i] = input.nextInt();
                    total[i] = cantidad[i] * precios[i];

                }
            }
            System.out.println("reporte final ");
            for (int i = 0; i < precios.length; i++) {
                System.out.println("Producto: " + nombres[i] + "-" + "Cantidad: " + cantidad[i] + "-"
                        + "Precio por unidad: " + precios[i] + "-" + "Valor total: " + total[i]);
                contador = contador + (cantidad[i] * precios[i]);
            }
            System.out.println("valor total del inventario: " + contador);
        } else {
            System.out.println("programa finalizado");
        }
        input.close();
        input2.close();

    }
}

    

