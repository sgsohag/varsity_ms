
package university.management.system;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;



public class FeeStructure extends JFrame{
    
    JTable table;
    
    FeeStructure()
    {
        
        setSize(1000, 700);
        setLocation(200,20);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        
        JLabel heading = new JLabel("Fee Strucrure");
        heading.setBounds(50, 10, 400, 30);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
         table = new JTable();
          table.setFont(new Font("Tahoma", Font.PLAIN, 16));
          
          try{
                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery("select * from fee");
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch (Exception e)
            {
                e.printStackTrace();
            }
          
          
          JScrollPane jsp = new JScrollPane(table);
          jsp.setBounds(0, 60, 1000, 700);
          add(jsp);
        
        
        
        
        
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new FeeStructure();
    }
    
}
