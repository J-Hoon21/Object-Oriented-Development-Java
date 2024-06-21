package oodj_assignment;
public class Technician {
    private String name;
    private String gender;
    private String passportic;
    private String age;
    private String contact;
    private String email;
    private String specialisation;
    private String password;

    public Technician(String name, String gender, String age, String passportic, String contact, 
            String email, String specialisation, String password) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.passportic = passportic;
        this.contact = contact;
        this.email = email;
        this.specialisation = specialisation;
        this.password = password;
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
    
    public String getSpecialisation() {
        return specialisation;
    }
    public void setSpecialisation (String specialisation) {
        this.specialisation = specialisation;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}