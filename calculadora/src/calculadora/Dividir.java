package calculadora;

public class Dividir {

    private float num1;
    private float num2;

    public Dividir(float num1, float num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

    public void calcular(){

        if (num2 == 0) {
            System.out.println("\nImpossível dividir por 0!");
        } else {

            float total = num1 / num2;

            System.out.println("\n" + num1 + " / " + num2 + " = " + Math.round(total * 100.0) / 100.0);

        }
    }

}
