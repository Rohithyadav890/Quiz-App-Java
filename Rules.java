import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name+" to Expert Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
            "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
            "2. Do answer the questions in time as there is only 15sec's for each question" + "<br><br>" +
            "3. Each question contains 4 options and after 15 sec's question will be skipped automatically" + "<br><br>" +
            "4. Read each question carefully" + "<br><br>" +
            "5. Take life-line if necessary" + "<br><br>" +
            "6. Life-line is allowed only once" + "<br><br>" +
            "7. No usage of mobile,gadgets for answering" + "<br><br>" +
            "8. Should Attempt all questions, Think wisely Good Luck!" + "<br><br>" +
            "<html>"
        );
        add(rules);

        //buttons
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
