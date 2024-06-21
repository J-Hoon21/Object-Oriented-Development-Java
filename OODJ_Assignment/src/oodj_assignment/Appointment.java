package oodj_assignment;
public class Appointment extends Customer{
    protected String type;
    protected String appliance;
    protected String booking;
    protected String estimate;
    protected String time;
    protected String tech;

    public Appointment(String id, String name, String gender, String age, String passportic, String contact, 
            String email, String arriving, String departure, String room, String type, String appliance,
            String booking, String estimate, String time, String tech) {
    super(id,name,gender,age,passportic,contact,email,arriving,departure,room);  
        this.type = type;
        this.appliance = appliance;
        this.booking = booking;
        this.estimate = estimate;
        this.time = time;
        this.tech = tech;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
         this.type = type;
    }
   
    
    public String getAppliance() {
        return appliance;
    }
    public void setAppliance(String appliance) {
         this.appliance = appliance;
    }
    
    
    public String getBooking() {
        return booking;
    }
    public void setBooking(String booking) {
         this.booking = booking;
    }
    
    
    public String getEstimate() {
        return estimate;
    }
    public void setEstimate(String estimate) {
         this.estimate = estimate;
    }
    
    
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
         this.time = time;
    }
    
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
         this.tech = tech;
    }
    @Override
    public String toString(){
        return getID() + ":"+ getName() + ":"+ getGender() + ":"+ getAge()
                + ":"+ getPassportIC()+ ":"+ getContact()+ ":"+ getEmail()+ ":"+ getArriving()
                + ":"+ getDeparture()+ ":"+ getRoomNumber() + ":"+ getType() + ":"+ getAppliance()
                + ":"+ getBooking()+ ":"+ getEstimate()+ ":"+ getTime()+ ":"+ getTech();
    }
}
