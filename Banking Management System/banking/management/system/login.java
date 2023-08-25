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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener{

JLabel label1, label2,label3; //globally declared

JTextField textfield1;

JPasswordField passwordField2;

JButton button1,button2,button4;

    //extended  for Jframe which is in swing package
    //constructor name
    login(){
        super("Bank System");

        //for title but declare it right after construcutor
        //imageicon is used to input the image in i1

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/LT.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image  = new JLabel(i3);  //Jlabel is used to add image in Jframe
        image.setBounds(370, 10, 100, 100);
        add(image);           //to add image in the frame

        label1 = new JLabel("Welcome to Liberty Trust");
        label1.setForeground(Color.WHITE);                           //to set color
        label1.setBounds(250,130,650,40);
        label1.setFont(new Font("AvantGarde",Font.BOLD,30));
        add(label1);

        label2 = new JLabel("Card NO :");
        label2.setForeground(Color.white);                           //to set color
        label2.setBounds(170,190,650,40);
        label2.setFont(new Font("Ralway",Font.BOLD,25));
        add(label2);

        textfield1 = new JTextField(15);                    // white box
        textfield1.setBounds(350, 190, 300 ,40);
        textfield1.setFont(new Font("Ariel",Font.BOLD,25));
        add(textfield1);

        label3 = new JLabel("PIN :");
        label3.setForeground(Color.WHITE);
        label3.setBounds(170, 250, 650, 40);
        label3.setFont(new Font("Ralway",Font.BOLD , 25));
        add(label3);
        
        passwordField2 = new JPasswordField(15);            // white box
        passwordField2.setBounds(350, 250, 300 ,40);
        passwordField2.setFont(new Font("Ariel",Font.BOLD,25));
        add(passwordField2);

        button1 = new JButton("Sign in");
        button1.setFont(new Font("Ariel",Font.BOLD, 15));
        button1.setForeground(Color.black);                //color of font
        button1.setBounds(250, 350, 150, 40);
        button1.addActionListener(this);           //for the system to know that we clicked on a button and it gets stored in action event
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Ariel",Font.BOLD, 15));
        button2.setForeground(Color.black);                //color of font
        button2.setBounds(430, 350, 150, 40);
        button2.addActionListener(this);
        add(button2);

        button4 = new JButton("Sign Up");
        button4.setBounds(320,400,200,40);
        button4.setFont(new Font("Ariel",Font.BOLD,15));
        button4.addActionListener(this);
        add(button4);

        //background image at the last**************************

        ImageIcon n1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg2.jpg"));
        Image n2 = n1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon n3=new ImageIcon(n2);
        JLabel image1  = new JLabel(n3);  //used tos how text on frame
        image1.setBounds(0, 0, 850, 480);
        add(image1);
        
        setLayout(null);  // layout of frame(default is border layout)
        setSize(850, 500);
        setVisible(true);
        setLocation(500, 340);  //open the frame from center

    }
public void actionPerformed(ActionEvent e){                     //to override action listener and to take input
        try{
        if(e.getSource() == button1){
        Conn c =new Conn();
        String cardno = textfield1.getText();           //this is to connect mainframe and to get input cardno and pin
            String pin = passwordField2.getText();
            String q="select*from login where card_number = '"+cardno+"' and pin = '"+pin+"'";   //to match the pin and card no from sql
            ResultSet resultSet = c.statement.executeQuery(q);       //we are extracting values to put execute query and not update
            if(resultSet.next()){
                setVisible(false);
                new mainscreen(pin);
            }else{
                JOptionPane.showMessageDialog(null,"Wrong details");
            }

            }else if(e.getSource() == button2){
                textfield1.setText("");
                passwordField2.setText("");

            }else if(e.getSource()== button4){
                new signup();
                setVisible(false);
            }
}      catch(Exception E){
    E.printStackTrace();                             //error jo aayega vo visivle aayyega
}
}
public static void main(String[] args) {
            //object creation in main function
new login();
}

}