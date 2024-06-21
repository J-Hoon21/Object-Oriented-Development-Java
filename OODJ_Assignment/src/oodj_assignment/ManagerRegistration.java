package oodj_assignment;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ManagerRegistration implements ActionListener,WindowListener{
     public void actionPerformed(ActionEvent e){
      if (e.getSource()==btnregister){
          {result = JOptionPane.showConfirmDialog(x, "Are You Sure You Want To Register? "
                  + "(Please Remember Your Password!)", "Submit Registration", JOptionPane.ERROR_MESSAGE);
          if (result == JOptionPane.YES_OPTION) {
      getCode();
      getName();
      getPassword();
      getConfirmPassword();
          if(code.equals("") || name.equals("") || password.equals("") || confirm.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please Fill In All Valid Data"); 
            }
          else if (!code.equals("ManagerRegister"))
            {
            JOptionPane.showMessageDialog(btnregister, "Incorrect Registration Code");
            }
          else if ((!new String(txtPassword.getPassword()).equals(new String(txtConfirm.getPassword()))))
            {
             JOptionPane.showMessageDialog(btnregister, "Oops!! Password Not Match, Please Try Again!!");
            }
          else 
          {
             Manager found = FileIO.checking(name);
             if(found == null){
                Manager Man = new Manager(name,password);
                FileIO.allManager.add(Man);
                FileIO.write();
                JOptionPane.showMessageDialog(btnregister, "Register Successful!");
                txtCode.setText("");
                txtName.setText("");
                txtPassword.setText("");
                txtConfirm.setText("");
            } else{
                JOptionPane.showMessageDialog(btnregister, "Sorry, username is exist!");
            }
          }
          }
          }
     }
      if (e.getSource()==btnquit){
          {result = JOptionPane.showConfirmDialog(x, "Are You Sure You Want To Cancel Registration?", 
                    "Back To Login Page", JOptionPane.ERROR_MESSAGE);
          if (result == JOptionPane.YES_OPTION) {
               txtCode.setText("");
               txtName.setText("");
               txtPassword.setText("");
               txtConfirm.setText("");
               OODJ_Assignment.second1.getX().setVisible(false);
               OODJ_Assignment.second.getX().setVisible(true);
          }
     }
     }
     }
    private JFrame x;
    private JLabel lblCode,lblName,lblPassword,lblConfirm;
    private JTextField txtName;
    private JPasswordField txtCode, txtPassword, txtConfirm;
    private JButton btnregister, btnquit;
    private String code, name, password, confirm;
    private int result;
    
    public ManagerRegistration(){
        x = new JFrame();
        x.setSize(450,300);
        x.setLocation(100,100);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new GridLayout(5,2,0,0));
        x.setTitle("Manager Registration Section");
        lblCode = new JLabel("Registration Code", SwingConstants.CENTER);
        lblName = new JLabel("Name", SwingConstants.CENTER);
        lblPassword = new JLabel("Password", SwingConstants.CENTER);
        lblConfirm = new JLabel("Confirm Password", SwingConstants.CENTER);
        txtCode = new JPasswordField();
        txtName = new JTextField();
        txtPassword = new JPasswordField();
        txtConfirm = new JPasswordField();
        btnregister = new JButton("Submit Registration");
        btnquit = new JButton("Cancel Registration");
        btnregister.addActionListener(this);
        btnquit.addActionListener(this);
        //this is the current object -> first
        x.add(lblCode);
        x.add(txtCode);
        x.add(lblName);
        x.add(txtName);
        x.add(lblPassword);
        x.add(txtPassword);
        x.add(lblConfirm);
        x.add(txtConfirm);
        x.add(btnquit);
        x.add(btnregister);
        x.addWindowListener(this);
    }
    public JFrame getX() {
        return x;
    } 
    public String getCode(){
         code = String.valueOf(txtCode.getPassword());
         return code;
        } 
        public String getName(){
         name = txtName.getText();
         return name;  
        }
        public String getPassword(){
        password = String.valueOf(txtPassword.getPassword());
        return  password;
        }
        public String getConfirmPassword(){
         confirm = String.valueOf(txtConfirm.getPassword());
         return  password;
        }
    public void windowClosing(WindowEvent e){
       int result = JOptionPane.showConfirmDialog(x, "Are you sure", "Exit program", JOptionPane.ERROR_MESSAGE);
       if (result == JOptionPane.YES_OPTION)
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           System.exit(0);
       else
           x.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
       public void windowOpened(WindowEvent e){}
       public void windowIconified(WindowEvent e){
       JOptionPane.showMessageDialog(x, "Minimised");
    }
       public void windowDeiconified(WindowEvent e){}
       public void windowClosed(WindowEvent e){}
       public void windowActivated(WindowEvent e){}
       public void windowDeactivated(WindowEvent e){}   
}
