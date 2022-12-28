package calculadora;

public class Somar {

    private float num1;
    private float num2;
//    private float total;

    public Somar(float num1, float num2/*, float total */) {

        this.num1 = num1;
        this.num2 = num2;
       // this.total = total;

    }

    public void calcular() {

        float total = num1+num2;

        System.out.println(num1 + " + " + num2 + " = " + total);

    }

}
