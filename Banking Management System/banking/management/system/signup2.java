package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

public class signup2 extends JFrame implements ActionListener{

    String formno;

    JTextField t1,t2;
    JComboBox c1,c2,c3,c4,c5;

    JRadioButton r1,r12,e1,e2;

    JButton next;
    
    signup2(String formno){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/LT.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,20, 100,100);
        add(image);

        this.formno=formno;
        

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(200, 40, 300, 40);
        l1.setFont(new Font("Ralway",Font.BOLD,20));
        add(l1);

        JLabel l2 = new JLabel("Additional details :");
        l2.setBounds(200, 70, 300, 40);
        l2.setFont(new Font("Ralway",Font.BOLD,20));
        add(l2);

        //*********main info       ****************** */

        //religion

        JLabel l3 = new JLabel("Religion :");
        l3.setBounds(100, 150, 300, 40);
        l3.setFont(new Font("Ralway",Font.BOLD,20));
        add(l3);

        String religion[] = {"Hindu","Muslim","Christian","Sikh","other"};
        c1 = new JComboBox(religion);
        c1.setBackground(new Color(255,240,245));
        c1.setFont(new Font("Ralway", Font.CENTER_BASELINE,14));
        c1.setBounds(300, 155, 320, 30);
        add(c1);

        //category

        JLabel l4 = new JLabel("Category :");
        l4.setBounds(100, 200, 300, 40);
        l4.setFont(new Font("Ralway",Font.BOLD,20));
        add(l4);

        String Category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(Category);
        c2.setBackground(new Color(255,240,245));
        c2.setFont(new Font("Ralway", Font.CENTER_BASELINE,14));
        c2.setBounds(300, 205, 320, 30);
        add(c2);

         //income

        JLabel l5 = new JLabel("Income :");
        l5.setBounds(100, 250, 300, 40);
        l5.setFont(new Font("Ralway",Font.BOLD,20));
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,00","<5,00,000","Upto 10,00,000","Above 10 lakhs"};
        c3 = new JComboBox(income);
        c3.setBackground(new Color(255,240,245));
        c3.setFont(new Font("Ralway", Font.CENTER_BASELINE,14));
        c3.setBounds(300, 255, 320, 30);
        add(c3);

        //education

        JLabel l6 = new JLabel("Education :");
        l6.setBounds(100, 300, 300, 40);
        l6.setFont(new Font("Ralway",Font.BOLD,20));
        add(l6);

        String education[] = {"Non Graduate","Graduate","Post Graduate","Doctorate","Other"};
        c4 = new JComboBox(education);
        c4.setBackground(new Color(255,240,245));
        c4.setFont(new Font("Ralway", Font.CENTER_BASELINE,14));
        c4.setBounds(300, 305, 320, 30);
        add(c4);

        //occupation

        JLabel l7 = new JLabel("Occupation :");
        l7.setBounds(100, 350, 300, 40);
        l7.setFont(new Font("Ralway",Font.BOLD,20));
        add(l7);

        String occupation[] = {"Salaried","Self Employed","Business","Student","Other"};
        c5 = new JComboBox(occupation);
        c5.setBackground(new Color(255,240,245));
        c5.setFont(new Font("Ralway", Font.CENTER_BASELINE,14));
        c5.setBounds(300, 355, 320, 30);
        add(c5);

        // pan number

        JLabel l8 = new JLabel("PAN Number :");
        l8.setBounds(100, 400, 250, 40);
        l8.setFont(new Font("Ralway",Font.BOLD,20));
        add(l8);

        t1 = new JTextField("");
        t1.setBounds(300,405, 400, 30);
        t1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        add(t1);

        //adhar number

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setBounds(100, 450, 250, 40);
        l9.setFont(new Font("Ralway",Font.BOLD,20));
        add(l9);

        t2 = new JTextField("");
        t2.setBounds(300,455, 400, 30);
        t2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,18));
        add(t2);

        //senior citizen

        JLabel lsenior = new JLabel("Senior Citizen :");
        lsenior.setBounds(100, 500, 250, 40);
        lsenior.setFont(new Font("Ralway",Font.BOLD,20));
        add(lsenior);

        r1 = new JRadioButton("Yes");
        r1.setBounds(300, 500, 100, 40);
        r1.setBackground(getForeground());
        r1.setFont(new Font("Ralway",Font.BOLD,17));
        add(r1);

        r12 = new JRadioButton("No");
        r12.setBounds(450,500,100,40);
        r12.setBackground(getForeground());
        r12.setFont(new Font("Ralway",Font.BOLD,17));
        add(r12);

        //button group

        ButtonGroup senior = new ButtonGroup();
        senior.add(r1);
        senior.add(r12);

        //existing account

        JLabel laccount = new JLabel("Existing account :");
        laccount.setBounds(100, 550, 250, 40);
        laccount.setFont(new Font("Ralway",Font.BOLD,20));
        add(laccount);

        e1 = new JRadioButton("Yes");
        e1.setBounds(300, 550, 100, 40);
        e1.setBackground(getForeground());
        e1.setFont(new Font("Ralway",Font.BOLD,17));
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBounds(450,550,100,40);
        e2.setBackground(getForeground());
        e2.setFont(new Font("Ralway",Font.BOLD,17));
        add(e2);

        //button group

        ButtonGroup account = new ButtonGroup();
        account.add(e1);
        account.add(e2);

        //form no

        JLabel lform1 = new JLabel("Form No :");
        lform1.setBounds(650, 50, 100, 40);
        lform1.setFont(new Font("Ralway",Font.BOLD,15));
        add(lform1);

        JLabel lform = new JLabel(formno);                   //globally declared thats why used from signup 1
        lform.setBounds(750, 50, 100, 40);
        lform.setFont(new Font("Ralway",Font.BOLD,15));
        add(lform);

        //Button

        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,15));
        next.setBounds(650, 650, 100, 30);
        next.addActionListener(this);       //imp very imp
        add(next);

        setLayout(null);
        getContentPane().setBackground(new ColorUIResource(203,187,219));
        setSize(850, 800);
        setLocation(360, 70);
        setVisible(true);

    }

    //override*******************************************************************************

    public void actionPerformed(ActionEvent e){

        String rel =(String) c1.getSelectedItem();
        String cat = (String) c2.getSelectedItem();
        String inc = (String)c3.getSelectedItem();
        String edu = (String)c4.getSelectedItem();
        String occ = (String)c5.getSelectedItem();

        String pan = t1.getText();
        String addhar = t2.getText();

        String scitizen = null;         //because checkbox
        if(r1.isSelected()){
            scitizen= "Yes";

        }else if(r12.isSelected()){
            scitizen="No";
        }

        String eAccount = null;         //because checkbox
        if(e1.isSelected()){
            eAccount= "Yes";

        }else if(e2.isSelected()){
            eAccount="No";
        }
        //exception handling***************************************************************

        try{
            if(t1.getText().equals("")|| t2.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Fill all the details");
            }else{
                Conn c1 =new Conn();
                String q ="insert into signup2 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
        
                c1.statement.executeUpdate(q); //////very imp statement to store in sql
                new signup3(formno);
                setVisible(false);


            }



        }catch(Exception E){
            E.printStackTrace();
        }

        

    }
    public static void main(String[] args) {
        new signup2("");

        try{

        }catch(Exception E){
            E.printStackTrace();
        }
    }
}
