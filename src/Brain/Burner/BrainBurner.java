package Brain.Burner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BrainBurner extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;


    BrainBurner(){
        setBounds(500,200,1000,550);//dleft,//dup,//length,height////
        getContentPane().setBackground(Color.WHITE);//background color
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Brain/Burner/image icon/a.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 512, 512);
        add(l1);

        JLabel l2 = new JLabel("Brain Burner");
        l2.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
        l2.setForeground(new Color(30,144,254));
        l2.setBounds(650, 20, 300, 100);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Times New Roman", Font.BOLD,20));
        l3.setForeground(new Color(0,128,128));
        l3.setBounds(680,100,300,100);
        add(l3);

         t1 = new JTextField();
        t1.setBounds(655,200,200,30);
        t1.setFont(new Font("Cambria", Font.BOLD,20));
        add(t1);

         b1 = new JButton("Rules");
        b1.setBounds(600,270,100,30);
        b1.setBackground(new Color(0,128,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

         b2= new JButton("Exit");
        b2.setBounds(800,270,100,30);
        b2.setBackground(new Color(0,128,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);


        }else{

            System.exit(0);
        }
    }
    public static void main(String[] args){

        new BrainBurner();
    }
}
