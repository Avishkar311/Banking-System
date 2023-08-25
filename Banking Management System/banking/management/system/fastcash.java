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

public class fastcash extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    fastcash(String pin){

        this.pin = pin;

        JLabel l1 = new JLabel("Welcome to Fast Cash");
        l1.setForeground(Color.WHITE);
        l1.setBounds(550, 100, 500, 150);
        l1.setFont(new Font("Ralway",Font.BOLD,40));
        add(l1);

        JLabel l2 = new JLabel("Please select Withdrawal Amount");
        l2.setForeground(Color.WHITE);
        l2.setBounds(560, 150, 500, 150);
        l2.setFont(new Font("Ralway",Font.BOLD,25));
        add(l2);


        b1= new JButton("Rs.100");
        b1.setBounds(300, 300, 200, 40);
        b1.setFont(new Font("Ralway",Font.BOLD,20));
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("Rs.500");
        b2.setBounds(1000, 300, 200, 40);
        b2.setFont(new Font("Ralway",Font.BOLD,20));
        b2.addActionListener(this);
        add(b2);

        b3= new JButton("Rs.1000");
        b3.setBounds(300, 400, 200, 40);
        b3.setFont(new Font("Ralway",Font.BOLD,20));
        b3.addActionListener(this);
        add(b3);

        b4= new JButton("Rs.2000");
        b4.setBounds(1000, 400, 200, 40);
        b4.setFont(new Font("Ralway",Font.BOLD,20));
        b4.addActionListener(this);
        add(b4);

        b5= new JButton("Rs.5000");
        b5.setBounds(300, 500, 200, 40);
        b5.setFont(new Font("Ralway",Font.BOLD,20));
        b5.addActionListener(this);
        add(b5);

        b6= new JButton("Rs.10000");
        b6.setBounds(1000, 500, 200, 40);
        b6.setFont(new Font("Ralway",Font.BOLD,20));
        b6.addActionListener(this);
        add(b6);

        b7= new JButton("BACK");
        b7.setBounds(1000, 600, 200, 40);
        b7.setFont(new Font("Ralway",Font.BOLD,15));
        b7.addActionListener(this);
        add(b7);

        //background

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/pxfuel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1500,900);
        add(l3);

        setLayout(null);
        setSize(1500, 900);
        setLocation(40, 40);
        setVisible(true);
    }

    //override***************

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b7){
            setVisible(false);
            new mainscreen(pin);
        }else{
            String amount =((JButton)e.getSource()).getText().substring(3);             //e.getSource ek object ko return karta he
            Conn c = new Conn();
            Date date = new Date();

            try{
                ResultSet resultSet = c.statement.executeQuery("select * from banke where pin ='"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                String num="17";

                if(e.getSource() != b7 && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into banke values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. " +amount+ " Debited successfully");

            }catch(Exception E){
                E.printStackTrace();

            }
            setVisible(false);
            new mainscreen(pin);


        }

    }
    public static void main(String[] args) {
        new fastcash("");
    }
}
