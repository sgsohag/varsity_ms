
package university.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame {
    
    
    About()
    {
         
        setSize(700, 500);
        setLocation(200,50);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html> ");
        heading.setBounds(70, 20, 500, 130);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Sohag Gain");
        name.setBounds(70, 220, 500, 40);
        name.setFont(new Font("serif", Font.BOLD, 30));
        add(name);
        
        
        JLabel rollno = new JLabel("Roll Number: 2011128");
        rollno.setBounds(70, 280, 500, 40);
        rollno.setFont(new Font("serif", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: sohaggain650@gmail.com");
        contact.setBounds(70, 340, 500, 40);
        contact.setFont(new Font("serif", Font.PLAIN, 30));
        add(contact);
        
        
        
        
        
        
        setVisible(true);
        
    }
    
    
    
    public static void main(String[] args) {
        new About();
    }
    
    
    
}
