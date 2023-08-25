package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deposit extends JFrame implements ActionListener{

    String pin;
    JTextField t1;
    JButton b1,b2;

    

    deposit(String pin){

        super("Deposit Centre");
        this.pin = pin;


        ImageIcon ii1 =new ImageIcon(ClassLoader.getSystemResource("icon/LT.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel li3 = new JLabel(ii3);
        li3.setForeground(Color.white);
        li3.setBounds(10,10,100,100);
        add(li3);

        //introduction

        JLabel l1 = new JLabel("WELCOME TO THE ATM");
        l1.setForeground(Color.WHITE);
        l1.setBounds(520, 50,600, 40);
        l1.setFont(new Font("Ralway",Font.BOLD,40));
        add(l1);

        //amount to be deposited

        JLabel l2 = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        l2.setForeground(Color.WHITE);
        l2.setBounds(470, 150,600, 40);
        l2.setFont(new Font("Ralway",Font.BOLD,25));
        add(l2);

        //box of amount
        
        t1 = new JTextField("");
        t1.setBackground(new Color(202, 250, 249));
        t1.setForeground(Color.BLACK);
        t1.setBounds(450,220, 600, 40);
        t1.setFont(new Font("Ralway",Font.BOLD,20));
        add(t1);

        //buttons

        b1= new JButton("DEPOSIT");
        b1.setBounds(1000, 500, 200, 40);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("BACK");
        b2.setBounds(1000, 600, 200, 40);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);

        //buttons*******************************

        ImageIcon bu1 =new ImageIcon(ClassLoader.getSystemResource("icon/butt.png"));
        Image bu2 =  bu1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon bu3 = new ImageIcon(bu2);
        JLabel b3 = new JLabel(bu3);
        b3.setForeground(Color.white);
        b3.setBounds(1220,495,50,50);
        add(b3);

        ImageIcon buu1 =new ImageIcon(ClassLoader.getSystemResource("icon/butt.png"));
        Image buu2 =  buu1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon buu3 = new ImageIcon(buu2);
        JLabel bi3 = new JLabel(buu3);
        bi3.setForeground(Color.white);
        bi3.setBounds(1220,595,50,50);
        add(bi3);

        //background*************************************************************************

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/pxfuel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1500,900);
        add(l3);

        setLayout(null);
        setSize(1500, 900);
        setLocation(40,40);
        setVisible(true);

    }

///////Ovveride***********************************
    public void actionPerformed(ActionEvent e){
        try{
        
        String amount =t1.getText();
        Date d = new Date();

        if(e.getSource()==b1){
            if(t1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter the amount");
            }else{
                Conn c = new Conn();
                String q =("insert into banke values('"+pin+"','"+d+"','deposit','"+amount+"')");
                // we used deposit because we want type in our sql so we can write anything there*********
                
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Rs. " +amount+ " deposit successful");
                setVisible(false);
                new mainscreen(pin);
                
            }
            
        }else if(e.getSource()==b2){
                new mainscreen(pin);
                setVisible(false);

            }

        }
        catch(Exception E){
            E.printStackTrace();
        }

    }
public static void main(String[] args) {
    new deposit("");
}
    
}
