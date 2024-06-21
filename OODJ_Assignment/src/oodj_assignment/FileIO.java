package oodj_assignment;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class FileIO {
    public static ArrayList<Manager> allManager = 
            new ArrayList<Manager>();
    public static ArrayList<Technician> allTechnician = 
            new ArrayList<Technician>();
    public static void read(){
        try{
            Scanner a = new Scanner(new File("manager.txt"));
            while(a.hasNext()){
                String name = a.nextLine();
                String password = a.nextLine();
                a.nextLine();
                Manager Man = new Manager(name,password);
                allManager.add(Man);
            }
            Scanner b = new Scanner(new File("technician.txt"));
            while(b.hasNext()){
            String line = b.nextLine();
            String[] details = line.split(":");
            String name = details[0];
            String gender = details[1];
            String age = details[2];
            String passportic = details[3];
            String contact = details[4];
            String email = details[5];
            String specialisation = details[6];
            String password = details[7];
            Technician Tech = new Technician(name, gender, age, passportic, contact, email, specialisation, password);
            allTechnician.add(Tech);
        }} catch(Exception e){
            System.out.println("Error in read method ...");
        }
    }
    public static void write(){
        try{
            PrintWriter a = new PrintWriter("manager.txt");
            for(Manager Man : allManager){
                a.println(Man.getName());
                a.println(Man.getPassword());
                a.println();
            }
            a.close();
            PrintWriter b = new PrintWriter("technician.txt");
            for(Technician Tech : allTechnician){
            b.println(Tech.getName() + ":"+ Tech.getGender() + ":"+ Tech.getAge()
                + ":"+ Tech.getPassportIC()+ ":"+ Tech.getContact()+ ":"+ Tech.getEmail()
                + ":"+ Tech.getSpecialisation() + ":"+ Tech.getPassword());
        }
            b.close();
        } catch(Exception e){
            System.out.println("Error in write method ...");
        }
    }
    public static Manager checking(String name){
        Manager found = null;
        for(Manager Man : allManager){
            if(name.equals(Man.getName())){
                found = Man;
                break;
            }
        }
        return found;
    }
    public static Technician checking2(String name){
        Technician found = null;
        for(Technician Tech : allTechnician){
            if(name.equals(Tech.getName())){
                found = Tech;
                break;
            }
        }
        return found;
    }
    
        public static Technician checking3(String password){
        Technician found = null;
        for(Technician Tech : allTechnician){
            if(password.equals(Tech.getPassword())){
                found = Tech;
                break;
            }
        }
        return found;
    }
        public static Technician checking4(String name, String specialisation){
        Technician found = null;
        for(Technician tech : allTechnician){
            if(name.equals(tech.getName()) && specialisation.equals(tech.getSpecialisation())){
                found = tech;
                break;
            }
        }
        return found;
    }
}