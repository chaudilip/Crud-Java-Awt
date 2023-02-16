import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

class login extends JFrame implements ActionListener {
    JFrame f, fshow;
    
   public JLabel title , eno , rno , fname , mname , lname , gender , dob , mno , city , state , country , email , hobbies , password;
    public JTextField teno , trno , tfname ,tmname , tlname , tdob , tmno ,  temail , thobbies ;
    public JRadioButton tmale , tfemale;
    public JComboBox tcity , tstate, tcountry ;
    public JPasswordField tpassword;
    public JButton search , submit, showdata , update, delete , clear; 

    login(){
        f = new JFrame("SIGN UP");
        title = new JLabel("Sign up");  
        
        title = new JLabel("TItle");
        eno = new JLabel("Enrollment NO");
        rno = new JLabel("Roll No");
        fname = new JLabel("First Name");
        mname = new JLabel("Middle Name");
        lname = new JLabel("Last  Name");
        gender = new JLabel("Gender");
        dob = new JLabel("Date of Birth");
        mno  = new JLabel("Mobile No");
        city = new JLabel("city");
        state = new JLabel("State");
        country = new JLabel("Coutry");
        email = new JLabel("Email");
        hobbies = new JLabel("hobbies");
        password = new JLabel("password");

        title.setFont(new Font("arial", Font.BOLD,24));
        eno.setFont(new Font("arial", Font.PLAIN, 14));
        rno.setFont(new Font("arial", Font.PLAIN, 14));
        fname.setFont(new Font("arial", Font.PLAIN, 14));
        mname.setFont(new Font("arial", Font.PLAIN, 14));
        lname.setFont(new Font("arial", Font.PLAIN, 14));
        gender.setFont(new Font("arial", Font.PLAIN, 14));
        dob.setFont(new Font("arial", Font.PLAIN, 14));
        email.setFont(new Font("arial", Font.PLAIN, 14));
        mno.setFont(new Font("arial", Font.PLAIN, 14));
        city.setFont(new Font("arial", Font.PLAIN, 14));
        state.setFont(new Font("arial", Font.PLAIN, 14));
        country.setFont(new Font("arial", Font.PLAIN, 14));
        hobbies.setFont(new Font("arial", Font.PLAIN, 14));
        password.setFont(new Font("arial", Font.PLAIN, 14));

        title.setBounds(350,20,100,50);
        eno.setBounds(150,80,100,50);
        rno.setBounds(150,120,100,50);
        fname.setBounds(150,160,100,50);
        mname.setBounds(150,200,100,50);
        lname.setBounds(150,240,100,50);
        gender.setBounds(150,280,100,50);
        dob.setBounds(150,320,100,50);
        mno.setBounds(150,360,100,50);
        city.setBounds(150,400,100,50);
        state.setBounds(150,440,100,50);
        country.setBounds(150,480,100,50);
        email.setBounds(150,520,100,50);
        hobbies.setBounds(150,560,100,50);
        password.setBounds(150,600,100,50);

        f.add(title);
        f.add(eno);
        f.add(rno);
        f.add(fname);
        f.add(mname);
        f.add(lname);
        f.add(gender);
        f.add(dob);
        f.add(mno);
        f.add(city);
        f.add(state);
        f.add(country);
        f.add(email);
        f.add(hobbies);
        f.add(password);


        teno = new JTextField();
        trno = new JTextField();
        tfname = new JTextField();
        tmname = new JTextField();
        tlname = new JTextField();
        tmale = new JRadioButton("Male");
        tfemale = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(tmale);
        group.add(tfemale);
        tdob = new JTextField();
        tmno = new JTextField();
        temail = new JTextField();
        thobbies = new JTextField();

        String cities[] = {"Rajot", "Ahemdabad","Surat","Junagadh","Porbandar","Amreli"};
        String states[] = {"Gujarat","Rajesthan","Punjab","Delhi","Kerla","Karnataka"};
        String countries[] = {"India","Brazil","UK","USA","Russia"};
        tcity = new JComboBox(cities);
        tstate = new JComboBox(states);
        tcountry = new JComboBox(countries);

        tpassword = new JPasswordField();


        teno.setBounds(400,90,200,25);
        trno.setBounds(400,130,200,25);
        tfname.setBounds(400,170,200,25);
        tmname.setBounds(400,210,200,25);
        tlname.setBounds(400,250,200,25);
        tmale.setBounds(400,290,80,25);
        tfemale.setBounds(500,290,80,25);
        tdob.setBounds(400,330,200,25);
        tmno.setBounds(400,370,200,25);
        tcity.setBounds(400,410,200,25);
        tstate.setBounds(400,450,200,25);
        tcountry.setBounds(400,490,200,25);
        temail.setBounds(400,530,200,25);
        thobbies.setBounds(400,570,200,25);
        tpassword.setBounds(400,610,200,25);
        f.add(teno);
        f.add(trno);
        f.add(tfname);
        f.add(tmname);
        f.add(tlname);
        f.add(tdob);
        f.add(tmno);
        f.add(temail);
        f.add(thobbies);
        f.add(tmale);
        f.add(tfemale);
        f.add(tcity);
        f.add(tstate);
        f.add(tcountry);
        f.add(tpassword);

    submit = new JButton("Submit");
    clear = new JButton("Clear");
    showdata = new JButton("Show data");
    update  = new JButton("Update");
    delete = new JButton("delete");
    search = new JButton("Search");

    search.setBounds(640,85,100,30);
    search.addActionListener(this);

    submit.setBounds(80,680,100,30);
    submit.addActionListener(this);

    clear.setBounds(210,680,100,30);
    clear.addActionListener(this);

    showdata.setBounds(340,680,100,30);
    showdata.addActionListener(this);

    update.setBounds(470,680,100,30);
    update.addActionListener(this);

    delete.setBounds(600,680,100,30);
    delete.addActionListener(this);

        f.add(submit);
        f.add(search);
        f.add(showdata);
        f.add(delete);
        f.add(update);
        f.add(clear);
        f.setSize(800,800);
        f.setLocation(550,150);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            String gender_s = "";
            if(tmale.isSelected()){gender_s = "Male";}
            else if(tfemale.isSelected()){gender_s = "Female";}
            else{gender_s= "";}
            if (teno.getText().equals("") || trno.getText().equals("") || tfname.getText().equals("") || tmname.getText().equals("") || tlname.getText().equals("") || gender_s == "" || tdob.getText().equals("") || temail.getText().equals("") || tmno.getText().equals("") ){
                        JOptionPane.showMessageDialog(f, "Please, Enter The value into all fields");   
            }
            else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_jdbc","root","root");
                    String insertquery = "Insert into `student` values (?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
                    PreparedStatement p = conn.prepareStatement(insertquery);
                    p.setString(1,teno.getText());
                    p.setString(2,trno.getText());
                    p.setString(3,tfname.getText());
                    p.setString(4,tmname.getText());
                    p.setString(5,tlname.getText());
                    p.setString(6,gender_s.toString());
                    p.setString(7,tdob.getText());
                    p.setString(8,tmno.getText());
                    p.setString(9,tcity.getSelectedItem().toString());
                    p.setString(10,tstate.getSelectedItem().toString());
                    p.setString(11,tcountry.getSelectedItem().toString());
                    p.setString(12,temail.getText());
                    p.setString(13,thobbies.getText());
                    p.setString(14,tpassword.getText());

                    int result = p.executeUpdate();
                    if(result > 0){
                        JOptionPane.showMessageDialog(f, "Inserted Successfully");
                    }
                    else{
                        JOptionPane.showMessageDialog(f, "Insert Failed");
                    }
                    conn.close();
                }
                catch(Exception e1){
                    System.out.println(e1);
                }
            }
        }

        else if(e.getSource() == clear){
            teno.setText("");
            trno.setText("");
            thobbies.setText("");
            tfname.setText("");
            tmname.setText("");
            tlname.setText("");
            tmale.setSelected(false);
            tfemale.setSelected(false);
            tdob.setText("");
            temail.setText("");
            tmno.setText("");
            tpassword.setText("");

        }

        else if(e.getSource() == showdata){
            fshow = new JFrame("Show Records");
            String[][] date = {};
            String[] columnNames = {"eno" , "eno" , "fname" , "mname", "lname", "gender" , "dob", "mno", "city","state" ,"country" ,"email","hobbies"};
            JTable j = new JTable(date,columnNames);
            j.setBounds(0,0,800,500);
            JScrollPane sp = new JScrollPane(j);
            fshow.add(sp);
            fshow.add(j);

            fshow.setSize(800,500);
            fshow.setLocation(550,300);
            fshow.setResizable(false);
            fshow.setLayout(null);
            fshow.setVisible(true);
        }

        else if(e.getSource() == search){
            if(teno.getText().equals("")){
                JOptionPane.showMessageDialog(f,"Please enter a Enrollment Number");
            }
            else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_jdbc","root","root");
                    String fetchquery = "select * from student where eno = '" + teno.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(fetchquery);
                    if(rs.next()){
                        trno.setText(rs.getString("rno"));
                        tfname.setText(rs.getString("fname"));
                        tmname.setText(rs.getString("mname"));
                        tlname.setText(rs.getString("lname"));
                        String check_gender = rs.getString("gender");
                        if(check_gender.equals("Male")){
                            tmale.setSelected(true);
                        }
                        else if(check_gender.equals("Female")){
                            tfemale.setSelected(true);
                        }
                        tdob.setText(rs.getString("dob"));
                        temail.setText(rs.getString("email"));
                        tmno.setText(rs.getString("Mobile"));
                        tpassword.setText(rs.getString("password"));
                    }
                    else{
                        JOptionPane.showMessageDialog(f,"Sorry , This record is not found");
                    }
                    conn.close();
                }
                catch(Exception e2) {
                    System.out.println(e2);
                }
            }
        }
        else if(e.getSource() == update){
            String gender = "";
            if(tmale.isSelected()){gender = "Male";}
            else if(tfemale.isSelected()){gender = "Female";}
            if(teno.getText().equals("") || trno.getText().equals("") || tfname.getText().equals("") || tmname.getText().equals("") || tlname.getText().equals("") || gender == "" || tdob.getText().equals("") || temail.getText().equals("") || tmno.getText().equals("")){
                  JOptionPane.showMessageDialog(f, "Please, Enter The Values into all the fields");
            }
            else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_jdbc","root","root");
                    String updatequery = "UPDATE `student` set `rno`='"+trno.getText()+"' , `fname`='"+tfname.getText()+"' , `mname`='"+tmname.getText()+"'   , `lname`='"+tlname.getText()+"' , `gender`='"+gender+"'  , `dob`='"+tdob.getText()+"' , `mno`='"+tmno.getText()+"' ,  `city`='"+tcity.getSelectedItem().toString()+"',`state`='"+tstate.getSelectedItem().toString()+"',`country`='"+tcountry.getSelectedItem().toString()+"', `email`='"+temail.getText()+"'  , `hobbies`='"+thobbies.getText()+"', `password`='"+tpassword.getText()+"' where eno='"+teno.getText()+"'   " ;
                    PreparedStatement p = conn.prepareStatement(updatequery);
                    int result = p.executeUpdate();
                    if(result > 0 ){
                        JOptionPane.showMessageDialog(f,"Update Successfully");
                    }
                    else{
                        JOptionPane.showMessageDialog(f,"Update Failure");
                    }
                }
                catch(Exception e4){
                    System.out.println(e4);
                }
            }
        }
        else if(e.getSource() == delete){
            if(teno.getText().equals("")){
                JOptionPane.showMessageDialog(f,"Please enter a Enrollment Number");
            }
            else{
                int confirmResult = JOptionPane.showConfirmDialog(f,"Are You Sure This Record is Delete?", "Delete Record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmResult == JOptionPane.YES_OPTION){
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","");
                        String insertquery = "DELETE FROM `student` where eno='"+teno.getText()+"'  ";
                        PreparedStatement p = conn.prepareStatement(insertquery);
                        int result   = p.executeUpdate();
                        if(result > 0){
                            JOptionPane.showMessageDialog(f, "Record Deleted Successfully");
                        }
                        else{
                            JOptionPane.showMessageDialog(f, "Record NOT Found");
                        }
                        conn.close();
                    }
                    catch(Exception e3){
                        System.out.println(e3);
                    }
                } 
            }
        }
    }


    public static void main(String[] args){
        new login();
    }
}