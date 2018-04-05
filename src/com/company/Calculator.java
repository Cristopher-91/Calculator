package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    private JFrame jFrame;
    JTextField jTextField;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;  // number buttons;
    JButton badd, bdec, bmul, bdiv, bresult, bclear, bdot;  // function buttons

    double a, b, result;
    Operation operation;

    private JButton[] buttons = new JButton[]{b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            badd, bdec, bmul, bdiv, bresult, bclear, bdot};

    private String[] buttonNames = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "+", "-", "*", "/", "=", "CL", "."};


    public Calculator() {

        //Frame settings
        jFrame = new JFrame("Calculator");
        jFrame.setLayout(new GridLayout());
        jFrame.setVisible(true);
        jFrame.setSize(350, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        //TextField
        jTextField = new JTextField();
        jTextField.setBounds(30, 40, 280, 30);
        jFrame.add(jTextField);

        //Buttons
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].addActionListener(this);
            jFrame.add(buttons[i]);
        }

        buttons[15].setBounds(40, 100, 50, 50);  //clear
        buttons[13].setBounds(110, 100, 50, 50);   //divide
        buttons[12].setBounds(180, 100, 50, 50);   //multiply
        buttons[11].setBounds(250, 100, 50, 50);   //decrement


        buttons[7].setBounds(40, 170, 50, 50);
        buttons[8].setBounds(110, 170, 50, 50);
        buttons[9].setBounds(180, 170, 50, 50);
        buttons[10].setBounds(250, 170, 50, 120);   //addition

        buttons[4].setBounds(40, 240, 50, 50);
        buttons[5].setBounds(110, 240, 50, 50);
        buttons[6].setBounds(180, 240, 50, 50);

        buttons[1].setBounds(40, 310, 50, 50);
        buttons[2].setBounds(110, 310, 50, 50);
        buttons[3].setBounds(180, 310, 50, 50);
        buttons[14].setBounds(250, 310, 50, 120);   //result

        buttons[0].setBounds(40, 380, 120, 50);
        buttons[16].setBounds(180, 380, 50, 50);   //dot


        for (JButton jb : buttons
                ) {
            jFrame.add(jb);
        }

        jFrame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //numbers
        if (e.getSource() == buttons[0])
            jTextField.setText(jTextField.getText().concat("0"));

        if (e.getSource() == buttons[1])
            jTextField.setText(jTextField.getText().concat("1"));

        if (e.getSource() == buttons[2])
            jTextField.setText(jTextField.getText().concat("2"));

        if (e.getSource() == buttons[3])
            jTextField.setText(jTextField.getText().concat("3"));

        if (e.getSource() == buttons[4])
            jTextField.setText(jTextField.getText().concat("4"));

        if (e.getSource() == buttons[5])
            jTextField.setText(jTextField.getText().concat("5"));

        if (e.getSource() == buttons[6])
            jTextField.setText(jTextField.getText().concat("6"));

        if (e.getSource() == buttons[7])
            jTextField.setText(jTextField.getText().concat("7"));

        if (e.getSource() == buttons[8])
            jTextField.setText(jTextField.getText().concat("8"));

        if (e.getSource() == buttons[9])
            jTextField.setText(jTextField.getText().concat("9"));

        //operations
        if (e.getSource() == buttons[10]) {
            a = Double.parseDouble(jTextField.getText());
            operation = Operation.add;
            jTextField.setText("");
        }

        if (e.getSource() == buttons[11]) {
            a = Double.parseDouble(jTextField.getText());
            operation = Operation.dec;
            jTextField.setText("");
        }

        if (e.getSource() == buttons[12]) {
            a = Double.parseDouble(jTextField.getText());
            operation = Operation.mul;
            jTextField.setText("");
        }

        if (e.getSource() == buttons[13]) {
            a = Double.parseDouble(jTextField.getText());
            operation = Operation.div;
            jTextField.setText("");
        }

        //others
        if (e.getSource() == buttons[15]) {
            jTextField.setText("");
        }

        if (e.getSource() == buttons[16])
            jTextField.setText(jTextField.getText().concat("."));

        if (e.getSource() == buttons[14]) {

            b = Double.parseDouble(jTextField.getText());
            switch (operation) {
                case add:
                    result = a + b;
                    break;

                case dec:
                    result = a - b;
                    break;

                case mul:
                    result = a * b;
                    break;

                case div:
                    result = a / b;
                    break;

                default:
                    result = 0;
            }
            jTextField.setText("" + result);
        }
    }
}
