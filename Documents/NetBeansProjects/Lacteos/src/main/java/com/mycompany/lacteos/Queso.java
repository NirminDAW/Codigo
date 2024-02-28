package com.mycompany.lacteos;

/**
 * Clase Queso para el software de gestión de productos lácteos.
 * Permite representar un queso con su tipo de leche, cantidad de leche utilizada y peso.
 * 
 * @author Nirmin
 * @version 1.0
 */
public class Queso {
    /** Tipo de leche utilizada para el queso. */
    private String tipo_leche;
    
    /** Cantidad de leche utilizada para la producción del queso. */
    private int cantidad_leche;
    
    /** Peso del queso en kilogramos. */
    private double peso;

    /**
     * Constructor de la clase Queso.
     * @param tipo_leche Tipo de leche utilizada.
     * @param cantidad_leche Cantidad de leche utilizada.
     * @param peso Peso del queso.
     */
    public Queso(String tipo_leche, int cantidad_leche, double peso) {
        this.tipo_leche = tipo_leche;
        this.cantidad_leche = cantidad_leche;
        this.peso = peso;
    }

    /**
     * Constructor por defecto de la clase Queso.
     */
    public Queso() {
    }

    /**
     * Método para obtener el tipo de leche utilizada para el queso.
     * @return El tipo de leche.
     */
    public String getTipo_leche() {
        return tipo_leche;
    }

    /**
     * Método para establecer el tipo de leche utilizada para el queso.
     * @param tipo_leche El tipo de leche a establecer.
     */
    public void setTipo_leche(String tipo_leche) {
        this.tipo_leche = tipo_leche;
    }

    /**
     * Método para obtener la cantidad de leche utilizada para el queso.
     * @return La cantidad de leche.
     */
    public int getCantidad_leche() {
        return cantidad_leche;
    }

    /**
     * Método para establecer la cantidad de leche utilizada para el queso.
     * @param cantidad_leche La cantidad de leche a establecer.
     */
    public void setCantidad_leche(int cantidad_leche) {
        this.cantidad_leche = cantidad_leche;
    }

    /**
     * Método para obtener el peso del queso.
     * @return El peso del queso en kilogramos.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método para establecer el peso del queso.
     * @param peso El peso del queso a establecer en kilogramos.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /**
     * Método para imprimir la información del queso.
     */
    public void imprimir() {
        System.out.println("QUESERÍA ARTESANA TALAVERA DE LA REINA");
        System.out.println("Registro Sanitario Nº 48/38751");
        System.out.println("Para consultar el lote del producto, revise la etiqueta");
        System.out.println("Peso: " + this.peso + " kg"); 
        System.out.println("Tipo de leche: " + this.tipo_leche);
        System.out.println("Cantidad de leche: " + this.cantidad_leche + " litros");
    }
}










