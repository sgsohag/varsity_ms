 
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
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(350, 0, 200, 200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        /// New Information
        JMenu newInformation = new JMenu("New Information");
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
         studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //Details
        JMenu details = new JMenu("View Details");
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
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
        
        //Exams
        JMenu exam = new JMenu("Examination");
        mb.add(exam);
        JMenuItem examdetails = new JMenuItem("Examination Results");
        examdetails.addActionListener(this);
        exam.add(examdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks"); 
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //UpdateInfo
        JMenu update = new JMenu("Update Details");
        mb.add(update);
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details"); 
        updatefacultyinfo.addActionListener(this);
        update.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Students Details");
        updatestudentinfo.addActionListener(this);
        update.add(updatestudentinfo);
        
        
        //Fee
        JMenu fee = new JMenu("Fee Details");
        mb.add(fee);
        JMenuItem feestructure = new JMenuItem("Fee Structure"); 
        fee.add(feestructure);
        
        JMenuItem feefrom = new JMenuItem("Student Fee Form"); 
        fee.add(feefrom);
        
        //Utility
        JMenu utility = new JMenu("Utility");
        mb.add(utility);
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.addActionListener(this);
        utility.add(calc);
        
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
       else if(msg.equals("New Faculty Information"))
       {
           new AddTeacher();
       }
       else if(msg.equals("New Student Information"))
       {
           new AddStudent();
       }
       else if(msg.equals("View Faculty Details"))
       {
           new TeacherDetails();
       }
       else if(msg.equals("View Student Details"))
       {
           new StudentDetails();
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
       
        else if(msg.equals("Enter Marks"))
       {
           new EnterMarks();
       }
       
       else if(msg.equals("Examination Results"))
       {
           new ExaminationDetails();
       }
       
       
    }
    
    
    public static void main(String[] args) {
        
        new Project();
        
    }

    
}
