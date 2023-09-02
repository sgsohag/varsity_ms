
package university.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfname, tffname,tfrollno, tfadress, tfphone,tfemail;
    JDateChooser dcdob;
    JComboBox cbcourse,cbdepartment;
    JButton submit, cancel;
    
    AddStudent()
    {
        setSize(900,650);
        setLocation(300,30);
        
        setLayout(null);
        
        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD,30));
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD,20));
        add(lblname);
        
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD,20));
        add(lblfname);
        
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD,20));
        add(lblrollno);
        
        
        tfrollno = new JTextField();
        tfrollno.setBounds(200, 200, 150, 30);
        add(tfrollno);
        
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD,20));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);
        
       
        JLabel lbladress = new JLabel("Adress");
        lbladress.setBounds(50, 250, 200, 30);
        lbladress.setFont(new Font("serif", Font.BOLD,20));
        add(lbladress);
        
        
        tfadress = new JTextField();
        tfadress.setBounds(200, 250, 150, 30);
        add(tfadress);
        
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD,20));
        add(lblphone);
        
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        //
         JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD,20));
        add(lblemail);
        
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(400, 300, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD,20));
        add(lblcourse);
        
        String course[]= {"B.tech","BBA", "BSc", "MSc", "MBA", "MA", "BA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(600,300,150,30);
        add(cbcourse);
        
        
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(50, 350, 200, 30);
        lbldepartment.setFont(new Font("serif", Font.BOLD,20));
        add(lbldepartment);
        
        String department[]= {"CSE","EEE", "Math", "Social Work", "Fhisaris", "Management", "Geography"};
        cbdepartment = new JComboBox(department);
        cbdepartment.setBounds(200,350,150,30);
        add(cbdepartment);
        
        
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = tfrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String adress = tfadress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String course =(String) cbcourse.getSelectedItem();
            String department = (String) cbdepartment.getSelectedItem();
            
            try{
                String query = "insert into student values('"+name+"', '"+fname+"','"+rollno+"','"+dob+"','"+adress+"','"+phone+"','"+email+"','"+course+"','"+department+"')";
                
                Connect con= new Connect();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                
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
        new AddStudent();
    }

    
}
