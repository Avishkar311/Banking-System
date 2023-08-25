package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class balanceEnquiry extends JFrame implements ActionListener{
    String pin;

    JLabel l1,l2;
    JButton b1;

    public balanceEnquiry(String pin){                         //constrcutor is this
        
        this.pin = pin;

        l1 = new JLabel("YOUR CURRENT BALANCE IS RS.");
        l1.setForeground(Color.WHITE);
        l1.setBounds(100, 100, 400, 30);
        l1.setFont(new Font("RAlWAY",Font.BOLD,20));
        add(l1);

        l2 = new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setBounds(100, 130, 400, 30);
        l2.setFont(new Font("RAlWAY",Font.BOLD,20));
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(600, 600, 150, 50);
        b1.setFont(new Font("RAlWAY",Font.BOLD,20));
        b1.addActionListener(this);
        add(b1);

        int balance = 0;
        try{

            
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from banke where pin = '"+pin+"'");
            while (resultSet.next()){if(resultSet.getString("type").equals("deposit")){
                balance+= Integer.parseInt(resultSet.getString("amount"));

            }else{
                balance-=Integer.parseInt(resultSet.getString("amount"));
            }
        
        }

        }catch(Exception e){
            e.printStackTrace();
            
        }
        l2.setText(""+balance);

    
        //image and background


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

    //override**************

    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new mainscreen(pin);
        
    }

    public static void main(String[] args) {
        new balanceEnquiry("");                        //object is this
        
    }

    
}
