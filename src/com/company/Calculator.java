package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
    private JFrame jFrame;
    JTextField jTextField;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;  // number buttons;
    JButton badd, bdec, bmul, bdiv, bresult, bclear, bdot;  // function buttons

    private JButton[] buttons = new JButton[]{b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
        badd,bdec,bmul,bdiv,bresult,bclear,bdot};
    private String[] buttonNames = new String[]{"0","1","2","3","4","5","6","7","8","9",
         "+","-","*","/","=","CL","."};

    double a = 0, b = 0;
    int operation = 0;

    public Calculator(){
        //Frame settings
        jFrame = new JFrame("Calculator");
        jFrame.setLayout(new GridLayout());
        jFrame.setVisible(true);
        jFrame.setSize(350,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        //TextField
        jTextField = new JTextField();
        jTextField.setBounds(30,40,280,30);
        jFrame.add(jTextField);

        //Buttons
        for( int i=0; i<buttons.length;i++){
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].addActionListener(this);
            jFrame.add(buttons[i]);
        }

            buttons[15].setBounds(40,100,50,50);  //clear
            buttons[13].setBounds(110,100,50,50);   //divide
            buttons[12].setBounds(180,100,50,50);   //multiply
            buttons[11].setBounds(250,100,50,50);   //decrement


            buttons[7].setBounds(40,170,50,50);
            buttons[8].setBounds(110,170,50,50);
            buttons[9].setBounds(180,170,50,50);
            buttons[10].setBounds(250,170,50,120);   //addition

            buttons[4].setBounds(40,240,50,50);
            buttons[5].setBounds(110,240,50,50);
            buttons[6].setBounds(180,240,50,50);

            buttons[1].setBounds(40,310,50,50);
            buttons[2].setBounds(110,310,50,50);
            buttons[3].setBounds(180,310,50,50);
            buttons[14].setBounds(250,310,50,120);   //result

            buttons[0].setBounds(40,380,120,50);
            buttons[16].setBounds(180,380,50,50);   //dot


            for (JButton jb: buttons
                 ) { jFrame.add(jb);
            }

            jFrame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
