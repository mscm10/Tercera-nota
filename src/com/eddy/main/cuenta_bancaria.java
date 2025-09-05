package com.eddy.main;
import java.text.DecimalFormat;

public class cuenta_bancaria {
    
    private static final DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        // Datos iniciales
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasEnUnMes = 4;

        // Cálculo total retirado
        double totalRetirado = retiroSemanal * semanasEnUnMes;

        // Saldo final
        double saldoFinal = saldoInicial - totalRetirado;

        // Mostrar resultados
        System.out.println("=== Simulación de Cuenta Bancaria ===");
        System.out.println("Saldo inicial: $" + df.format(saldoInicial));
        System.out.println("Retiro semanal: $" + df.format(retiroSemanal));
        System.out.println("Semanas en un mes: " + semanasEnUnMes);
        System.out.println("Total retirado en el mes: $" + df.format(totalRetirado));
        System.out.println("➡ Saldo final en la cuenta: $" + df.format(saldoFinal));
    }
}



