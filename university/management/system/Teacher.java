 
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


public class Teacher extends JFrame implements ActionListener{
    
    Teacher()
    {
        setBounds(50,20,1300,800);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(350, 0, 200, 200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        /// New Information
        JMenu newInformation = new JMenu("Add New");
        mb.add(newInformation);
        
        
      JMenuItem studentInfo = new JMenuItem("Student");
         studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        
        
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
        
         //Syllabus
        JMenu syllabus = new JMenu("Syllabus");
        mb.add(syllabus);
        
        JMenuItem addsyllabus = new JMenuItem("Add"); 
        addsyllabus.addActionListener(this);
        syllabus.add(addsyllabus);
        
         JMenuItem viewsyllabus = new JMenuItem("View");
        viewsyllabus.addActionListener(this);
        syllabus.add(viewsyllabus);
        
        
       
        
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
        JMenuItem feestructure = new JMenuItem("Fee Structure"); 
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem student = new JMenuItem("Student Fee"); 
        student.addActionListener(this);
        fee.add(student);
       
        
        
        
       
        
        
        //UpdateInfo
        JMenu update = new JMenu("Update Info");
        mb.add(update);
       
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Students Details");
        updatestudentinfo.addActionListener(this);
        update.add(updatestudentinfo);
        
        
        
        
       
        
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
      
       else if(msg.equals("Student"))
       {
           new AddStudent();
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
        else if(msg.equals("Add"))
       {
           new AddSyllabus();
       }
         else if(msg.equals("View"))
       {
           new ViewSyllabus();
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
       
       else if(msg.equals("Employee"))
       {
           new EmployeeBankDetails();
       }
        else if(msg.equals("Varsity Account"))
       {
           new EmployeeBankDetails();
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
        
        new Teacher();
        
    }

    
}
