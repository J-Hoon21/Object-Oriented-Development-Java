package oodj_assignment;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login implements ActionListener, WindowListener{
     public void actionPerformed(ActionEvent e){
         if(e.getSource() == y1){
            String input = JOptionPane.showInputDialog("Enter login username:");
            Manager found = FileIO.checking(input);
            if(found != null){
                JPasswordField pwd = new JPasswordField(10);
                int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password",JOptionPane.OK_CANCEL_OPTION);
                     if (action == JOptionPane.OK_OPTION){
                     String Password = String.valueOf(pwd.getPassword());
                        if(found.getPassword().equals(Password)){
                        JOptionPane.showMessageDialog(y1, "Login Successful");
                        OODJ_Assignment.ManagerLogin = found;
                        OODJ_Assignment.first.getX().setVisible(false);
                        OODJ_Assignment.second.getX().setVisible(true);
                        } 
                        else{
                        JOptionPane.showMessageDialog(y1, "Incorrect Password");
            }}}
            else{
            JOptionPane.showMessageDialog(y1,"Username Not Found");
            }} 
         
            else if(e.getSource() == y2){
            String input = JOptionPane.showInputDialog("Enter login username:");
            Technician found = FileIO.checking2(input);
            if(found != null){
                JPasswordField pwd = new JPasswordField(10);
                int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password",JOptionPane.OK_CANCEL_OPTION);
                     if (action == JOptionPane.OK_OPTION){
                     String Password = String.valueOf(pwd.getPassword());
                        if(found.getPassword().equals(Password)){
                        JOptionPane.showMessageDialog(y2, "Login Successful");
                        OODJ_Assignment.TechnicianLogin = found;
                        OODJ_Assignment.first.getX().setVisible(false);
                        new TechAppointmentView().setVisible(true);
                        } 
                        else{
                        JOptionPane.showMessageDialog(y2, "Incorrect Password");
            }}}
            else{
            JOptionPane.showMessageDialog(y2,"Username Not Found");
            }
    }}
    private JFrame x;
    private JButton y1, y2;
    private String password;
    public Login(){
        x = new JFrame();
        x.setSize(500,100);
        x.setLocation(700,300);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new GridLayout(1,2,0,0));
        x.setTitle("APU Hostel Home Appliances Service Centre Login Page");
        y1 = new JButton("Centre Managers Login");
        y2 = new JButton("Centre Technicians Login");
        //this is the current object -> first
        y1.addActionListener(this);
        y2.addActionListener(this);
        x.add(y1);
        x.add(y2);
        x.setVisible(true);
        x.addWindowListener(this);
    }
    public JFrame getX() {
        return x;
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
