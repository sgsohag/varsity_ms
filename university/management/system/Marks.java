
package university.management.system;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Marks extends JFrame implements ActionListener{
    
    String rollno;
    JButton cancel;
    
    Marks(String rollno)
    {
        this.rollno = rollno;
        
        setSize(500, 600);
        setLocation(300,50);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
       
        JLabel heading = new JLabel("BSFMSTU");
        heading.setBounds(160, 10, 500, 25);
        heading.setFont(new Font("serif", Font.BOLD, 20));
        add(heading);
        
        JLabel subheading = new JLabel("Result of Examination 2023");
        subheading.setBounds(100, 50, 500, 20);
        subheading.setFont(new Font("serif", Font.BOLD, 18));
        add(subheading);
        
        JLabel lblrollno = new JLabel("Roll Number "+rollno);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("serif", Font.PLAIN, 18));
        add(lblrollno);
        
        
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("serif", Font.PLAIN, 18));
        add(lblsemester);
        
        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("serif", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("serif", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("serif", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("serif", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("serif", Font.PLAIN, 18));
        add(sub5);
        
        
        
        try{
                Connect c = new Connect();
                ResultSet rs1 = c.s.executeQuery("select * from subject where rollno='"+rollno+"'");
                while(rs1.next())
                {
                    sub1.setText(rs1.getString("subject1"));
                    sub2.setText(rs1.getString("subject2"));
                    sub3.setText(rs1.getString("subject3"));
                    sub4.setText(rs1.getString("subject4"));
                    sub5.setText(rs1.getString("subject5"));
                }
                ResultSet rs2 = c.s.executeQuery("select * from marks where rollno='"+rollno+"'");
                while(rs2.next())
                {
                    sub1.setText(sub1.getText() + "----------"+rs2.getString("marks1"));
                    sub2.setText(sub2.getText() + "----------"+rs2.getString("marks2"));
                    sub3.setText(sub3.getText() + "----------"+rs2.getString("marks3"));
                    sub4.setText(sub4.getText() + "----------"+rs2.getString("marks4"));
                    sub5.setText(sub5.getText() + "----------"+rs2.getString("marks5"));
                    lblsemester.setText("Semester " + rs2.getString("semester"));
                    
                }
                
                
                
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(250,500,150,25);
        cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.red);
       cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);
        
        
        
        
        setVisible(true);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == cancel)
        
            setVisible(false);
        }
    
    public static void main(String[] args) {
        new Marks("");
    }
}