package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;



public class signup extends JFrame implements ActionListener{

    JTextField textname,textnamef, textnamedob,textnamemail,textaddress,textstate,textcity,textpin;

        JRadioButton r1,r2;
    Random ran = new Random();                 //for random number

    long first4 =(ran.nextLong() % 9000L)+1000L;  // for random number

    String first = " " + Math.abs(first4);       //stored in string first
    signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/LT.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image  = new JLabel(i3);                                       //Jlabel is used to add image in Jframe
        image.setBounds(10, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form number"+ first);
        label1.setBounds(120,25,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,24));
        add(label1);

        JLabel label2 = new JLabel("Page 1 : Personal Details" );
        label2.setBounds(120, 30, 600, 100);
        label2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(label2);

        //Name

        JLabel label3 = new JLabel("Name :");
        label3.setBounds(100, 120, 100, 30);
        label3.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(label3);

        textname = new JTextField();                                         // to add white box
        textname.setBounds(300, 120, 400, 30);
        textname.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textname);

        //fathers name

        JLabel label4 = new JLabel("Fathers Name :");
        label4.setBounds(100, 170, 300, 30);
        label4.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(label4);

        textnamef = new JTextField();                                         // to add white box
        textnamef.setBounds(300, 170, 400, 30);
        textnamef.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textnamef);
        
        //date of birth

        JLabel Dob = new JLabel("Date of Birth:");
        Dob.setBounds(100, 220, 300, 30);
        Dob.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(Dob);

        textnamedob = new JTextField();                                         // to add white box
        textnamedob.setBounds(300, 220, 400, 30);
        textnamedob.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textnamedob);

        //gender

        JLabel gender= new JLabel("Gender :");
        gender.setBounds(100, 270, 100, 30);
        gender.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(gender);

        // buttons for gender

        r1=new JRadioButton("Male");                                      //button for male
        r1.setBounds(350,270, 100,30);
        r1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        r1.setBackground(new Color(255,240,245));
        add(r1);
        
        r2=new JRadioButton("Female");
        r2.setBounds(550,270, 100,30);
        r2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        r2.setBackground(new Color(255,240,245));
        add(r2);

         //button choose for gender

        ButtonGroup buttonGroup = new ButtonGroup();                   //because we have to select only one button
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //email
        
        JLabel email = new JLabel("Email :");
        email.setBounds(100, 320, 100, 30);
        email.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(email);

        textnamemail= new JTextField();
        textnamemail.setBounds(300, 320, 400, 30);
        textnamemail.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textnamemail);

        //address

        JLabel address = new JLabel("Address :");
        address.setBounds(100, 370, 100, 30);
        address.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(address);

        textaddress= new JTextField();                                           //box for the input
        textaddress.setBounds(300, 370, 400, 30);
        textaddress.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textaddress);


        //state

        JLabel state = new JLabel("State :");
        state.setBounds(100, 420, 100, 30);
        state.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(state);

        textstate= new JTextField();                                           //box for the input
        textstate.setBounds(300, 420, 400, 30);
        textstate.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textstate);


        //city

        JLabel city = new JLabel("City :");
        city.setBounds(100, 470, 100, 30);
        city.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(city);

        textcity= new JTextField();                                           //box for the input
        textcity.setBounds(300, 470, 400, 30);
        textcity.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textcity);


          //Pincode

        JLabel pin = new JLabel("Pin code :");
        pin.setBounds(100, 520, 100, 30);
        pin.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(pin);

        textpin= new JTextField();                                           //box for the input
        textpin.setBounds(300, 520, 400, 30);
        textpin.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
        add(textpin);

        //buttons

        JButton next = new JButton("Next");
        next.setBounds(550, 630, 150, 30);
        next.setFont(new Font("Ralway",Font.BOLD,15));
        // add ACTIONLISTENER*******
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new ColorUIResource(255,240,245));   //to set background color
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 70);
        setVisible(true);                                                       //to make visible


    }

    //overrideing Action listener outside main funtion
    public void actionPerformed(ActionEvent e){

        String formno = first;
        String name = textname.getText();
        String Fname = textnamef.getText();
        String DOB = textnamedob.getText();
        String Gender = null;
        if(r1.isSelected()){
            Gender = "male";
        }else{
            Gender = "female";
        }
        String Email = textnamemail.getText();
        
        String Address = textaddress.getText();
        String State = textstate.getText();
        String City = textcity.getText();
        String Pincode = textpin.getText();



              // showing message dialog and to prevent exceptions

        try{
                if(textname.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");

                }else{
                    Conn con1 = new Conn();
                                //new object con1
                    // create a querry
                    String q ="insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+DOB+"','"+Gender+"','"+Email+"','"+Address+"','"+State+"','"+City+"','"+Pincode+"')";
                    con1.statement.executeUpdate(q);
                    new signup2(formno);
                    setVisible(false);

                    
                
                }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
    

public static void main(String[] args) {
    new signup();
}
}