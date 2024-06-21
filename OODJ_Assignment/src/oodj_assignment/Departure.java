package oodj_assignment;
public class Departure extends Customer{
    
    public Departure(String id, String name, String gender, String age, String passportic, String contact, 
            String email, String arriving, String departure, String room){
    super(id,name,gender,age,passportic,contact,email,arriving,departure,room);
    
}
 @Override
 public String toString(){
    return getID() + ":"+ getName() + ":"+ getGender() + ":"+ getAge()
                + ":"+ getPassportIC()+ ":"+ getContact()+ ":"+ getEmail()
                + ":"+ getArriving()+ ":"+ getDeparture()+ ":"+ getRoomNumber();
}}