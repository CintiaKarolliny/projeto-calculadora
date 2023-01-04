package calculadora;

import javax.swing.*;
import java.awt.*;

public class tela {

    private JPanel calc;
    private JTextField resultTextField;
    private JButton cButton;
    private JButton xButton;
    private JButton parenButton;
    private JButton porcButton;
    private JButton divButton;
    private JButton seteButton;
    private JButton oitoButton;
    private JButton noveButton;
    private JButton quatroButton;
    private JButton cincoButton;
    private JButton seisButton;
    private JButton umButton;
    private JButton doisButton;
    private JButton tresButton;
    private JButton mudarSinalButton;
    private JButton zeroButton;
    private JButton virgulaButton;
    private JButton igualButton;
    private JButton maisButton;
    private JButton menosButton;

    public tela() {

//
////                    public static void main(String[] args) {
////
////                        JFrame frame = new JFrame("tela");
////                        frame.setContentPane(new tela().calc);
////                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////
////                        frame.pack();
////                        frame.setVisible(true);
////
////                        Scanner dig = new Scanner(System.in);
////
////                        System.out.print("\nDigite o 1º número: ");
////                        float num1 = dig.nextFloat();
////
////                        System.out.print("\nDigite o 2º número: ");
////                        float num2 = dig.nextFloat();
////
////                        Somar s = new Somar(num1,num2);
////
////                        Subtrair sub = new Subtrair(num1,num2);
////
////                        Multiplicar mult = new Multiplicar(num1,num2);
////
////                        Dividir div = new Dividir(num1, num2);
////
////                        s.calcular();
////                        sub.calcular();
////                        mult.calcular();
////                        div.calcular();
////                    }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });

        umButton.addActionListener(e -> {

            String umButtonText = umButton.getText();
            resultTextField.setText(umButtonText);
        });

    }
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {

                JFrame frame = new JFrame("calc");
                frame.setContentPane(new tela().calc);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setBounds(100,100,300,400);
                frame.setResizable(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
