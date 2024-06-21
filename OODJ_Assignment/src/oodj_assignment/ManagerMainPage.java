package oodj_assignment;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ManagerMainPage implements ActionListener, WindowListener{
    public void actionPerformed(ActionEvent e){
          if(e.getSource() == y1){
           OODJ_Assignment.second.getX().setVisible(false);
           new CustomerRegistration().setVisible(true);
          }
          if(e.getSource() == y2){
           OODJ_Assignment.second.getX().setVisible(false);
           new CustomerView().setVisible(true);
          }
          if(e.getSource() == y3){
           OODJ_Assignment.second.getX().setVisible(false);
           new DepartureRecord().setVisible(true);
          }
          if(e.getSource() == y4){
           new AppointmentBooking().setVisible(true);
          }
          if(e.getSource() == y5){
           OODJ_Assignment.second.getX().setVisible(false);
           new AppointmentView().setVisible(true);
          }
          if(e.getSource() == y6){
           OODJ_Assignment.second.getX().setVisible(false);
           new AppointmentHistoryView().setVisible(true);
          }
           if(e.getSource() == y7){
           OODJ_Assignment.second.getX().setVisible(false);
           new PaymentFeedbackView().setVisible(true);
           }
          if(e.getSource() == y8){
           OODJ_Assignment.second.getX().setVisible(false);
           new TechnicianRegistration().setVisible(true);
          }
          if(e.getSource() == y9){
           OODJ_Assignment.second.getX().setVisible(false);
           new TechnicianView().setVisible(true);
          }
          if(e.getSource() == y10){
           OODJ_Assignment.second.getX().setVisible(false);
           OODJ_Assignment.second1.getX().setVisible(true);
          }
          if(e.getSource() == y11){
           OODJ_Assignment.second.getX().setVisible(false);
           OODJ_Assignment.first.getX().setVisible(true);
          }
     }
    private JFrame x;
    private JButton y1, y2, y3, y4,y5,y6,y7,y8,y9,y10,y11;
    public ManagerMainPage(){
        x = new JFrame();
        x.setSize(500,500);
        x.setLocation(700,300);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new GridLayout(11,0,0,0));
        x.setTitle("Manager Main Page");
        y1 = new JButton("Customer Registration");
        y2 = new JButton("Customer Records");
        y3 = new JButton("Departure Records");
        y4 = new JButton("Appointment Booking");
        y5 = new JButton("On Going Appointments");
        y6 = new JButton("Complete Appointments");
        y7 = new JButton("Payment and Feedback Records");
        y8 = new JButton("Technician Registration");
        y9 = new JButton("Technician Records");
        y10 = new JButton("Manager Registration");
        y11 = new JButton("Back To Login Page");
        //this is the current object -> first
        y1.addActionListener(this);
        y2.addActionListener(this);
        y3.addActionListener(this);
        y4.addActionListener(this);
        y5.addActionListener(this);
        y6.addActionListener(this);
        y7.addActionListener(this);
        y8.addActionListener(this);
        y9.addActionListener(this);
        y10.addActionListener(this);
        y11.addActionListener(this);
        x.add(y1);
        x.add(y2);
        x.add(y3);
        x.add(y4);
        x.add(y5);
        x.add(y6);
        x.add(y7);
        x.add(y8);
        x.add(y9);
        x.add(y10);
        x.add(y11);
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
