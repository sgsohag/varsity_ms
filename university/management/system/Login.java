
package university.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends JFrame implements ActionListener{
    
    JButton login, cancel;
    JTextField tfusername,tfpassword; 
    int count=0;
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblusername = new JLabel("UserName : ");
        lblusername.setBounds(40, 20, 100, 20);
        lblusername.setFont(new Font("serif", Font.BOLD, 15));
        add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);
        
        
        JLabel lblpassword = new JLabel("Password : ");
        lblpassword.setBounds(40, 50, 100, 20);
        lblpassword.setFont(new Font("serif", Font.BOLD, 15));
        add(lblpassword);
        
         tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 50, 150, 20);
        add(tfpassword);
        
         login = new JButton("Login");
        login.setBounds(40,140,120,40);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.red);
        
        login.addActionListener(this);
        login.setFont(new Font("serif", Font.BOLD, 16));
        add(login);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,140,120,40);
        cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.red);
       cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);
        
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setBounds(500, 250, 600, 300);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == login)
        {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            
            try{
                Connect c= new Connect();
               ResultSet rs = c.s.executeQuery(query);
               
               if(rs.next())
               {
                   count = 1;
                   //setVisible(false);
                   //new Project();
               }
               //else{
                 // JOptionPane.showMessageDialog(null, "Invalid usename or password");
                 // setVisible(false);
               //}
               c.s.close();
               
            } catch (Exception c){
                c.printStackTrace();
            }
            
            
             String query1 = "select * from teacherlogin where username='"+username+"' and password='"+password+"'";
            
            try{
                Connect c= new Connect();
               ResultSet rs = c.s.executeQuery(query1);
               
               if(rs.next())
               {
                   count = 2;
                   //setVisible(false);
                   //new Teacher();
               }
              // else{
                  //JOptionPane.showMessageDialog(null, "Invalid usename or password");
                  //setVisible(false);
              // }
               c.s.close();
               
            } catch (Exception c){
                c.printStackTrace();
            }
            
            String query2 = "select * from banklogin where username='"+username+"' and password='"+password+"'";
            
            try{
                Connect c= new Connect();
               ResultSet rs = c.s.executeQuery(query2);
               
               if(rs.next())
               {
                   count = 3;
                   //setVisible(false);
                   //new Teacher();
               }
              // else{
                  //JOptionPane.showMessageDialog(null, "Invalid usename or password");
                  //setVisible(false);
              // }
               c.s.close();
               
            } catch (Exception c){
                c.printStackTrace();
            }
            
            
            String query3 = "select * from librarylogin where username='"+username+"' and password='"+password+"'";
            
            try{
                Connect c= new Connect();
               ResultSet rs = c.s.executeQuery(query3);
               
               if(rs.next())
               {
                   count = 4;
                   //setVisible(false);
                   //new Teacher();
               }
              // else{
                  //JOptionPane.showMessageDialog(null, "Invalid usename or password");
                  //setVisible(false);
              // }
               c.s.close();
               
            } catch (Exception c){
                c.printStackTrace();
            }
            
            
            if(count==1)
            {
                setVisible(false);
                   new Project();
            }
            
            else if(count==2)
            {
                setVisible(false);
                   new Teacher();
            }
            
            else if(count==3)
            {
                setVisible(false);
                   new Bank();
            }
            
            else if(count==4)
            {
                setVisible(false);
                   new Library();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid usename or password");
                  //setVisible(false);
            }
            
            
            
        }
        else if(e.getSource() == cancel)
        {
            setVisible(false);
        }
        
    }

    
    
    
    public static void main(String[] args) {
        new Login();
    }

        
}
