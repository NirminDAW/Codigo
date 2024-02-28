package com.mycompany.cilindro;

import javax.swing.JOptionPane;

/**
 * Clase que representa un cilindro en el espacio tridimensional.
 */
class Cilindro {
    private double radio;
    private double altura;
    
    /**
     * Constructor para crear un cilindro con un radio y una altura específicos.
     * 
     * @param radio El radio del cilindro.
     * @param altura La altura del cilindro.
     */
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    /**
     * Obtiene el radio del cilindro.
     * 
     * @return El radio del cilindro.
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * Establece el radio del cilindro.
     * 
     * @param radio El nuevo radio del cilindro.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * Obtiene la altura del cilindro.
     * 
     * @return La altura del cilindro.
     */
    public double getAltura() {
        return altura;
    }
    
    /**
     * Establece la altura del cilindro.
     * 
     * @param altura La nueva altura del cilindro.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Calcula el área superficial del cilindro.
     * 
     * @return El área superficial del cilindro.
     */
    public double calcularArea() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
    }
    
    /**
     * Calcula el volumen del cilindro.
     * 
     * @return El volumen del cilindro.
     */
    public double calcularVolumen() {
        return Math.PI * radio * radio * altura;
    }

    /**
     * Crea un cilindro solicitando al usuario ingresar el radio y la altura.
     * 
     * @return Un nuevo objeto Cilindro con el radio y la altura ingresados por el usuario.
     */
    public static Cilindro crearCilindro() {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cilindro:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro:"));
        return new Cilindro(radio, altura);
    }

    /**
     * Método principal que crea tres cilindros, calcula sus volúmenes y áreas,
     * y determina cuál de ellos tiene el menor volumen.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Creamos tres cilindros
        Cilindro cilindro1 = crearCilindro();
        Cilindro cilindro2 = crearCilindro();
        Cilindro cilindro3 = crearCilindro();

        // Imprimimos el volumen y área de cada cilindro
        System.out.println("Cilindro 1: Volumen=" + cilindro1.calcularVolumen() + ", Área=" + cilindro1.calcularArea());
        System.out.println("Cilindro 2: Volumen=" + cilindro2.calcularVolumen() + ", Área=" + cilindro2.calcularArea());
        System.out.println("Cilindro 3: Volumen=" + cilindro3.calcularVolumen() + ", Área=" + cilindro3.calcularArea());

        // Comparamos los cilindros y mostramos el menor
        if (cilindro1.calcularVolumen() <= cilindro2.calcularVolumen() && cilindro1.calcularVolumen() <= cilindro3.calcularVolumen()) {
            System.out.println("El cilindro 1 es el menor");
        } else if (cilindro2.calcularVolumen() <= cilindro3.calcularVolumen()) {
            System.out.println("El cilindro 2 es el menor");
        } else {
            System.out.println("El cilindro 3 es el menor");
        }
    }
}
