
package university.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


public class TeacherSalaryForm extends JFrame implements ActionListener {
    JTextField yearmonth, labeltotal;
    Choice crollno;
    //JLabel labeltotal;
    JComboBox cbcourse, cbdepartment, cbsemester;
    JButton update,pay,cancel;
    
   TeacherSalaryForm()
    {
        setSize(900, 500);
        setLocation(200,50);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 50, 500, 300);
        add(image);
        
        
        JLabel lblrollnumber = new JLabel("Select Teacher ID");
        lblrollnumber.setBounds(40, 60, 160, 20);
        lblrollnumber.setFont(new Font("serif", Font.BOLD, 16));
        add(lblrollnumber);

        crollno = new Choice();
        crollno.setBounds(200, 60, 150, 20);
        add(crollno);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                crollno.add(rs.getString("tid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40, 100, 150, 20);
        lblname.setFont(new Font("serif", Font.BOLD, 16));
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(200, 100, 150, 20);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelname);

        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(40, 140, 150, 20);
        lblfname.setFont(new Font("serif", Font.BOLD, 16));
        add(lblfname);

        JLabel labelfname = new JLabel();
        labelfname.setBounds(200, 140, 150, 20);
        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelfname);

        
        try {
            Connect c = new Connect();
            String query = "select * from teacher where tid = '" + crollno.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                try {
                    Connect c = new Connect();
                    String query = "select * from teacher where tid = '" + crollno.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        labelname.setText(rs.getString("name"));
                        labelfname.setText(rs.getString("fname"));
                        
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        
        JLabel lblcourse = new JLabel("Education");
        lblcourse.setBounds(40, 180, 150, 20);
        lblcourse.setFont(new Font("serif", Font.BOLD,16));
        add(lblcourse);
        
        String course[]= {"Btech","BBA", "BSc", "MSc", "MBA", "MA", "BA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200,180,150,20);
        add(cbcourse);
        
        
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(40, 220, 150, 20);
        lbldepartment.setFont(new Font("serif", Font.BOLD,16));
        add(lbldepartment);
        
        String department[]= {"CSE","EEE", "Math", "Social Work", "Fhisaris", "Management", "Geography"};
        cbdepartment = new JComboBox(department);
        cbdepartment.setBounds(200,220,150,20);
        add(cbdepartment);
        
        
        JLabel lblsemester = new JLabel("Month & Year");
        lblsemester.setBounds(40, 260, 150, 20);
        lblsemester.setFont(new Font("serif", Font.PLAIN, 16));
        add(lblsemester);
        
        
        yearmonth = new JTextField();
       yearmonth.setBounds(200, 260, 150, 20);
        add(yearmonth);
        
        
        JLabel lbltotal = new JLabel("Total Payable");
        lbltotal.setBounds(40, 300, 150, 20);
        lbltotal.setFont(new Font("serif", Font.BOLD, 16));
        add(lbltotal);
        
        
        labeltotal = new JTextField();
       labeltotal.setBounds(200, 300, 150, 20);
        add( labeltotal);
        
        
        
        
        
        update = new JButton("Update");
        update.setBounds(30, 380, 100, 25);
        update.setFont(new Font("serif", Font.BOLD, 16));
        update.addActionListener(this);
        add(update);
        
        
         pay = new JButton("Pay Fee");
        pay.setBounds(150,380,100,25);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.red);
        
        pay.addActionListener(this);
        pay.setFont(new Font("serif", Font.BOLD, 16));
        add(pay);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(270,380,100,25);
        cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.red);
       cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);
        
        
        
        
        
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        
        
        if(ae.getSource()==update)
        {
             String course = (String) cbcourse.getSelectedItem();
             String semester = (String) cbsemester.getSelectedItem();
             
             try{
                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery("select * from teachersalary where sid = '"+course+"'");
               while(rs.next())
               {
                   labeltotal.setText(rs.getString(semester));
               }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
             
        }
        else if(ae.getSource()==pay)
        {
            String tid = crollno.getSelectedItem();
           String course = (String) cbcourse.getSelectedItem();
             String yearmonth1 = (String) yearmonth.getText();
             String department = (String) cbdepartment.getSelectedItem();
             String total = labeltotal.getText();
             
             try{
                Connect c = new Connect();
                String query = "insert into teachersalary values('"+tid+"','"+course+"','"+department+"','"+yearmonth1+"','"+total+"')";
               c.s.executeUpdate(query);
               
               JOptionPane.showMessageDialog(null, "Teacher Salary Pay Successfully");
               
                setVisible(false);
                
            }catch (Exception e)
            {
                e.printStackTrace();
            }
             
        }
        else if(ae.getSource()==cancel)
        {
             setVisible(false);
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
        new TeacherSalaryForm();
    }

    
}
