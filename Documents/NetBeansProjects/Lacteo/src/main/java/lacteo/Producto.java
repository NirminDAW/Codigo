package lacteo;
/**
 * Clase Producto para el software de gestión de productos lacteos
 * @author Nirmin
 */
public class Producto {
    /**
     * Tipo de leche con la que se hace el queso
     */
private String tipo;

/**
 * Cantidad de leche del queso medido en litros
 */
private int cantidad_leche;
/**
 * Peso del queso medido en gramos
 */
private double peso;
/**
 * Metodo constructor con todos los parametros para la clase queso
 * @param tipo_leche de leche que tendra el queso
 * @param cantidad_leche para hacer el queso
 * @param peso final del queso
 */
    public Producto(String tipo_leche, int cantidad_leche, double peso) {
        this.tipo = tipo_leche;
        this.cantidad_leche = cantidad_leche;
        this.peso = peso;
    }
    /**
     * Metodo constructor sin parametros para la clase queso
     */
    public Producto() {
    }
    /**
     * Obtiene el tipo de leche
     * @return Tipo de leche
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Establece el tipo de leche
     * @param tipo Nuevo tipo de leche
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Obtiene la cantidad de leche
     * @return Cantidad de leche
     */
    public int getCantidad_leche() {
        return cantidad_leche;
    }
    /**
     * Establece la cantidad de leche
     * @param cantidad_leche Nueva cantidad de leche
     */
    public void setCantidad_leche(int cantidad_leche) {
        this.cantidad_leche = cantidad_leche;
    }
    /**
     * Obtiene el peso de la leche
     * @return Peso de la leche
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Establece el peso de la leche
     * @param peso Nuevo peso la leche
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /**
     * Metodo que nos permite imprimir_cabecera la etiqueta con los datos de fabricacion
 del queso
     */
public void imprimir_cabecera () {
System.out.println("QUESERÍA ARTESANA TALAVERA DE LA REINA");
System.out.println("Registro Sanitario Nº 48/38751");
System.out.println("Para consultar el lote del producto revise la etiqueta");
        imprimir_detalle();
}

    private void imprimir_detalle() {
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Tipo de leche: " + this.getTipo());
        System.out.println("Cantidad de leche: " + this.getCantidad_leche());
    }
    
    
}
















