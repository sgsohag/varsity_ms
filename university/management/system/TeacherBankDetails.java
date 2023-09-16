
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class TeacherBankDetails extends JFrame implements ActionListener{
    
    Choice crollno;
    JTable table;
    JButton search, print,update,add,cancel;
    
    TeacherBankDetails()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Search by Teacher ID");
        heading.setBounds(20, 20, 150, 20);
        add(heading);
        
        
        crollno = new Choice();
        crollno.setBounds(180, 20, 150, 20);
        add(crollno);
        
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                crollno.add(rs.getString("tid"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from teachersalary");
           
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 500);
        add(jsp);
        
        
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);
        
         print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);
        
         add = new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add.addActionListener(this);
        add(add);
        
         //update = new JButton("Update");
        //update.setBounds(320, 70, 80, 20);
        //update.addActionListener(this);
       // add(update);
        
         cancel = new JButton("Cancel");
        cancel.setBounds(320, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);
        
         
       
        
        
        
        setBounds(300,100,900,600);
        
        
        setVisible(true);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==search)
        {
            String query = "select * from teachersalary where tid = '"+crollno.getSelectedItem()+"'";
             try{
                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        
        }
        else if(ae.getSource()==print)
        {
            try{
                table.print();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource()== add)
        {
            setVisible(false);
            new TeacherSalaryForm();
        }
        else if(ae.getSource()==update)
        {
             setVisible(false);
            new UpdateStudent();
        }
        else if(ae.getSource()==cancel)
        {
             setVisible(false);
        }
       
        
    }
    
    public static void main(String[] args) {
        new TeacherBankDetails();
    }

    
}
