package university.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class UpdateTeacher extends JFrame implements ActionListener {

    JTextField tfnameb,tfnamee, tfadress, tfphone,tfemail, tfdesignation, tfquota,tfblood,tfguardian,cbcourse,cbdepartment;
    JDateChooser dcdob;
   // JComboBox cbcourse,cbdepartment;
    JRadioButton male,female,other,married,unmarried;
    JButton update, cancel;
    Choice crollno;
    JLabel labelrollno,tfmname, tffname, tfid,empid;

    UpdateTeacher() {
        setSize(900, 650);
        setLocation(300, 30);

        setLayout(null);

        JLabel heading = new JLabel("Update Teacher Details");
        heading.setBounds(310, 0, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lblrollnumber = new JLabel("Select Teacher ID");
        lblrollnumber.setBounds(50, 70, 200, 20);
        lblrollnumber.setFont(new Font("serif", Font.PLAIN, 18));
        add(lblrollnumber);

        crollno = new Choice();
        crollno.setBounds(250, 70, 200, 20);
        add(crollno);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                crollno.add(rs.getString("tid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

       JLabel lblnameb = new JLabel("Name(Bangla)");
        lblnameb.setBounds(50, 100, 150, 30);
        lblnameb.setFont(new Font("serif", Font.BOLD,20));
        add(lblnameb);
        
        
        tfnameb = new JTextField();
        tfnameb.setBounds(200, 100, 150, 30);
        add(tfnameb);
        
        JLabel lblnamee = new JLabel("Name(English)");
        lblnamee.setBounds(50, 140, 150, 30);
        lblnamee.setFont(new Font("serif", Font.BOLD,20));
        add(lblnamee);
        
        
        tfnamee = new JTextField();
        tfnamee.setBounds(200, 140, 150, 30);
        add(tfnamee);
        
        JLabel lblmname = new JLabel("Mother's Name");
        lblmname.setBounds(400, 100, 200, 30);
        lblmname.setFont(new Font("serif", Font.BOLD,20));
        add(lblmname);
        
        
        tfmname = new JLabel();
        tfmname.setBounds(600, 100, 150, 30);
        add(tfmname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 140, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD,20));
        add(lblfname);
        
        
        tffname = new JLabel();
        tffname.setBounds(600, 140, 150, 30);
        add(tffname);
        
        JLabel lblid = new JLabel("Teacher ID");
        lblid.setBounds(50, 180, 200, 30);
        lblid.setFont(new Font("serif", Font.BOLD,20));
        add(lblid);
        
        
        empid = new JLabel();
        empid.setBounds(200, 180, 150, 30);
        add(empid);
        
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 180, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD,20));
        add(lbldob);
        
       JLabel labeldob = new JLabel();
        labeldob.setBounds(600, 180, 150, 30);
        labeldob.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labeldob);
       
         JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("serif", Font.BOLD,20));
        gender.setBounds(50, 220, 200, 30);
        add(gender);
        //
        male = new JRadioButton("M");
        male.setBounds(200, 220, 40, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Fe");
        female.setBounds(250, 220, 40, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
         other = new JRadioButton("O");
        other.setBounds(300, 220, 40, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        JLabel lbladress = new JLabel("Adress");
        lbladress.setBounds(400, 220, 200, 30);
        lbladress.setFont(new Font("serif", Font.BOLD,20));
        add(lbladress);
        
        
        tfadress = new JTextField();
        tfadress.setBounds(600, 220, 150, 30);
        add(tfadress);
        
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(50, 260, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD,20));
        add(lblphone);
        
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 260, 150, 30);
        add(tfphone);
        
        //
         JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(400, 260, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD,20));
        add(lblemail);
        
        
        tfemail = new JTextField();
        tfemail.setBounds(600, 260, 150, 30);
        add(tfemail);
        
         //
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("serif", Font.BOLD,20));
        marital.setBounds(50, 300, 200, 30);
        add(marital);
        
       
        married = new JRadioButton("Married");
        married.setBounds(200, 300, 70, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(280, 300, 70, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
       
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
     
        
        
        JLabel lblcourse = new JLabel("Education");
        lblcourse.setBounds(400, 300, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD,20));
        add(lblcourse);
        
        //String course[]= {"B.tech","BBA", "BSc", "MSc", "MBA", "MA", "BA","Other"};
        cbcourse = new JTextField();
        cbcourse.setBounds(600,300,150,30);
        add(cbcourse);
        
        
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(50, 340, 200, 30);
        lbldepartment.setFont(new Font("serif", Font.BOLD,20));
        add(lbldepartment);
        
       // String department[]= {"CSE","EEE", "Math", "Social Work", "Fhisaris", "Management", "Geography", "Other"};
        cbdepartment = new JTextField();
        cbdepartment.setBounds(200,340,150,30);
        add(cbdepartment);
        
          JLabel lbldesignation = new JLabel("Designation");
        lbldesignation.setBounds(400, 340, 200, 30);
        lbldesignation.setFont(new Font("serif", Font.BOLD,20));
        add(lbldesignation);
        
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(600,340, 150, 30);
        add(tfdesignation);
        
        
       
         JLabel lblquota = new JLabel("Quota");
        lblquota.setBounds(50, 380, 200, 30);
        lblquota.setFont(new Font("serif", Font.BOLD,20));
        add(lblquota);
        
        
        tfquota = new JTextField();
        tfquota.setBounds(200, 380, 150, 30);
        add(tfquota);
        
        JLabel lblblood = new JLabel("Blood Group");
        lblblood.setBounds(400, 380, 200, 30);
        lblblood.setFont(new Font("serif", Font.BOLD,20));
        add(lblblood);
        
        
        tfblood = new JTextField();
        tfblood.setBounds(600, 380, 150, 30);
        add(tfblood);

        try {
            Connect c = new Connect();
            String query = "select * from teacher where tid = '" + crollno.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                tfnameb.setText(rs.getString("nameb"));
                tfnamee.setText(rs.getString("namee"));
                tfmname.setText(rs.getString("mname"));
                tffname.setText(rs.getString("fname"));
                empid.setText(rs.getString("tid"));
               labeldob.setText(rs.getString("dob"));
               
               
        if(male.isSelected())
        {
            male.setText(rs.getString("gender"));
        }
        else if(female.isSelected()){
             female.setText(rs.getString("gender"));
        }
        else if(other.isSelected())
        {
             other.setText(rs.getString("gender"));
        }
        
                tfadress.setText(rs.getString("adress"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                
                if(married.isSelected())
        {
           married.setText(rs.getString("marital"));
        }
        else if(unmarried.isSelected())
        {
           unmarried.setText(rs.getString("marital"));
        }
                 
                
                
                cbcourse.setText(rs.getString("education"));
                cbdepartment.setText(rs.getString("department"));
                tfdesignation.setText(rs.getString("designation"));
               tfquota.setText(rs.getString("quota"));
                tfblood.setText(rs.getString("boold"));
                
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                try {
                    Connect c = new Connect();
                    String query = "select * from teacher where tid = '" + crollno.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                         tfnameb.setText(rs.getString("nameb"));
                tfnamee.setText(rs.getString("namee"));
                tfmname.setText(rs.getString("mname"));
                tffname.setText(rs.getString("fname"));
                empid.setText(rs.getString("tid"));
               labeldob.setText(rs.getString("dob"));
               
               
        if(male.isSelected())
        {
            male.setText(rs.getString("gender"));
        }
        else if(female.isSelected()){
             female.setText(rs.getString("gender"));
        }
        else if(other.isSelected())
        {
             other.setText(rs.getString("gender"));
        }
        
                tfadress.setText(rs.getString("adress"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                
                if(married.isSelected())
        {
           married.setText(rs.getString("marital"));
        }
        else if(unmarried.isSelected())
        {
           unmarried.setText(rs.getString("marital"));
        }
                 
                
                
                cbcourse.setText(rs.getString("education"));
                cbdepartment.setText(rs.getString("department"));
                tfdesignation.setText(rs.getString("designation"));
               tfquota.setText(rs.getString("quota"));
                tfblood.setText(rs.getString("boold"));
                        
                        
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        update = new JButton("Update");
        update.setBounds(250,450,120,40);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.red);

        update.addActionListener(this);
        update.setFont(new Font("serif", Font.BOLD, 16));
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(400, 450, 120, 40);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.red);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);

        setVisible(true);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == update)
        {
           
            String rollno = empid.getText();
            String adress = tfadress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String course =cbcourse.getText();
            String department = cbdepartment.getText();
            
            try{
                String query = "update teacher set adress='"+adress+"',phone='"+phone+"',email='"+email+"',education='"+course+"',department='"+department+"' where tid='"+rollno+"'";
                
                Connect con= new Connect();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Update Successfully");
                
                setVisible(false);
            } catch (Exception c){
                c.printStackTrace();
            }
            

        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateTeacher();
    }

}
