package calculadora;

public class Multiplicar {

    private float num1;
    private float num2;

    public Multiplicar(float num1, float num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

    public void calcular() {

        float total = this.num1 * this.num2;

        System.out.println("\n" + num1 + " x " + num2 + " = " + Math.round(total * 100.0) / 100.0);
    }

}
