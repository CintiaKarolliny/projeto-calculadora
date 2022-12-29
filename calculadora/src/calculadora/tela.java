package calculadora;

import javax.swing.*;
import java.util.Scanner;

public class tela {
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;

    public tela() {

        button1.addActionListener(e -> JOptionPane.showMessageDialog(null, "teste"));
    }
        public static void main(String[] args) {

            JFrame frame = new JFrame("tela");
            frame.setContentPane(new tela().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.pack();
            frame.setVisible(true);

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

