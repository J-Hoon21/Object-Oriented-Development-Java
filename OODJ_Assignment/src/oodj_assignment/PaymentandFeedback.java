package oodj_assignment;
public class PaymentandFeedback {
private String id;
private String name;
private String gender;
private String passportic;
private String age;
private String contact;
private String email;
private String type;
private String appliance;
private String tech;
private String date;
private String fees1;
private String fees2;
private String method;
private String status;
private String rating;
private String comment;

public PaymentandFeedback(String id, String name, String gender, String age, String passportic, String contact, String email, 
        String type, String appliance, String tech, String date, String fees1, String fees2, String method, String status, 
        String rating, String comment) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.passportic = passportic;
        this.contact = contact;
        this.email = email;
        this.type = type;
        this.appliance = appliance;
        this.tech = tech;
        this.date = date;
        this.fees1 = fees1;
        this.fees2 = fees2;
        this.method= method;
        this.status = status;
        this.rating = rating;
        this.comment = comment;
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
    
    public String getTech() {
        return tech;
    }
    public void setTech (String tech) {
        this.tech = tech;
    }
    
    
    public String getDate() {
        return date;
    }
    public void setDate (String date) {
        this.date = date;
    }
    
    
    public String getFees1() {
        return fees1;
    }
    public void setFees1 (String fees1) {
        this.fees1 = fees1;
    }
    
    public String getFees2() {
        return fees2;
    }
    public void setFees2 (String fees2) {
        this.fees2 = fees2;
    }
 
    
    public String getMethod() {
        return method;
    }
    public void setMethod (String method) {
        this.method = method;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus (String status) {
        this.status = status;
    }
    
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    
        public String getComment() {
        return comment;
    }
    public void setComment (String comment) {
        this.comment = comment;
    }
    @Override
    public String toString(){
        return getID() + ":"+ getName() + ":"+ getGender() + ":"+ getAge()
                + ":"+ getPassportIC()+ ":"+ getContact()+ ":"+ getEmail()+ ":"+ getType() 
                + ":"+ getAppliance() + ":"+ getTech() + ":"+ getDate() + ":"+ getFees1()
                + ":"+ getFees2() + ":"+ getMethod() + ":"+ getStatus() + ":"+ getRating()
                + ":"+ getComment();
    }
}