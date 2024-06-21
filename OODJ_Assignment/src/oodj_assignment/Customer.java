package oodj_assignment;
public class Customer {
    protected String id;
    protected String name;
    protected String gender;
    protected String passportic;
    protected String age;
    protected String contact;
    protected String email;
    protected String arriving;
    protected String departure;
    protected String room;

    public Customer(String id, String name, String gender, String age, String passportic, String contact, String email, String arriving, String departure, String room) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.passportic = passportic;
        this.contact = contact;
        this.email = email;
        this.arriving = arriving;
        this.departure = departure;
        this.room = room;
    }
    
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    
    
    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
         this.gender = gender;
    }
    
    
     public String getAge() {
        return age;
    }
    public void setAge(String dob) {
         this.age = dob;
    }
    
    
    
    
    public String getPassportIC() {
       return passportic;
    }
    public void setPassportIC(String passportic) {
         this.passportic = passportic;
    }
    
    
    
    
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
         this.contact = contact;
    }
    
    
    
    
        public String getEmail() {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    
    
    public String getArriving() {
        return arriving;
    }
    public void setArriving(String arriving) {
         this.arriving = arriving;
    }
    
    
    
    
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
         this.departure = departure;
    }
    
    
    
     public String getRoomNumber() {
        return room;
    }
    public void setRoomNumber(String room) {
         this.room = room;
    }
@Override
public String toString(){
    return getID() + ":"+ getName() + ":"+ getGender() + ":"+ getAge()
                + ":"+ getPassportIC()+ ":"+ getContact()+ ":"+ getEmail()
                + ":"+ getArriving()+ ":"+ getDeparture()+ ":"+ getRoomNumber();
}
}