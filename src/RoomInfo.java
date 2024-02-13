import java.util.Scanner;
import java.util.Arrays;
public class RoomInfo implements Comparable<RoomInfo>{
    private String roomID;
    private String roomName;
    private String roomType;
    private int capacity;
    private float price;
    private String status;
    private boolean isAvailable;

    public RoomInfo(String roomID,String roomName, String roomType, int capacity, float price, String status,boolean isAvailable) {
        this.roomID = roomID;
        this.roomName=roomName;
        this.roomType=roomType;
        this.capacity=capacity;
        this.price=price;
        this.status=status;
        this.isAvailable=isAvailable;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsavailable(boolean available) {
        isAvailable = available;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String setRoomID() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Room ID: ");
        roomID= in.next();
        System.out.print("Enter Room Name: ");
        roomName= in.next();
//        System.out.print("Enter Room Type: ");
//        roomType= in.next();
//        System.out.print("Enter Capacity: ");
//        capacity= in.nextInt();
//        System.out.print("Enter Price: ");
//        price= in.nextFloat();

    }
    public void Template(){
        System.out.println ("\n-----------------------------");
        System.out.println ("Room Information");
        System.out.println ("-----------------------------");
        System.out.format("%10s%15s%15s%15s%20s%15s\n", "ID", "RoomName", "RoomType", "Capacity", "Price","Status");
    }
    public void output(){
        System.out.format("%10s%15s%15s%15s%20s%15s\n", this.roomID, this.roomName, this.roomType, this.capacity,this.price,this.status);
    }
    public  RoomInfo search(RoomInfo[] rooms, String searchID, int n) {
        for(int i=0; i<n; i++){
            try {
                if(rooms[i].getRoomID().equals(searchID)){
                    System.out.println("Room Found:");
                    rooms[i].output();
                }
            }catch (Exception e){
                System.out.println("Error please check"+e);
            }
        }
        return null;
    }
    public  RoomInfo update(RoomInfo[] rooms, String searchID, int n) {
        int index = -1;
        String newID;
        String newName;
        int newCapacity;
        float newPrice;
        String newStatus;
        String newType;
        for (int i = 0; i < n; i++) {
            try {
                if (rooms[i].getRoomID().equals(searchID)) {
                    index = i;
                }
            } catch (Exception e) {
                System.out.println("Error please check" + e);
            }
        }
        if (index != -1) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter new RoomID : ");
            newID = in.next();
            System.out.print("Enter new Room Name: ");
            newName = in.next();
            System.out.print("Enter new Room Type: ");
            newType = in.next();
            System.out.print("Enter new Capacity: ");
            newCapacity = in.nextInt();
            System.out.print("Enter new Price: ");
            newPrice = in.nextFloat();
            System.out.print("Enter new Status: ");
            newStatus = in.next();

            rooms[index].setRoomID(newID);
            rooms[index].setRoomName(newName);
            rooms[index].setRoomType(newType);
            rooms[index].setCapacity(newCapacity);
            rooms[index].setPrice(newPrice);
            rooms[index].setStatus(newStatus);
            System.out.println("Update Successful!");
        }
        return null;
    }
    @Override
    public int compareTo(RoomInfo otherRoom) {
        return this.roomID.compareTo(otherRoom.roomID);
    }
    public void sortRooms(RoomInfo[] rooms, int n) {
        Arrays.sort(rooms, 0, n); // Sort the array based on roomID
    }
}

