import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherTestCode extends JFrame implements ActionListener{
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    OtherTestCode(){
        button1 = new JButton();
        button1.setBounds(90, 650, 225, 100);
        button2 = new JButton();
        button2.setBounds(440, 650, 225, 100);
        button3 = new JButton();
        button3.setBounds(790, 650, 225, 100);
        button4 = new JButton();
        button4.setBounds(1140, 650, 225, 100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true); 
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        button1.setText("Button 1");
        button2.setText("Button 2");
        button3.setText("Button 3");
        button4.setText("Button 4");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            System.out.println("button 1");
            this.dispose();
            JFrame Frame1 = new JFrame();
            Frame1.setBackground(Color.red);
            Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Frame1.setLayout(null);
            Frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Frame1.setVisible(true);

        }
        if(e.getSource() == button2) {
            System.out.println("button 2");
        }
        if(e.getSource() == button3) {
            System.out.println("button 3");
        }
        if(e.getSource() == button4) {
            System.out.println("button 4");
    }

}}
 