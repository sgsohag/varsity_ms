 
package university.management.system;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Bank extends JFrame implements ActionListener{
    
    Bank()
    {
        setBounds(50,20,1300,800);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(350, 0, 200, 200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        /// New Information
        JMenu varsityaccount1 = new JMenu("Varsity Account");
        mb.add(varsityaccount1);
        JMenuItem varsityaccount = new JMenuItem("Varsity Account"); 
        varsityaccount.addActionListener(this);
        varsityaccount1.add(varsityaccount);
        
        JMenuItem varsityaccountdetails = new JMenuItem("Varsity Account Details"); 
        varsityaccountdetails.addActionListener(this);
        varsityaccount1.add(varsityaccountdetails);
        
        //Details
        JMenu details = new JMenu("View Details");
        mb.add(details);
        
        JMenuItem employeedetails = new JMenuItem("View Employee Details");
        employeedetails.addActionListener(this);
        details.add(employeedetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        JMenuItem teacherdetails = new JMenuItem("View Teacher Details");
        teacherdetails.addActionListener(this);
        details.add(teacherdetails);
        
        
        
         //Bank Details
        JMenu fee = new JMenu("Fee & Salary Stucture");
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Student Fee Structure"); 
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem empsalarystructure = new JMenuItem("Employee Salary Structure"); 
        empsalarystructure.addActionListener(this);
        fee.add(empsalarystructure);
        
        JMenuItem teachersalarystructure = new JMenuItem("Teacher Salary Structure"); 
        teachersalarystructure.addActionListener(this);
        fee.add(teachersalarystructure);
        
        
         //pay FEE and salary Bank 
        JMenu feesalary = new JMenu("Pay Fee & Saraly");
        mb.add(feesalary);
        
        JMenuItem studentfrom = new JMenuItem("Student Fee"); 
        studentfrom.addActionListener(this);
        feesalary.add(studentfrom);
        
        JMenuItem employeefrom = new JMenuItem("Employee Salary"); 
        employeefrom.addActionListener(this);
        feesalary.add(employeefrom);
        
        JMenuItem teacherfrom = new JMenuItem("Teacher Salary"); 
        teacherfrom.addActionListener(this);
        feesalary.add(teacherfrom);
       
        
         
         //Bank Details
        JMenu feedetails = new JMenu("Fee & Saraly Details");
        mb.add(feedetails);
       // JMenuItem feestructure = new JMenuItem("Fee Structure"); 
        //feestructure.addActionListener(this);
        //fee.add(feestructure);
        
        JMenuItem student = new JMenuItem("Student Fee Details"); 
        student.addActionListener(this);
        feedetails.add(student);
        
        JMenuItem employee = new JMenuItem("Employee Salary Details"); 
        employee.addActionListener(this);
        feedetails.add(employee);
        
         JMenuItem teacher = new JMenuItem("Teacher Salary Details"); 
        teacher.addActionListener(this);
        feedetails.add(teacher);
       
       
        
        //Utility
        JMenu utility = new JMenu("Utility");
        mb.add(utility);
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.addActionListener(this);
        utility.add(calc);
        
         //About
        JMenu about = new JMenu("About");
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About"); 
        ab.addActionListener(this);
        about.add(ab);
        
        
        //Exit
        JMenu exit = new JMenu("Exit");
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit"); 
        ex.addActionListener(this);
        exit.add(ex);
        
 
        
        setJMenuBar(mb);
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       String msg = ae.getActionCommand();
       
       if(msg.equals("Exit"))
       {
           setVisible(false);
       //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
       else if(msg.equals("Calculator"))
               {
                  try{
                      Runtime.getRuntime().exec("calc.exe");
                  } catch (Exception e)
                  {
                      
                  }
               }
       else if(msg.equals("Notepad"))
               {
                  try{
                      Runtime.getRuntime().exec("notepad.exe");
                  } catch (Exception e)
                  {
                      
                  }
               }
      
       else if(msg.equals("View Teacher Details"))
       {
           new TeacherDetails();
       }
       else if(msg.equals("View Student Details"))
       {
           new StudentDetails();
       }
       else if(msg.equals("View Employee Details"))
       {
           new EmployeeDetails();
       }
       
        else if(msg.equals("Enter Result"))
       {
           new EnterMarks();
       }
       
       else if(msg.equals("See Results"))
       {
           new ExaminationDetails();
       }
       
        else if(msg.equals("Fee Structure"))
       {
           new FeeStructure();
       }
        else if(msg.equals("Student Fee"))
       {
           new StudentFeeForm();
       }
       
       else if(msg.equals("Employee Salary"))
       {
           new EmployeeSalaryForm();
       }
        else if(msg.equals("Teacher Salary"))
       {
           new TeacherSalaryForm();
       }
        else if(msg.equals("Varsity Account Details"))
       {
           new VarsityAccountDetails();
       }
         else if(msg.equals("Varsity Account"))
       {
           new VarsityAccount();
       }
         else if(msg.equals("Student Fee Details"))
       {
           new StudentBankDetails();
       }
       
       else if(msg.equals("Employee Salary Details"))
       {
           new EmployeeBankDetails();
       }
        else if(msg.equals("Teacher Salary Details"))
       {
           new TeacherBankDetails();
       }
        
        else if(msg.equals("Student Fee Form"))
       {
           new StudentFeeForm();
       }
       
       else if(msg.equals("Faculty Leave"))
       {
           new TeacherLeave();
       }
       else if(msg.equals("Student Leave"))
       {
           new StudentLeave();
       }
       
        else if(msg.equals("Faculty Leave Details"))
       {
           new TeacherLeaveDetails();
       }
       else if(msg.equals("Student Leave Details"))
       {
           new StudentLeaveDetails();
       }
       else if(msg.equals("Update Faculty Details"))
       {
           new UpdateTeacher();
       }
       else if(msg.equals("Update Students Details"))
       {
           new UpdateStudent();
       }
       
       
      
       
       else if(msg.equals("About"))
       {
           new About();
       }
       
       
       
       
       
    }
    
    
    public static void main(String[] args) {
        
        new Bank();
        
    }

    
}
