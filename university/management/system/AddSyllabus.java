
package university.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class AddSyllabus extends JFrame implements ActionListener{
    
    JTextField tfnameb,tfnamee, tffname,tfmname, tfid, tfadress, tfphone,tfemail, tfdesignation, empid,tfquota,tfblood,tfguardian,tfcc, tfc,tfct;
    JDateChooser dcdob;
    JComboBox cbcourse,cbdepartment,cbyear,cbsemester;
    JButton submit, cancel;
    JRadioButton male,female,other,married,unmarried;
    
    AddSyllabus()
    {
        setSize(900,650);
        setLocation(300,30);
        
        setLayout(null);
        
        JLabel heading = new JLabel("Add New Syllabus");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD,30));
        add(heading);
        
         JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(50, 100, 150, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD,20));
        add(lblcourse);
        
        String course[]= {"B.tech","BBA", "BSc", "MSc", "MBA", "MA", "BA","Other"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200,100,150,30);
        add(cbcourse);
        
        
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(400, 100, 150, 30);
        lbldepartment.setFont(new Font("serif", Font.BOLD,20));
        add(lbldepartment);
        
        String department[]= {"CSE","EEE", "Math", "Social Work", "Fhisaris", "Management", "Geography", "Other"};
        cbdepartment = new JComboBox(department);
        cbdepartment.setBounds(600,100,150,30);
        add(cbdepartment);
        
        
        JLabel lblyear = new JLabel("Year");
        lblyear.setBounds(50, 150, 150, 20);
        lblyear.setFont(new Font("serif", Font.PLAIN, 16));
        add(lblyear);
        
        
        String year[] = {"Year1", "Year2", "Year3", "Year4"};
        cbyear = new JComboBox(year);
        cbyear.setBounds(200, 150, 150, 20);
        add(cbyear);
        
        
        JLabel lblsemester = new JLabel("Semester");
        lblsemester.setBounds(400, 150, 150, 20);
        lblsemester.setFont(new Font("serif", Font.PLAIN, 16));
        add(lblsemester);
        
        
        String semester[] = {"Semester1", "Semester2", "Semester3", "Semester4","Semester5","Semester6","Semester7","Semester8"};
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(600, 150, 150, 20);
        add(cbsemester);
       
        JLabel lblnamee = new JLabel("Course Code");
        lblnamee.setBounds(50, 200, 150, 30);
        lblnamee.setFont(new Font("serif", Font.BOLD,20));
        add(lblnamee);
        
        
        tfcc = new JTextField();
        tfcc.setBounds(200, 200, 150, 30);
        add(tfcc);
        
        JLabel lblfname = new JLabel("Credit");
        lblfname.setBounds(400, 200, 150, 30);
        lblfname.setFont(new Font("serif", Font.BOLD,20));
        add(lblfname);
        
        
        tfc = new JTextField();
        tfc.setBounds(600, 200, 150, 30);
        add(tfc);
        
        JLabel lblmname = new JLabel("Course Title");
        lblmname.setBounds(50, 250, 150, 30);
        lblmname.setFont(new Font("serif", Font.BOLD,20));
        add(lblmname);
        
        
        tfct = new JTextField();
        tfct.setBounds(200, 250, 550, 30);
        add(tfct);
        
        
        
        
     
        
        
      
        
         submit = new JButton("Submit");
        submit.setBounds(250,450,120,40);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.red);
        
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD, 16));
        add(submit);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(400,450,120,40);
        cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.red);
       cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);
        
        
        
        setVisible(true);
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit)
        {
           
            
            
        
           
       
            
            String education =(String) cbcourse.getSelectedItem();
            String department = (String) cbdepartment.getSelectedItem();
            String year =(String) cbyear.getSelectedItem();
            String semester =(String) cbsemester.getSelectedItem();
            String cc = tfcc.getText();
            String  credit =  tfc.getText();
            String ct = tfct.getText();
            
            
            
            try{
                String query = "insert into syllabus values('"+education+"','"+department+"','"+year+"','"+semester+"','"+cc+"','"+credit+"','"+ct+"')";
                
                Connect con= new Connect();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Syllabus Inserted Successfully");
                
                setVisible(false);
            } catch (Exception c){
                c.printStackTrace();
            }
            
            
        }
        else
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddSyllabus();
    }

    
}
