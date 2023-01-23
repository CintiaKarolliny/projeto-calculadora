package calculadora;

import javax.swing.*;
import java.awt.*;

public class tela {
    private JTextField resultTextField;

    private JPanel calc;
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

    private Double total1 = 0.0;
    private Double total2 = 0.0;

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
////                        Double num1 = dig.nextFloat();
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
            String umButtonText = resultTextField.getText() + umButton.getText();
            resultTextField.setText(umButtonText);
        });

        doisButton.addActionListener(e -> {
            String doisButtonText = resultTextField.getText() + doisButton.getText();
            resultTextField.setText(doisButtonText);
        });

        tresButton.addActionListener(e -> {
            String tresButtonText = resultTextField.getText() + tresButton.getText();
            resultTextField.setText(tresButtonText);
        });

        quatroButton.addActionListener(e -> {
            String quatroButtonText = resultTextField.getText() + quatroButton.getText();
            resultTextField.setText(quatroButtonText);
        });

        cincoButton.addActionListener(e -> {
            String cincoButtonText = resultTextField.getText() + cincoButton.getText();
            resultTextField.setText(cincoButtonText);
        });

        seisButton.addActionListener(e -> {
            String seisButtonText = resultTextField.getText() + seisButton.getText();
            resultTextField.setText(seisButtonText);
        });

        seteButton.addActionListener(e -> {
            String seteButtonText = resultTextField.getText() + seteButton.getText();
            resultTextField.setText(seteButtonText);
        });

        oitoButton.addActionListener(e -> {
            String oitoButtonText = resultTextField.getText() + oitoButton.getText();
            resultTextField.setText(oitoButtonText);
        });

        noveButton.addActionListener(e -> {
            String noveButtonText = resultTextField.getText() + noveButton.getText();
            resultTextField.setText(noveButtonText);
        });

        zeroButton.addActionListener(e -> {
            String zeroButtonText = resultTextField.getText() + zeroButton.getText();
            resultTextField.setText(zeroButtonText);
        });

        virgulaButton.addActionListener(e -> {
            String virgulaButtonText = resultTextField.getText() + virgulaButton.getText();
            resultTextField.setText(virgulaButtonText);
        });

        maisButton.addActionListener(e -> {
            total1 += Double.parseDouble(resultTextField.getText());
            resultTextField.setText("");
        });

        igualButton.addActionListener(e -> {
            total2 += total1 + Double.parseDouble(resultTextField.getText());
            resultTextField.setText(String.valueOf(total2));
            total1 = 0.0;
        });

        cButton.addActionListener(e -> {
            total2 = 0.0;
            resultTextField.setText("");
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
