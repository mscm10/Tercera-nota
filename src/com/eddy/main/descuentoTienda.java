package com.eddy.main;
import java.text.DecimalFormat;
public class descuentoTienda {
 
    // Formato para mostrar precios con dos decimales
    private static final DecimalFormat df = new DecimalFormat("#.00");

    // Método para aplicar descuento
    public static double aplicarDescuento(double precio, double porcentaje) {
        return precio * (1 - porcentaje);
    }

    public static void main(String[] args) {
        
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        double descuentoGeneral = 0.15;  // 15%
        double descuentoAdicional = 0.05; // 5% adicional

        double camisetaConDescuento = aplicarDescuento(precioCamiseta, descuentoGeneral);
        double pantalonConDescuento = aplicarDescuento(precioPantalon, descuentoGeneral);

        // Total con una camiseta y un pantalón
        double totalUnaCamisetaYPantalon = camisetaConDescuento + pantalonConDescuento;

        // Segunda camiseta con descuento adicional
        double segundaCamiseta = aplicarDescuento(camisetaConDescuento, descuentoAdicional);

        // Total con dos camisetas y un pantalón
        double totalDosCamisetasYPantalon = camisetaConDescuento + segundaCamiseta + pantalonConDescuento;

        // Mostrar resultados
        System.out.println("=== Promoción Tienda de Ropa ===");
        System.out.println("Precio original Camiseta: $" + df.format(precioCamiseta));
        System.out.println("Precio original Pantalón: $" + df.format(precioPantalon));
        System.out.println();
        System.out.println("Camiseta con 15% descuento: $" + df.format(camisetaConDescuento));
        System.out.println("Pantalón con 15% descuento: $" + df.format(pantalonConDescuento));
        System.out.println("➡ Total (1 camiseta + 1 pantalón): $" + df.format(totalUnaCamisetaYPantalon));
        System.out.println();
        System.out.println("Segunda camiseta (15% + 5% adicional): $" + df.format(segundaCamiseta));
        System.out.println("➡ Total (2 camisetas + 1 pantalón): $" + df.format(totalDosCamisetasYPantalon));
    }
}



