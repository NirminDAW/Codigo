package Prisma;

public class PrismaJava {
    private int baseTriangulo;
    private int alturaPrisma;

    public PrismaJava(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    public float alturaTriangulo() {
        return (float) Math.sqrt(Math.pow(baseTriangulo / 2.0, 2) + Math.pow(alturaPrisma, 2));
    }


    public float areaBase() {
        return (float) (baseTriangulo * alturaTriangulo() / 2.0);
    }

    public float perimetro() {
        return (float) (3 * baseTriangulo);
    }

    public float areaLateral() {
        return (float) (perimetro() * alturaPrisma);
    }

    public float areaTotal() {
        return areaBase() * 2 + areaLateral();
    }
}

