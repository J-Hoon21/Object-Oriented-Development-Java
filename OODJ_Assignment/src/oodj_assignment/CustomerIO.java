package oodj_assignment;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class CustomerIO {
    public static ArrayList<Customer> allCustomer = 
            new ArrayList<Customer>();
    public static ArrayList<Appointment> allAppointment = 
            new ArrayList<Appointment>();
    public static ArrayList<AppointmentHistory> allHistory = 
            new ArrayList<AppointmentHistory>();
    public static ArrayList<PaymentandFeedback> allPayment = 
            new ArrayList<PaymentandFeedback>();
    public static ArrayList<Departure> allDeparture = 
            new ArrayList<Departure>();
    public static void read(){
        try{
            Scanner a = new Scanner(new File("customer.txt"));
            while(a.hasNext()){
                String line = a.nextLine();
                String[] details = line.split(":");
                String id = details[0];
                String name = details[1];
                String gender = details[2];
                String age = details[3];
                String passportic = details[4];
                String contact = details[5];
                String email = details[6];
                String arriving = details[7];
                String departure = details[8];
                String room = details[9];
                
                Customer Cus = new Customer(id,name,gender, age, passportic, contact, email, arriving, departure, room);
                allCustomer.add(Cus);
            }
            Scanner b = new Scanner(new File("appointment.txt"));
            while(b.hasNext()){
                String line = b.nextLine();
                String[] details = line.split(":");
                String id = details[0];
                String name = details[1];
                String gender = details[2];
                String age = details[3];
                String passportic = details[4];
                String contact = details[5];
                String email = details[6];
                String arriving = details[7];
                String departure = details[8];
                String room = details[9];
                String type = details[10];
                String appliance = details[11];
                String booking = details[12];
                String estimate = details[13];
                String time = details[14];
                String tech = details[15];
                
                Appointment app = new Appointment(id,name,gender, age, passportic, contact, email, arriving, departure, 
                        room, type, appliance, booking, estimate, time, tech);
                allAppointment.add(app);
            }Scanner c = new Scanner(new File("appointmenthistory.txt"));
            while(c.hasNext()){
                String line = c.nextLine();
                String[] details = line.split(":");
                String id = details[0];
                String name = details[1];
                String gender = details[2];
                String age = details[3];
                String passportic = details[4];
                String contact = details[5];
                String email = details[6];
                String arriving = details[7];
                String departure = details[8];
                String room = details[9];
                String type = details[10];
                String appliance = details[11];
                String booking = details[12];
                String estimate = details[13];
                String time = details[14];
                String tech = details[15];
                
                AppointmentHistory ah = new AppointmentHistory(id,name,gender, age, passportic, contact, email, arriving, departure, 
                        room, type, appliance, booking, estimate, time, tech);
                allHistory.add(ah);
            }Scanner d = new Scanner(new File("paymentfeedback.txt"));
            while(d.hasNext()){
                String line = d.nextLine();
                String[] details = line.split(":");
                String id = details[0];
                String name = details[1];
                String gender = details[2];
                String age = details[3];
                String passportic = details[4];
                String contact = details[5];
                String email = details[6];
                String type = details[7];
                String appliance = details[8];
                String tech = details[9];
                String date = details[10];
                String fees1 = details[11];
                String fees2 = details[12];
                String method = details[13];
                String status = details[14];
                String rating = details[15];
                String comment = details[16];

                PaymentandFeedback pay = new PaymentandFeedback(id,name,gender, age, passportic, contact, email, type, appliance, tech,
                date, fees1, fees2, method, status, rating, comment);
                allPayment.add(pay);
            }Scanner e = new Scanner(new File("departure.txt"));
            while(e.hasNext()){
                String line = e.nextLine();
                String[] details = line.split(":");
                String id = details[0];
                String name = details[1];
                String gender = details[2];
                String age = details[3];
                String passportic = details[4];
                String contact = details[5];
                String email = details[6];
                String arriving = details[7];
                String departure = details[8];
                String room = details[9];
                Departure Dep = new Departure(id,name,gender, age, passportic, contact, email, arriving, departure, room);
                allDeparture.add(Dep);
                }} catch(Exception e){
            System.out.println("Error in read method ...");
        }
    }
    public static void write(){
        try{
            PrintWriter a = new PrintWriter("customer.txt");
            for(Customer Cus : allCustomer){
                a.println(Cus.toString());
            }
            a.close();
            PrintWriter b = new PrintWriter("appointment.txt");
            for(Appointment app : allAppointment){
                b.println(app.toString());
        }
           b.close();
           } catch(Exception e){
            System.out.println("Error in write method ...");
        }
    }
     public static void historywrite(){
    try{
    PrintWriter c = new PrintWriter("appointmenthistory.txt");
            for(AppointmentHistory ah : allHistory){
                c.println(ah.toString());
        }
           c.close();
           PrintWriter d = new PrintWriter("paymentfeedback.txt");
           for(PaymentandFeedback pay : allPayment){
                d.println(pay.toString());
        }
           d.close();
           PrintWriter e = new PrintWriter("departure.txt");
            for(Customer Cus : allDeparture){
                e.println(Cus.toString());
            }
            e.close();
           } catch(Exception e){
            System.out.println("Error in write method ...");
        }}
    
    public static Customer checking(String id){
        Customer found = null;
        for(Customer Cus : allCustomer){
            if(id.equals(Cus.getID())){
                found = Cus;
                break;
            }
        }
        return found;
    }
    
    public static Appointment checking2(String id){
        Appointment found = null;
        for(Appointment app : allAppointment){
            if(id.equals(app.getID())){
                found = app;
                break;
            }
        }
        return found;
    }
    
        public static Appointment checking3(String tech, String time, String estimate){
        Appointment found = null;
        for(Appointment app : allAppointment){
            if(tech.equals(app.getTech()) && time.equals(app.getTime())&& estimate.equals(app.getEstimate())){
                found = app;
                break;
            }
        }
        return found;
    }
        
       public static Appointment checking4(String tech){
        Appointment found = null;
        for(Appointment app : allAppointment){
            if(tech.equals(app.getTech())){
                found = app;
                break;
            }
        }
        return found;
    }
       
        public static PaymentandFeedback checking5(String id){
        PaymentandFeedback found = null;
        for(PaymentandFeedback pay : allPayment){
            if(id.equals(pay.getID())){
                found = pay;
                break;
            }
        }
        return found;
    }
        public static PaymentandFeedback checking6(String id, String date){
        PaymentandFeedback found = null;
        PaymentandFeedback found2 = null;
        for(PaymentandFeedback pay : allPayment){
            if(id.equals(pay.getID()) && date.equals(pay.getDate())){
                found = pay;
                found2 = pay;
                break;
            }
        }
        return found;
    }
    public static Appointment checking7(String id, String tech, String time, String estimate){
        Appointment found = null;
        for(Appointment app : allAppointment){
            if(id.equals(app.getID()) && tech.equals(app.getTech()) 
                    && time.equals(app.getTime())&& estimate.equals(app.getEstimate())){
                found = app;
                break;
            }
        }
        return found;
    }
}