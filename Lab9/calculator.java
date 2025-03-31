package Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    static JFrame frame;
    static JTextField textField;
    String num1, num2, operator;

    calculator() {
        num1 = num2 = operator = "";
    }

    public static void main(String args[]) {
        frame = new JFrame("calculator");

        calculator calc = new calculator();
        textField = new JTextField(16);
        textField.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, sub, div, mul, dot, clear, equals;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        equals = new JButton("=");
        add = new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul = new JButton("*");
        clear = new JButton("C");
        dot = new JButton(".");

        JPanel panel = new JPanel();

        mul.addActionListener(calc);
        div.addActionListener(calc);
        sub.addActionListener(calc);
        add.addActionListener(calc);
        b9.addActionListener(calc);
        b8.addActionListener(calc);
        b7.addActionListener(calc);
        b6.addActionListener(calc);
        b5.addActionListener(calc);
        b4.addActionListener(calc);
        b3.addActionListener(calc);
        b2.addActionListener(calc);
        b1.addActionListener(calc);
        b0.addActionListener(calc);
        dot.addActionListener(calc);
        clear.addActionListener(calc);
        equals.addActionListener(calc);

        panel.add(textField);
        panel.add(add);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(sub);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(mul);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(div);
        panel.add(dot);
        panel.add(b0);
        panel.add(clear);
        panel.add(equals);

        panel.setBackground(Color.gray);

        frame.add(panel);
        frame.setSize(200, 220);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!operator.equals(""))
                num2 = num2 + s;
            else
                num1 = num1 + s;

            textField.setText(num1 + operator + num2);
        } else if (s.charAt(0) == 'C') {
            num1 = operator = num2 = "";
            textField.setText(num1 + operator + num2);
        } else if (s.charAt(0) == '=') {
            double result;

            if (operator.equals("+"))
                result = (Double.parseDouble(num1) + Double.parseDouble(num2));
            else if (operator.equals("-"))
                result = (Double.parseDouble(num1) - Double.parseDouble(num2));
            else if (operator.equals("/"))
                result = (Double.parseDouble(num1) / Double.parseDouble(num2));
            else
                result = (Double.parseDouble(num1) * Double.parseDouble(num2));

            textField.setText(num1 + operator + num2 + "=" + result);
            num1 = Double.toString(result);
            operator = num2 = "";
        } else {
            if (operator.equals("") || num2.equals(""))
                operator = s;
            else {
                double result;

                if (operator.equals("+"))
                    result = (Double.parseDouble(num1) + Double.parseDouble(num2));
                else if (operator.equals("-"))
                    result = (Double.parseDouble(num1) - Double.parseDouble(num2));
                else if (operator.equals("/"))
                    result = (Double.parseDouble(num1) / Double.parseDouble(num2));
                else
                    result = (Double.parseDouble(num1) * Double.parseDouble(num2));

                num1 = Double.toString(result);
                operator = s;
                num2 = "";
            }

            textField.setText(num1 + operator + num2);
        }
    }
}