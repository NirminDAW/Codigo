package com.mycompany.piramidejava;

import javax.swing.JOptionPane;

public class Piramidejava {

    // Revisamos si un número es entero
    public static boolean esEntero(String al) {
        try {
            Integer.parseInt(al);  // Si se puede convertir a entero, es entero
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String altura, base;
        int h = 0, b = 0;
        double volumen = 0;

        do {
            altura = JOptionPane.showInputDialog(null, "Inserta el valor de la altura");
            base = JOptionPane.showInputDialog(null, "Inserta el valor de la base: ");
        } while ((!esEntero(altura) || !esEntero(base)));  // Cambiamos || (OR) por && (AND) y negamos cada expresión

        h = Integer.parseInt(altura);
        b = Integer.parseInt(base);
        volumen = (double) ((h * b) / 3.0);  // Corregimos la fórmula del volumen
        String vol = "" + volumen;
        JOptionPane.showMessageDialog(null, "El volumen es: " + volumen);
    }
}

