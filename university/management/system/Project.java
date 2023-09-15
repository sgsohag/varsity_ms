 
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


public class Project extends JFrame implements ActionListener{
    
    Project()
    {
        setBounds(50,20,1300,800);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/BSGMSTU.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(350, 0, 200, 200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        /// New Information
        JMenu newInformation = new JMenu("Add New");
        mb.add(newInformation);
        
        JMenuItem employeeInfo = new JMenuItem("Employee");
        employeeInfo.addActionListener(this);
        newInformation.add(employeeInfo);
        
        
        JMenuItem studentInfo = new JMenuItem("Student");
         studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        JMenuItem teacherInfo = new JMenuItem("Teacher");
         teacherInfo.addActionListener(this);
        newInformation.add(teacherInfo);
        
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
        
        //Exams
        JMenu exam = new JMenu("Student Result");
        mb.add(exam);
        
        JMenuItem entermarks = new JMenuItem("Enter Result"); 
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        JMenuItem examdetails = new JMenuItem("See Results");
        examdetails.addActionListener(this);
        exam.add(examdetails);
        
         //Bank Details
        JMenu fee = new JMenu("Bank Details");
        mb.add(fee);
       // JMenuItem feestructure = new JMenuItem("Fee Structure"); 
        //feestructure.addActionListener(this);
        //fee.add(feestructure);
        
        JMenuItem student = new JMenuItem("Student Fee"); 
        student.addActionListener(this);
        fee.add(student);
        
        JMenuItem employee = new JMenuItem("Employee Salary"); 
        employee.addActionListener(this);
        fee.add(employee);
        
         JMenuItem teacher = new JMenuItem("Teacher Salary"); 
        teacher.addActionListener(this);
        fee.add(teacher);
        
        JMenuItem varsityaccount = new JMenuItem("Varsity Account"); 
        varsityaccount.addActionListener(this);
        fee.add(varsityaccount);
        
        
        //JMenuItem feefrom = new JMenuItem("Student Fee Form");
        //feefrom.addActionListener(this);
        //fee.add(feefrom);
        
        
        //Library
        JMenu library = new JMenu("Library");
        mb.add(library);
        
        JMenuItem booklist = new JMenuItem("Book List"); 
        booklist.addActionListener(this);
        library.add(booklist);
        
        JMenuItem requestbook = new JMenuItem("Request Book");
        requestbook.addActionListener(this);
        library.add(requestbook);
        
        
        //Leave
        JMenu leave = new JMenu("Apple Leave");
        mb.add(leave);
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave"); 
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        
        
        
        //Leave Details
        JMenu leavedetails = new JMenu("Leave Details");
        mb.add(leavedetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details"); 
        studentleavedetails.addActionListener(this);
        leavedetails.add(studentleavedetails);
        
        
        
        //UpdateInfo
        JMenu update = new JMenu("Update Info");
        mb.add(update);
        JMenuItem updatefacultyinfo = new JMenuItem("Update Employee Details"); 
        updatefacultyinfo.addActionListener(this);
        update.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Students Details");
        updatestudentinfo.addActionListener(this);
        update.add(updatestudentinfo);
        
         JMenuItem updateteacherinfo = new JMenuItem("Update Teacher Details");
        updateteacherinfo.addActionListener(this);
        update.add(updateteacherinfo);
        
        
       
        
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
       else if(msg.equals("Teacher"))
       {
           new AddTeacher();
       }
       else if(msg.equals("Student"))
       {
           new AddStudent();
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
         
          else if(msg.equals("Request Book"))
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
        
        new Project();
        
    }

    
}
