package banking.management.system;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.plaf.ColorUIResource;

public class signup3 extends JFrame implements ActionListener{
    String formno;
    
    

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton s,c;

    signup3(String formno){

        this.formno=formno;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/LT.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,20, 100,100);
        add(image);

        //label page no

        JLabel page = new JLabel("Page 3");
        page.setBounds(200, 50, 100, 40);
        page.setFont(new Font("Ralway",Font.BOLD,20));
        add(page);

        //account dtails

        JLabel l2 = new JLabel("Account details :");
        l2.setBounds(200, 80, 300, 40);
        l2.setFont(new Font("Ralway",Font.BOLD,20));
        add(l2);

        //account type

        JLabel l3 = new JLabel("Account Type :");
        l3.setBounds(100, 150, 250, 40);
        l3.setFont(new Font("Ralway",Font.BOLD,20));
        add(l3);

        //buttons

        r1 = new JRadioButton("Saving Accounts");
        r1.setBounds(300, 150, 200, 40);
        r1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        r1.setBackground(getForeground());
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(500, 150, 500, 40);
        r2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        r2.setBackground(getForeground());
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(300, 200, 200, 40);
        r3.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        r3.setBackground(getForeground());
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(500, 200, 500, 40);
        r4.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        r4.setBackground(getForeground());
        add(r4);
        
        ButtonGroup account = new ButtonGroup();
        account.add(r1);
        account.add(r2);
        account.add(r3);
        account.add(r3);

        //Card Number***************

        JLabel l4 = new JLabel("Card Number :");
        l4.setBounds(100, 270, 250, 40);
        l4.setFont(new Font("Ralway",Font.BOLD,20));
        add(l4);

        JLabel l5 = new JLabel("(Enter you 16-digit card number)");
        l5.setBounds(95, 290, 250, 40);
        l5.setFont(new Font("Ralway",Font.BOLD,11));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-8421");
        l6.setBounds(300, 270, 350, 40);
        l6.setFont(new Font("Ralway",Font.BOLD,20));
        add(l6);

        //pin

        JLabel l7 = new JLabel("PIN :");
        l7.setBounds(100, 350, 250, 40);
        l7.setFont(new Font("Ralway",Font.BOLD,20));
        add(l7);

        JLabel l9 = new JLabel("(4 digit password)");
        l9.setBounds(95, 370, 250, 40);
        l9.setFont(new Font("Ralway",Font.BOLD,11));
        add(l9);

        JLabel l8 = new JLabel("XXXX");
        l8.setBounds(300, 350, 350, 40);
        l8.setFont(new Font("Ralway",Font.BOLD,20));
        add(l8);

        //services required

        JLabel l11 = new JLabel("Services Required :");
        l11.setBounds(100, 430, 250, 40);
        l11.setFont(new Font("Ralway",Font.BOLD,20));
        add(l11);

        //checkboxes

        c1 = new JCheckBox("ATM CARD");
        c1.setBounds(300, 430, 150, 40);
        c1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        c1.setBackground(getForeground());
        add(c1);

        c2 = new JCheckBox("Internet banking");
        c2.setBounds(500, 430, 300, 40);
        c2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        c2.setBackground(getForeground());
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(300, 480, 200, 40);
        c3.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        c3.setBackground(getForeground());
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBounds(500, 480, 200, 40);
        c4.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        c4.setBackground(getForeground());
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(300, 530, 200, 40);
        c5.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        c5.setBackground(getForeground());
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(500, 530, 200, 40);
        c6.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        c6.setBackground(getForeground());
        add(c6);

        //self declare

        c7 = new JCheckBox("I hereby delcare that the above filled details are correct to my knowledge");
        c7.setBounds(100, 580, 700, 40);
        c7.setFont(new Font("Ralway",Font.BOLD,16));
        c7.setBackground(getForeground());
        add(c7);

        //formno

        JLabel l12 = new JLabel("Form No:");
        l12.setBounds(600, 50, 100, 40);
        l12.setFont(new Font("Ralway",Font.BOLD,15));
        add(l12);

        JLabel lform = new JLabel();                   //globally declared thats why used from signup 1
        lform.setBounds(650, 50, 100, 40);
        lform.setFont(new Font("Ralway",Font.BOLD,15));
        add(lform);

        //button submit

        s = new JButton("Submit");
        s.setBounds(200, 650, 150, 40);
        s.setFont(new Font("Ralway",Font.BOLD,18));
        s.addActionListener(this);
        add(s);

        //cancel button
        c = new JButton("Cancel");
        c.setBounds(500, 650, 150, 40);
        c.setFont(new Font("Ralway",Font.BOLD,18));
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new ColorUIResource(203,187,219));
        setLayout(null);
        setSize(850,800);
        setLocation(360,100);
        setVisible(true);


    }
    //overrideeee

    public void actionPerformed(ActionEvent e){

        String atype=null;                                    //put the spelling coreectly**********************************
        if(r1.isSelected()){
            atype ="Saving Accounts";                          //this in inverted commas
        }else if(r2.isSelected()){
            atype ="Fixed Deposit Account";

        }else if(r3.isSelected()){
            atype ="Current Account";
            
        }else if(r4.isSelected()){
            atype ="Recurring Deposit Account";
            
        }
        //random number for card no************************************************************

        Random ran = new Random();
        long first7 =(ran.nextLong()%90000000L)+ 1409963000000000L;
        String cardno=""+Math.abs(first7);

        //random pin number

        long first3 =(ran.nextLong()%9000L)+1000L;
        String pin ="" + Math.abs(first3);

        //*************************************random function */

        String fac = ("");
        if(c1.isSelected()){
            fac +="ATM CARD";               //+= because the customer can have both atm card and other facilities
        }else if(c2.isSelected()){
            fac += "Internet banking";
        }else if(c3.isSelected()){
            fac += "Mobile Banking";
        }else if(c4.isSelected()){
            fac += "EMAIL Alerts";
        }else if(c5.isSelected()){
            fac += "Cheque Book";
        }else if(c6.isSelected()){
            fac += "E-Statement";
        }

        try{
            if(e.getSource()==s){
                if(atype.equals("")){         //for button to be not pressed or empty we put e.getsource
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Conn c2 = new Conn();
                    String q1 ="insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 ="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                c2.statement.executeUpdate(q1);
                c2.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Card number :"+cardno+ "\n Pin :"+pin);
                new deposit(pin);
                setVisible(false);
                }
                
                }else if(e.getSource()==c){
                    setVisible(false);

            }
            




        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup3("");
    }
    
}
