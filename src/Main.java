import java.util.*;
public class Main {
    public static void main(String[] args) {


        ParkingLot P1 = new ParkingLot(5);
        Scanner ob=new Scanner(System.in);
        outer: while(true)
        {
            System.out.println("press 1 if you want to park vehicle \n press 2 to see vehicles under company \n press 3 to exit parking lot  \n press 4 to exit console");
           int ch=ob.nextInt();
           switch(ch) {
               case 1:{
                   System.out.println("Enter 1 for car \n Enter 2 for bike");
                   int c= Integer.parseInt(ob.next());
                   switch (c)
                   {
                       case 1: {
                           System.out.println("Enter License number");
                           String license = ob.next();
                           System.out.println("Enter company name");
                           String company = ob.next();
                           Car car = new Car(license, company);
                           P1.parkVehicle(car);
                       }
                       break;
                       case 2: {
                           System.out.println("Enter License number");
                           String license = ob.next();
                           System.out.println("Enter company name");
                           String company = ob.next();
                           Motorcycle bike = new Motorcycle(license, company);
                           P1.parkVehicle(bike);
                       }
                       default:System.out.println("Invalid entry");
                   }
               }
                   break;
               case 2:{
                   System.out.println("Enter the company");
                   String comp=ob.next();
                   P1.ComapnyParked(comp);}
                   break;
               case 3:{
                   System.out.println("Enter License number");
                   String license = ob.next();
                   System.out.println("Enter company name");
                   String company = ob.next();
                   System.out.println("Enter level");
                   int level=ob.nextInt();
                   P1.leave(license,company,level);
               }
               break;
               case 4:
                   break outer;
               default: System.out.println("Invalid input");
           }
           }
    }
}
