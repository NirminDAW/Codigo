package com.mycompany.lacteos;

/**
 * La clase Queso representa un objeto queso con información sobre el tipo de leche, cantidad de leche y peso.
 */
public class Queso {
    /** El tipo de leche utilizada para hacer el queso. */
    String tipo_leche;
    /** La cantidad de leche utilizada para hacer el queso. */
    int cantidad_leche;
    /** El peso del queso en kilogramos. */
    double peso;

    /**
     * Constructor de la clase Queso.
     * @param tipo_leche El tipo de leche utilizada para hacer el queso.
     * @param cantidad_leche La cantidad de leche utilizada para hacer el queso.
     * @param peso El peso del queso en kilogramos.
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
     * Obtiene el tipo de leche del queso.
     * @return El tipo de leche del queso.
     */
    public String getTipo_leche() {
        return tipo_leche;
    }

    /**
     * Establece el tipo de leche del queso.
     * @param tipo_leche El nuevo tipo de leche del queso.
     */
    public void setTipo_leche(String tipo_leche) {
        this.tipo_leche = tipo_leche;
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















