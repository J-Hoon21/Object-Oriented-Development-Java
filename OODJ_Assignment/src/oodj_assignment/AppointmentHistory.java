package oodj_assignment;
public class AppointmentHistory extends Appointment{

    public AppointmentHistory(String id, String name, String gender, String age, String passportic, String contact, 
            String email, String arriving, String departure, String room, String type, String appliance,
            String booking, String estimate, String time, String tech) {
        super(id,name,gender, age, passportic, contact, email, arriving, departure, 
                        room, type, appliance, booking, estimate, time, tech);
    }
    @Override
    public String toString(){
        return getID() + ":"+ getName() + ":"+ getGender() + ":" + getAge()
                + ":"+ getPassportIC()+ ":"+ getContact()+ ":"+ getEmail()+ ":"+ getArriving()
                + ":"+ getDeparture()+ ":"+ getRoomNumber() + ":"+ getType() + ":"+ getAppliance()
                + ":"+ getBooking()+ ":"+ getEstimate()+ ":"+ getTime()+ ":"+ getTech();
    }
}