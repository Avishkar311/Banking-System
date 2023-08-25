package banking.management.system;

import java.sql.*;

public class Conn {

    Connection connection;

    Statement statement;

    public Conn(){

        try{
            connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystemMana","root","123456");
            statement = connection.createStatement();
        
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Conn();
    }
}
