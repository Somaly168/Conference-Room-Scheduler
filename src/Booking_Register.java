import java.time.LocalTime;
public class Booking_Register {
    RoomInfo B1 = new RoomInfo("001","Soknao","VIP",50,100,"Availalbe",true);
    LocalTime currentTime = LocalTime.now();
    private int hour = currentTime.getHour();
    private  int minute = currentTime.getMinute();
    private String customerName;

    public Booking_Register() {
        this.customerName = "Kong Soknao";
    }

    public String customerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void booking(){
        if(B1.getIsAvailable()){
            B1.setIsavailable(true);
            B1.setStatus("Available");
            System.out.println("Booking successful!");
        }else System.out.println("This room was booked already!");
    }
    public void cancel(){
            B1.setIsavailable(false);
            B1.setStatus("unAvailable");
            System.out.println("Cancel successful!");
    }

}
