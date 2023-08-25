package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainscreen extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;
    


    public mainscreen(String pin){

        this.pin=pin;

        ImageIcon ii1 =new ImageIcon(ClassLoader.getSystemResource("icon/LT.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel li3 = new JLabel(ii3);
        li3.setForeground(Color.WHITE);
        li3.setBounds(10,10,100,100);
        add(li3);

        JLabel l1=new JLabel("Please select your Transaction ");
        l1.setBounds(470, 120, 700,40);
        l1.setFont(new Font("Ralway",Font.BOLD,40));
        l1.setForeground(Color.WHITE);
        add(l1);

        JLabel l2=new JLabel("Welcome to Liberty Trust ");
        l2.setBounds(460, 40, 700,70);
        l2.setForeground(Color.cyan);
        l2.setFont(new Font("Ralway",Font.BOLD,50));
        add(l2);

        //buttons

        b1= new JButton("DEPOSIT");
        b1.setBounds(300, 300, 200, 40);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);

        b2= new JButton("CASH WITHDRAWAL");
        b2.setBounds(1000, 300, 200, 40);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);

        b3= new JButton("FAST CASH");
        b3.setBounds(300, 400, 200, 40);
        b3.setFont(new Font("Ralway",Font.BOLD,15));
        b3.addActionListener(this);
        add(b3);

        b4= new JButton("MIN STATEMENT");
        b4.setBounds(1000, 400, 200, 40);
        b4.setFont(new Font("Ralway",Font.BOLD,15));
        b4.addActionListener(this);
        add(b4);

        b5= new JButton("PIN CHANGE");
        b5.setBounds(300, 500, 200, 40);
        b5.setFont(new Font("Ralway",Font.BOLD,15));
        b5.addActionListener(this);
        add(b5);

        b6= new JButton("BALANCE ENQUIRY");
        b6.setBounds(1000, 500, 200, 40);
        b6.setFont(new Font("Ralway",Font.BOLD,15));
        b6.addActionListener(this);
        add(b6);

        b7= new JButton("EXIT");
        b7.setBounds(650, 600, 200, 40);
        b7.setFont(new Font("Ralway",Font.BOLD,15));
        b7.addActionListener(this);
        add(b7);

        //small icons buttons**********************

        ImageIcon bu1 =new ImageIcon(ClassLoader.getSystemResource("icon/buttr.png"));       //left button
        Image bu2 =  bu1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon bu3 = new ImageIcon(bu2);
        JLabel b3 = new JLabel(bu3);
        b3.setForeground(Color.white);
        b3.setBounds(230,295,50,50);
        add(b3);

        ImageIcon buu1 =new ImageIcon(ClassLoader.getSystemResource("icon/butt.png"));
        Image buu2 =  buu1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon buu3 = new ImageIcon(buu2);
        JLabel bt3 = new JLabel(buu3);
        bt3.setForeground(Color.white);
        bt3.setBounds(1220,295,50,50);
        add(bt3);

        ImageIcon bo1 =new ImageIcon(ClassLoader.getSystemResource("icon/buttr.png"));     //left button
        Image bo2 =  bo1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon bo3 = new ImageIcon(bo2);
        JLabel btt3 = new JLabel(bo3);
        btt3.setForeground(Color.white);
        btt3.setBounds(230,395,50,50);
        add(btt3);

        ImageIcon boo1 =new ImageIcon(ClassLoader.getSystemResource("icon/butt.png"));
        Image boo2 =  boo1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon boo3 = new ImageIcon(boo2);
        JLabel bto3 = new JLabel(boo3);
        bto3.setForeground(Color.white);
        bto3.setBounds(1220,395,50,50);
        add(bto3);

        ImageIcon u1 =new ImageIcon(ClassLoader.getSystemResource("icon/buttr.png"));         //left button
        Image u2 =  u1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon u3 = new ImageIcon(u2);
        JLabel ut = new JLabel(u3);
        ut.setForeground(Color.white);
        ut.setBounds(230,495,50,50);
        add(ut);

        ImageIcon uy1 =new ImageIcon(ClassLoader.getSystemResource("icon/butt.png"));
        Image uy2 =  uy1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon uy3 = new ImageIcon(uy2);
        JLabel uy = new JLabel(uy3);
        uy.setForeground(Color.white);
        uy.setBounds(1220,495,50,50);
        add(uy);


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
    //override
    public void actionPerformed(ActionEvent e){

        try{
            if (e.getSource()==b1){
                new deposit(pin);
                setVisible(false);

            }else if(e.getSource()==b7){
                System.exit(0);             //to close the whole program ,, setvisible false just for frame
            }
            else if(e.getSource()==b2){
                new withdrawal(pin);
                setVisible(false);

            }else if(e.getSource()==b6){
                new balanceEnquiry(pin);
                setVisible(false);

            }else if(e.getSource()==b3){
                new fastcash(pin);
                setVisible(false);
            
            }


                

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new mainscreen("");
    }
    
}
