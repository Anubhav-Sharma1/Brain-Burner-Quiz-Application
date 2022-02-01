package Brain.Burner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
     String username;
    Rules(String username ){
        this.username = username;
        setBounds(600,200,800,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome " + username + " to simple minds");
        l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
        l1.setBounds(50,20,700,30);
        l1.setForeground(new Color(30,144,255));
        add(l1);

        JLabel l2= new JLabel();
        l2.setBounds(20,90,600,400);
        l2.setFont(new Font("Tahoma", Font.PLAIN,20));
        l2.setText(
                "<html>" +
                        "1. You have been provided ten questions and each question carries 10 marks each."+"<br><br>" +
                        "2. Each question has 15 sec to give the answer."+"<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory."+"<br><br>" +
                        "4.  May you know more than what John Snow knows, Good Luck."+"<br><br>" +
                        "5. Crying is allowed but please do so quietly."+"<br><br>" +
                        "6. Brace yourself, this paper is not for faint hearted."+"<br><br>" +
                        "7. Only a fool asks and a wise answers (Be wise, not otherwise)."+"<br><br>" +
                        "<html>"
        );
        add(l2);


         b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);



         b2 = new JButton("Start");
        b2.setBackground(new Color(30,144,255));
        b2.setBounds(400,500,100,30);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new BrainBurner().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);

        }
    }
    public static void main(String[] args){
        new Rules("");
    }
}
