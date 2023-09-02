
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class TeacherLeaveDetails extends JFrame implements ActionListener{
    
    Choice tid;
    JTable table;
    JButton search, print,update,add,cancel;
    
    TeacherLeaveDetails()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Search by Teacher ID");
        heading.setBounds(20, 20, 150, 20);
        add(heading);
        
        
        tid = new Choice();
        tid.setBounds(180, 20, 150, 20);
        add(tid);
        
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                tid.add(rs.getString("tid"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from teacherleave");
           
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
        
        
        
         cancel = new JButton("Cancel");
        cancel.setBounds(220, 70, 80, 20);
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
            String query = "select * from teacherleave where tid = '"+tid.getSelectedItem()+"'";
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
        
        else if(ae.getSource()==cancel)
        {
             setVisible(false);
        }
       
        
    }
    
    public static void main(String[] args) {
        new TeacherLeaveDetails();
    }

    
}
