package com.mycompany.lacteos;

/**
 * La clase Producto representa un objeto queso con información sobre el tipo de leche, cantidad de leche y peso.
 */
public class Producto {
    /** El tipo de leche utilizada para hacer el queso. */
    private String tipo;
    /** La cantidad de leche utilizada para hacer el queso. */
    private int cantidad_leche;
    /** El peso del queso en kilogramos. */
    private double peso;

    /**
     * Constructor de la clase Queso.
     * @param tipo_leche El tipo de leche utilizada para hacer el queso.
     * @param cantidad_leche La cantidad de leche utilizada para hacer el queso.
     * @param peso El peso del queso en kilogramos.
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
     * Obtiene el tipo de leche del queso.
     * @return El tipo de leche del queso.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de leche del queso.
     * @param tipo El nuevo tipo de leche del queso.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la cantidad de leche utilizada para hacer el queso.
     * @return La cantidad de leche utilizada para hacer el queso.
     */
    public int getCantidad_leche() {
        return cantidad_leche;
    }

    /**
     * Establece la cantidad de leche utilizada para hacer el queso.
     * @param cantidad_leche La nueva cantidad de leche utilizada para hacer el queso.
     */
    public void setCantidad_leche(int cantidad_leche) {
        this.cantidad_leche = cantidad_leche;
    }

    /**
     * Obtiene el peso del queso.
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















