package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class UpdateStudent extends JFrame implements ActionListener {

    JTextField tfcourse, tfrollno, tfadress, tfphone, tfemail, tfdepartment;
    //JDateChooser dcdob;
    //JComboBox cbcourse,cbdepartment;
    JButton update, cancel;
    Choice crollno;
    JLabel labelrollno;

    UpdateStudent() {
        setSize(900, 650);
        setLocation(300, 30);

        setLayout(null);

        JLabel heading = new JLabel("Update Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lblrollnumber = new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 100, 200, 20);
        lblrollnumber.setFont(new Font("serif", Font.PLAIN, 18));
        add(lblrollnumber);

        crollno = new Choice();
        crollno.setBounds(250, 100, 200, 20);
        add(crollno);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelname);

        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        JLabel labelfname = new JLabel();
        labelfname.setBounds(600, 150, 150, 30);
        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelfname);

        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(lblrollno);

        labelrollno = new JLabel();
        labelrollno.setBounds(200, 200, 150, 30);
        labelrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelrollno);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);

        JLabel labeldob = new JLabel();
        labeldob.setBounds(600, 200, 150, 30);
        labeldob.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labeldob);

        JLabel lbladress = new JLabel("Adress");
        lbladress.setBounds(50, 250, 200, 30);
        lbladress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladress);

        tfadress = new JTextField();
        tfadress.setBounds(200, 250, 150, 30);
        add(tfadress);

        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        //
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(400, 300, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcourse);

        tfcourse = new JTextField();
        tfcourse.setBounds(600, 300, 150, 30);
        add(tfcourse);

        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(50, 350, 200, 30);
        lbldepartment.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldepartment);

        tfdepartment = new JTextField();
        tfdepartment.setBounds(200, 350, 150, 30);
        add(tfdepartment);

        try {
            Connect c = new Connect();
            String query = "select * from student where rollno = '" + crollno.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfadress.setText(rs.getString("adress"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelrollno.setText(rs.getString("rollno"));
                tfcourse.setText(rs.getString("course"));
                tfdepartment.setText(rs.getString("department"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                try {
                    Connect c = new Connect();
                    String query = "select * from student where rollno = '" + crollno.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        labelname.setText(rs.getString("name"));
                        labelfname.setText(rs.getString("fname"));
                        labeldob.setText(rs.getString("dob"));
                        tfadress.setText(rs.getString("adress"));
                        tfphone.setText(rs.getString("phone"));
                        tfemail.setText(rs.getString("email"));
                        labelrollno.setText(rs.getString("rollno"));
                        tfcourse.setText(rs.getString("course"));
                        tfdepartment.setText(rs.getString("department"));
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        update = new JButton("Update");
        update.setBounds(250, 450, 120, 40);
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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == update)
        {
           
            String rollno = labelrollno.getText();
            String adress = tfadress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String course =tfcourse.getText();
            String department = tfdepartment.getText();
            
            try{
                String query = "update student set adress='"+adress+"',phone='"+phone+"',email='"+email+"',course='"+course+"',department='"+department+"' where rollno='"+rollno+"'";
                
                Connect con= new Connect();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Update Successfully");
                
                setVisible(false);
            } catch (Exception c){
                c.printStackTrace();
            }
            

        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateStudent();
    }

}