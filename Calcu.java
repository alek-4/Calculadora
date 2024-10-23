import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcu {
    private double total = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel Calculadora;
    private JTextField pantalla;
    private JButton n7;
    private JButton res;
    private JButton divi;
    private JButton multi;
    private JButton n8;
    private JButton n4;
    private JButton n1;
    private JButton n0;
    private JButton n9;
    private JButton n5;
    private JButton n2;
    private JButton coma;
    private JButton sum;
    private JButton n6;
    private JButton n3;
    private JButton borrar;
    private JButton igual;

    private void getOperator (String pantallt){
        math_operator = pantallt.charAt(0);
        total = total + Double.parseDouble(pantalla.getText());
        pantalla.setText("");

    }

    public Calcu() {
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1text = pantalla.getText() + n1.getText();
                pantalla.setText(n1text);

            }
        });
        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n2text = pantalla.getText() + n2.getText();
                pantalla.setText(n2text);
            }
        });
        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n0text = pantalla.getText() + n0.getText();
                pantalla.setText(n0text);
            }
        });
        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n3text = pantalla.getText() + n3.getText();
                pantalla.setText(n3text);
            }
        });
        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n4text = pantalla.getText() + n4.getText();
                pantalla.setText(n4text);
            }
        });
        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n5text = pantalla.getText() + n5.getText();
                pantalla.setText(n5text);
            }
        });
        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n6text = pantalla.getText() + n6.getText();
                pantalla.setText(n6text);
            }
        });
        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n7text = pantalla.getText() + n7.getText();
                pantalla.setText(n7text);
            }
        });
        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n8text = pantalla.getText() + n8.getText();
                pantalla.setText(n8text);
            }
        });
        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n9text = pantalla.getText() + n9.getText();
                pantalla.setText(n9text);
            }
        });
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String suma_text = sum.getText();
                getOperator(suma_text);
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               switch (math_operator) {
                   case '+':
                       total2 = total + Double.parseDouble(pantalla.getText());
                       break;
                       case '-':
                           total2 = total - Double.parseDouble(pantalla.getText());
                           break;
                           case 'X':
                               total2 = total * Double.parseDouble(pantalla.getText());
                               break;
                               case '/':
                                   total2 = total / Double.parseDouble(pantalla.getText());
                                   break;

               }
                pantalla.setText(Double.toString(total2));
                total = 0;
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                pantalla.setText("");
            }
        });
        res.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res_text = res.getText();
                getOperator(res_text);
            }
        });
        coma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pantalla.getText().equals("")) {
                    pantalla.setText("0");
                } else if (pantalla.getText().contains(".")) {
                    coma.setEnabled(false);

                } else {
                    String comat = pantalla.getText() + coma.getText();
                    pantalla.setText(comat);
                }
                coma.setEnabled(true);
            }
        });


        divi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String div_text = divi.getText();
                getOperator(div_text);
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String multi_text = multi.getText();
                getOperator(multi_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcu");
        frame.setContentPane(new Calcu().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}