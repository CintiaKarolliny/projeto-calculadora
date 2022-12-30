package calculadora;

import javax.swing.*;
import java.awt.*;

public class tela {

    private JFrame frame;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;

    public tela() {
        iniciar();
    }
    public void iniciar() {
        frame = new JFrame();
        frame.setBounds(100,100,300,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    tela Window = new tela();
                    Window.frame.setVisible(true);

//                    public static void main(String[] args) {
//
//                        JFrame frame = new JFrame("tela");
//                        frame.setContentPane(new tela().panel1);
//                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//                        frame.pack();
//                        frame.setVisible(true);
//
//                        Scanner dig = new Scanner(System.in);
//
//                        System.out.print("\nDigite o 1º número: ");
//                        float num1 = dig.nextFloat();
//
//                        System.out.print("\nDigite o 2º número: ");
//                        float num2 = dig.nextFloat();
//
//                        Somar s = new Somar(num1,num2);
//
//                        Subtrair sub = new Subtrair(num1,num2);
//
//                        Multiplicar mult = new Multiplicar(num1,num2);
//
//                        Dividir div = new Dividir(num1, num2);
//
//                        s.calcular();
//                        sub.calcular();
//                        mult.calcular();
//                        div.calcular();
//                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
