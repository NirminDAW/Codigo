package Prisma;

// Clase que representa un prisma triangular
public class PrismaJava {
    // Atributos privados que representan la base del triángulo y la altura del prisma
    private int baseTriangulo;
    private int alturaPrisma;

    // Constructor que inicializa los valores de la base del triángulo y la altura del prisma
    public PrismaJava(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    // Método getter para obtener el valor de la base del triángulo
    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    // Método setter para establecer el valor de la base del triángulo
    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    // Método getter para obtener el valor de la altura del prisma
    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    // Método setter para establecer el valor de la altura del prisma
    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    // Método que calcula la altura del triángulo utilizando el teorema de Pitágoras
    public float alturaTriangulo() {
        // Calcula la altura del triángulo dividiendo la base entre 2 y aplicando Pitágoras
        return (float) Math.sqrt(Math.pow(baseTriangulo / 2.0, 2) + Math.pow(alturaPrisma, 2));
    }

    // Método que calcula el área de la base triangular del prisma
    public float areaBase() {
        // Fórmula del área de un triángulo: (base * altura) / 2
        return (float) (baseTriangulo * alturaTriangulo() / 2.0);
    }

    // Método que calcula el perímetro de la base triangular
    public float perimetro() {
        // Fórmula del perímetro de un triángulo equilátero: 3 * lado
        return (float) (3 * baseTriangulo);
    }

    // Método que calcula el área lateral del prisma
    public float areaLateral() {
        // Fórmula del área lateral: perímetro de la base * altura del prisma
        return (float) (perimetro() * alturaPrisma);
    }

    // Método que calcula el área total del prisma
    public float areaTotal() {
        // Fórmula del área total: 2 * área de la base + área lateral
        return areaBase() * 2 + areaLateral();
    }
}