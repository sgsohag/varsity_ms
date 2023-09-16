
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


public class VarsityAccount extends JFrame implements ActionListener {
    JTextField yearmonth, labeltotal,have,spending;
    Choice crollno;
    //JLabel labeltotal;
    JComboBox cbcourse, cbdepartment, cbsemester;
    JButton update,pay,cancel;
    
   VarsityAccount()
    {
        setSize(900, 500);
        setLocation(200,50);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 50, 500, 300);
        add(image);
        
        
        

        
        JLabel havemoney = new JLabel("Have Money");
        havemoney.setBounds(40, 50, 150, 20);
        havemoney.setFont(new Font("serif", Font.BOLD, 16));
        add(havemoney);
        
        
        have = new JTextField();
       have.setBounds(200, 50, 150, 20);
        add(have);
        
        JLabel spendingmoney = new JLabel("Spending Money");
        spendingmoney.setBounds(40, 100, 150, 20);
        spendingmoney.setFont(new Font("serif", Font.BOLD, 16));
        add(spendingmoney);
        
        
        spending = new JTextField();
       spending.setBounds(200, 100, 150, 20);
        add(spending);
        
        
        
        JLabel lblsemester = new JLabel("Month & Year");
        lblsemester.setBounds(40, 150, 150, 20);
        lblsemester.setFont(new Font("serif", Font.BOLD, 16));
        add(lblsemester);
        
        
        yearmonth = new JTextField();
       yearmonth.setBounds(200, 150, 150, 20);
        add(yearmonth);
        
        
        JLabel lbltotal = new JLabel("Total");
        lbltotal.setBounds(40, 200, 150, 20);
        lbltotal.setFont(new Font("serif", Font.BOLD, 16));
        add(lbltotal);
        
        
        labeltotal = new JTextField();
       labeltotal.setBounds(200, 200, 150, 20);
        add( labeltotal);
        
        
        
        
        
        //update = new JButton("Update");
        //update.setBounds(30, 380, 100, 25);
       // update.setFont(new Font("serif", Font.BOLD, 16));
        //update.addActionListener(this);
        //add(update);
        
        
         pay = new JButton("Add Money");
        pay.setBounds(120,300,120,25);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.red);
        
        pay.addActionListener(this);
        pay.setFont(new Font("serif", Font.BOLD, 16));
        add(pay);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(290,300,100,25);
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
                ResultSet rs = c.s.executeQuery("select * from teachersalary where tid = '"+course+"'");
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
           // String tid = crollno.getSelectedItem();
           //String course = (String) cbcourse.getSelectedItem();
            String havemoney = (String) have.getText();
            String spendingmoney = (String) spending.getText();
             String yearmonth1 = (String) yearmonth.getText();
             //String department = (String) cbdepartment.getSelectedItem();
             String total = labeltotal.getText();
             
             try{
                Connect c = new Connect();
                String query = "insert into varsityaccount values('"+havemoney+"','"+spendingmoney+"','"+yearmonth1+"','"+total+"')";
               c.s.executeUpdate(query);
               
               JOptionPane.showMessageDialog(null, "Varsity Account Insert Successfully");
               
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
        new VarsityAccount();
    }

    
}
