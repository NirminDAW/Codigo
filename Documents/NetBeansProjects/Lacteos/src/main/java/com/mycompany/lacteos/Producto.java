package com.mycompany.lacteos;

/**
 * Clase Queso para el software de gestión de productos lácteos.
 * Permite representar un queso con su tipo de leche, cantidad de leche utilizada y peso.
 * 
 * @author Nirmin
 * @version 1.0
 */
public class Producto {
    /** Tipo de leche utilizada para el queso. */
    private String tipo;
    
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
    public Producto(String tipo_leche, int cantidad_leche, double peso) {
        this.tipo = tipo_leche;
        this.cantidad_leche = cantidad_leche;
        this.peso = peso;
    }

    /**
     * Constructor por defecto de la clase Queso.
     */
    public Producto() {
    }

    /**
     * Método para obtener el tipo de leche utilizada para el queso.
     * @return El tipo de leche.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método para establecer el tipo de leche utilizada para el queso.
     * @param tipo El tipo de leche a establecer.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     * Método para imprimir_cabecera la información del queso.
     */
    public void imprimir_cabecera() {
        System.out.println("QUESERÍA ARTESANA TALAVERA DE LA REINA");
        System.out.println("Registro Sanitario Nº 48/38751");
        System.out.println("Para consultar el lote del producto, revise la etiqueta");
        imprimir_detalle(); 
    }

    private void imprimir_detalle() {
        System.out.println("Peso: " + this.getPeso() + " kg");
        System.out.println("Tipo de leche: " + this.getTipo());
        System.out.println("Cantidad de leche: " + this.getCantidad_leche() + " litros");
    }
}










