 
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


public class Library extends JFrame implements ActionListener{
    
   Library()
    {
        setBounds(50,20,1300,800);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/library1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(350, 0, 200, 200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        /// New Information
        JMenu newInformation = new JMenu("Add New");
        mb.add(newInformation);
        
        JMenuItem employeeInfo = new JMenuItem("Book");
        employeeInfo.addActionListener(this);
        newInformation.add(employeeInfo);
        
        
        JMenuItem studentInfo = new JMenuItem("Request Book");
         studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        
        
        //Faculty
        JMenu facultyInformation = new JMenu("Faculty Details");
        mb.add(facultyInformation);
        
        JMenuItem science = new JMenuItem("Science");
        science.addActionListener(this);
        facultyInformation.add(science);
        
        
        JMenuItem arts = new JMenuItem("Arts");
         arts.addActionListener(this);
        facultyInformation.add(arts);
        
         JMenuItem engineering = new JMenuItem("Engineering");
         engineering.addActionListener(this);
        facultyInformation.add(engineering);
        
        JMenuItem commers = new JMenuItem("Commers");
         commers.addActionListener(this);
        facultyInformation.add(commers);
        
        
        
        
        
        //JMenuItem feefrom = new JMenuItem("Student Fee Form");
        //feefrom.addActionListener(this);
        //fee.add(feefrom);
        
        
        //Library
        JMenu library = new JMenu("Library Details");
        mb.add(library);
        
        JMenuItem booklist = new JMenuItem("Book List"); 
        booklist.addActionListener(this);
        library.add(booklist);
        
        JMenuItem requestbook = new JMenuItem("Request Book List");
        requestbook.addActionListener(this);
        library.add(requestbook);
        
        
       
        
        
        
  
        
       
        
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
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
       else if(msg.equals("Book"))
       {
           new AddBook();
       }
       else if(msg.equals("Request Book"))
       {
           new RequestBook();
       }
       else if(msg.equals("Employee"))
       {
           new AddEmploye();
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
           new StudentBankDetails();
       }
       
       else if(msg.equals("Employee Salary"))
       {
           new EmployeeBankDetails();
       }
        else if(msg.equals("Teacher Salary"))
       {
           new TeacherBankDetails();
       }
        else if(msg.equals("Varsity Account"))
       {
           new VarsityAccountDetails();
       }
        
        else if(msg.equals("Student Fee Form"))
       {
           new StudentFeeForm();
       }
        
         else if(msg.equals("Book List"))
       {
           new BookList();
       }
         
          else if(msg.equals("Request Book List"))
       {
           new RequestBookDetails();
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
       else if(msg.equals("Update Teacher Details"))
       {
           new UpdateTeacher();
       }
       else if(msg.equals("Update Students Details"))
       {
           new UpdateStudent();
       }
       else if(msg.equals("Update Employee Details"))
       {
           new UpdateEmployee();
       }
       
       
      
       
       else if(msg.equals("About"))
       {
           new About();
       }
       
       
       
       
       
    }
    
    
    public static void main(String[] args) {
        
        new Library();
        
    }

    
}
