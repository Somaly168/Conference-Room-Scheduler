import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //test branch
    public static void main(String[] args) {
//        RoomInfo[] B1= new RoomInfo[10];//{new RoomInfo("R001","AAA","VIP",5,25,"Free")};
//        for (int i=0; i<2; i++) {
//            B1[i]=new RoomInfo();
//            B1[i].input();
//        }
//        B1[0].Templete();
//        for (int i=0; i<2; i++) {
//            B1[i].sortRooms(B1,2);
//
//            B1[i].output();
//        }
//      search( B1,"001" , 1);
//       B1[0].update(B1,"001",2);
//        B1[0].Templete();
//        for (int i=0; i<2; i++) {
//            B1[i].sortRooms(B1,2);
//            B1[i].output();
//        }
//        for (int i=0; i<2; i++) {
//            B1[i].output();
//            B1[i].sortRooms(B1,2);
//       }//Booking_Register B2 = new Booking_Register();
        RoomInfo[] B1 = new RoomInfo[]{
                new RoomInfo("001", "Soknao", "VIP", 50, 100, "Available", true),
                // Add more RoomInfo objects as needed
        };
        int n = 0;
        int baseOp;
        int op1;
        boolean exit = true;
        while(exit) {
            System.out.println("1.RoomInfo");
            System.out.println("2.Booking Register");
            System.out.println("3.Display Record Room");
            System.out.println("4.Exit");
            System.out.print("Please input option:");
            Scanner in = new Scanner(System.in);
            baseOp = in.nextInt();
            outerSwitch:
            switch (baseOp){
                case 1:{
                    boolean exit1 = true;
                    while(exit1){
//                        System.out.print("\033c");
                        System.out.println("1.Room Entry");
                        System.out.println("2.Room Show");
                        System.out.println("3.Room Search");
                        System.out.println("4.Room Edit");
                        System.out.println("5.Exit");
                        System.out.print("Please input option:");
                        op1 = in.nextInt();
                        switch (op1){
                            case 1:
                                System.out.print("Enter number:");
                                n = in.nextInt();
                                for(int i=0; i<n; i++){
                                    B1[i]=new RoomInfo("001","Soknao","VIP",50,100,"Availalbe",true);
                                    B1[i].input();
                                }break;
                            case 2:
                                B1[0].Template();
                                System.out.println("N:"+n);
                                for (int i=0; i<n; i++) {
                                    B1[i].sortRooms(B1,n);
                                    B1[i].output();
                                }break;
                            case 3:
                                System.out.println("Please input RoomID to search:");
                                String searchID = in.next();
                                break;
                            default: break outerSwitch;
                        }
                    }
                }
                default: System.exit(0);
            }
        }

    }

}