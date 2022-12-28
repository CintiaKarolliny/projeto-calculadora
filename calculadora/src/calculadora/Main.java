package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dig = new Scanner(System.in);

        System.out.print("\nDigite o 1º número: ");
        float num1 = dig.nextFloat();

        System.out.print("\nDigite o 2º número: ");
        float num2 = dig.nextFloat();

        Somar s = new Somar(num1,num2);

        Subtrair sub = new Subtrair(num1,num2);

        Multiplicar mult = new Multiplicar(num1,num2);

        Dividir div = new Dividir(num1, num2);

        s.calcular();
        sub.calcular();
        mult.calcular();
        div.calcular();
    }

}
