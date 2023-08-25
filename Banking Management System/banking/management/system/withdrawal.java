package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class withdrawal extends JFrame implements ActionListener{

    String pin;
    JTextField t1;
    JButton b1,b2;


    public withdrawal(String pin){

        this.pin=pin;

        JLabel l1 = new JLabel("WELCOME TO THE ATM");
        l1.setForeground(Color.WHITE);
        l1.setBounds(520, 50,600, 40);
        l1.setFont(new Font("Ralway",Font.BOLD,40));
        add(l1);

        //amount to be withrawn

        JLabel l2 = new JLabel("( MAXIMUM WITHDRAWAL IS 10,000 )");
        l2.setForeground(Color.WHITE);
        l2.setBounds(550, 150,600, 40);
        l2.setFont(new Font("Ralway",Font.BOLD,25));
        add(l2);

        JLabel li3 = new JLabel("Please Enter Your Amount");
        li3.setForeground(Color.WHITE);
        li3.setBounds(480, 240,600, 40);
        li3.setFont(new Font("Ralway",Font.BOLD,20));
        add(li3);

        //box of amount
        
        t1 = new JTextField("");
        t1.setBackground(new Color(202, 250, 249));
        t1.setForeground(Color.BLACK);
        t1.setBounds(450,280, 600, 40);
        t1.setFont(new Font("Ralway",Font.BOLD,20));
        add(t1);

        //buttons

        b1= new JButton("Withdraw");
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

    //overide******************
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
        try{
            String amount = t1.getText();
            Date date = new Date();
            if(t1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter the amount");

            }
            else{                  ///important*************************************************************
                Conn c =new Conn();
                ResultSet resultSet = c.statement.executeQuery("select * from banke where pin ='"+pin+"'");
                int balance =0;

                while(resultSet.next()){
                    if(resultSet.getString("type").equals("deposit")){
                        balance+= Integer.parseInt(resultSet.getString("amount"));

                    }else{
                        balance-=Integer.parseInt(resultSet.getString("amount"));
                    }
                
                }
                if(balance< Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficiant balance");
                    return;
                }
                
            c.statement.executeUpdate("insert into banke values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
            JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            setVisible(false);
            new mainscreen(pin);
            }


        }catch(Exception E){
            E.printStackTrace();
        }

    }else if (e.getSource()==b2){
        new mainscreen(pin);
        setVisible(false);
    }

    }
public static void main(String[] args) {
    new withdrawal("");
}
    
}
