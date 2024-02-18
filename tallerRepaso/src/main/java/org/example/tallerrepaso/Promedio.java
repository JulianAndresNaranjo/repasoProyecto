package logica;

public class Promedio {

    private float a;
    private float b;
    private float c;
    private float d;

    public Promedio(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String promedio() {
        float resultado = ((a + b + c + d) / 2);

        if (resultado >= 2.0 && resultado < 3.0) {
            return ("su promedio fue "+resultado+" por lo que el próximo semestre estará en período de prueba");

        } else if (resultado < 2.0) {
            return ("su promedio fue "+resultado+" por lo que su matrícula es condicional");

        } else {
            return ("su promedio fue "+resultado+" felicidades");
        }

    }

    public float getA() {
        return a;

    }public void setA(float a) {
        this.a = a;

    }public float getB() {
        return b;

    }public void setB(float b) {
        this.b = b;

    }public float getC() {
        return c;

    }public void setC(float c) {
        this.c = c;

    }public float getD() {
        return d;

    }public void setD(float d) {
        this.d = d;
    }
}
