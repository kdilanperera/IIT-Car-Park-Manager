import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IITCarParkManager implements CarParkManager {


    Scanner sc=new Scanner(System.in);
    @Override
    public void parkVehicle(List<Floor> floors, List<ArrayList<Vehicle>> Vehicle,ArrayList<Vehicle> common) {

//         while(vType != 9){
        System.out.println("Enter Vehicle Identification number : ");
        String ID = sc.nextLine();
        System.out.println("Enter Date and Time in Order");
        System.out.println("Enter day: ");
        int day=sc.nextInt();
        System.out.println("Enter month: ");
        int month=sc.nextInt();
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        System.out.println("Enter hour: ");
        int hour=sc.nextInt();
        System.out.println("Enter minute: ");
        int minute=sc.nextInt();

        System.out.println("Pick a vehicle type");
             System.out.println("\t 1. Car ");
             System.out.println("\t 2. Van ");
             System.out.println("\t 3. MiniBus ");
             System.out.println("\t 4. MiniLorry ");
             System.out.println("\t 5. Motorbike ");
            int vType = sc.nextInt();



//             Initialize objects w.r.t. class
             switch (vType) {
                 case 1: // Car
                     for(int x = 5; x > -1; x--){
                         if(floors.get(x).canParkCar()){
                            if(floors.get(x).spaceAvailale()>=3){
                                DateTime admission= new DateTime(day,month,year,hour,minute);
                                Vehicle theCarToBeParked = new Car(ID,admission);
//                                Add pvt attribute type to vehicle
                                Vehicle.get(x).add(theCarToBeParked);
                                common.add(theCarToBeParked);
                                floors.get(x).setSlotsUsed(3);
                                int value=floors.get(x).spaceAvailale();
                                System.out.println("Space available on the ground floor is "+floors.get(0).spaceAvailale()/3);
                                System.out.println("Space available on the first floor is "+floors.get(1).spaceAvailale()/3);
                                System.out.println("Space available on the second floor is "+floors.get(2).spaceAvailale()/3);
                                System.out.println("Space available on the third floor is "+floors.get(3).spaceAvailale()/3);
                                System.out.println("Space available on the fourth floor is "+floors.get(4).spaceAvailale()/3);
                                System.out.println("Space available on the fifth floor is "+floors.get(5).spaceAvailale()/3);
                                if(value==0){
                                    System.out.println("Floor "+ (x+1)+" is full.");
                                }
                                break;
                            }else{
                                System.out.println("No space in floor: "+(x+1));
                            }
                         }
                     }

                     break;
                 case 2://Van
                     for(int x = 5; x > -1; x--){
                         if(floors.get(x).canParkVan()){
                             if(floors.get(x).spaceAvailale()>=6){
                                 DateTime admission= new DateTime(day,month,year,hour,minute);
                                 Vehicle theVanToBeParked = new Van(ID,admission);
//                                Add pvt attribute type to vehicle
                                 Vehicle.get(x).add(theVanToBeParked);
                                 common.add(theVanToBeParked);
                                 floors.get(x).setSlotsUsed(6);
                                 int value=floors.get(x).spaceAvailale();
                                 System.out.println("Space available on the ground floor is "+floors.get(0).spaceAvailale()/3);
                                 System.out.println("Space available on the first floor is "+floors.get(1).spaceAvailale()/3);
                                 System.out.println("Space available on the second floor is "+floors.get(2).spaceAvailale()/3);
                                 System.out.println("Space available on the third floor is "+floors.get(3).spaceAvailale()/3);
                                 System.out.println("Space available on the fourth floor is "+floors.get(4).spaceAvailale()/3);
                                 System.out.println("Space available on the fifth floor is "+floors.get(5).spaceAvailale()/3);
                                 if(value==0){
                                     System.out.println("Floor "+ (x+1)+" is full.");
                                 }
                                 break;
                             }else{
                                 System.out.println("No space in floor: "+(x+1));
                             }
                         }
                     }

                     break;
                 case 3://MiniBus
                     for(int x = 5; x > -1; x--){
                         if(floors.get(x).canParkMinibus()){
                             if(floors.get(x).spaceAvailale()>=9){
                                 DateTime admission= new DateTime(day,month,year,hour,minute);
                                 Vehicle theMinibusToBeParked = new MiniBuses(ID,admission);
//                                Add pvt attribute type to vehicle
                                 Vehicle.get(x).add(theMinibusToBeParked);
                                 common.add(theMinibusToBeParked);
                                 floors.get(x).setSlotsUsed(9);
                                 int value=floors.get(x).spaceAvailale();
                                 System.out.println("Space available on the ground floor is "+floors.get(0).spaceAvailale()/3);
                                 System.out.println("Space available on the first floor is "+floors.get(1).spaceAvailale()/3);
                                 System.out.println("Space available on the second floor is "+floors.get(2).spaceAvailale()/3);
                                 System.out.println("Space available on the third floor is "+floors.get(3).spaceAvailale()/3);
                                 System.out.println("Space available on the fourth floor is "+floors.get(4).spaceAvailale()/3);
                                 System.out.println("Space available on the fifth floor is "+floors.get(5).spaceAvailale()/3);
                                 if(value==0){
                                     System.out.println("Floor "+ (x+1)+" is full.");
                                 }
                                 break;
                             }else{
                                 System.out.println("No space in floor: "+(x+1));
                             }
                         }
                     }

                     break;
                 case 4://MiniLorry
                     for(int x = 5; x > -1; x--){
                         if(floors.get(x).canParkMiniLorry()){
                             if(floors.get(x).spaceAvailale()>=9){
                                 DateTime admission= new DateTime(day,month,year,hour,minute);
                                 Vehicle theMinilorryToBeParked = new MiniLorries(ID,admission);
//                                Add pvt attribute type to vehicle
                                 Vehicle.get(x).add(theMinilorryToBeParked);
                                 common.add(theMinilorryToBeParked);
                                 floors.get(x).setSlotsUsed(9);
                                 int value=floors.get(x).spaceAvailale();
                                 System.out.println("Space available on the ground floor is "+floors.get(0).spaceAvailale()/3);
                                 System.out.println("Space available on the first floor is "+floors.get(1).spaceAvailale()/3);
                                 System.out.println("Space available on the second floor is "+floors.get(2).spaceAvailale()/3);
                                 System.out.println("Space available on the third floor is "+floors.get(3).spaceAvailale()/3);
                                 System.out.println("Space available on the fourth floor is "+floors.get(4).spaceAvailale()/3);
                                 System.out.println("Space available on the fifth floor is "+floors.get(5).spaceAvailale()/3);
                                 if(value==0){
                                     System.out.println("Floor "+ (x+1)+" is full.");
                                 }
                                 break;
                             }else{
                                 System.out.println("No space in floor: "+(x+1));
                             }
                         }
                     }

                     break;
                 case 5://Motorbike
                     for(int x = 5; x > -1; x--){
                         if(floors.get(x).canParkMotorbike()){
                             if(floors.get(x).spaceAvailale()>=1){
                                 DateTime admission= new DateTime(day,month,year,hour,minute);
                                 Vehicle theMotorbikeToBeParked = new Motorbike(ID,admission);
//                                Add pvt attribute type to vehicle
                                 Vehicle.get(x).add(theMotorbikeToBeParked);
                                 common.add(theMotorbikeToBeParked);
                                 floors.get(x).setSlotsUsed(1);
                                 int value=floors.get(x).spaceAvailale();
                                 System.out.println("Space available on the ground floor is "+floors.get(0).spaceAvailale()/3);
                                 System.out.println("Space available on the first floor is "+floors.get(1).spaceAvailale()/3);
                                 System.out.println("Space available on the second floor is "+floors.get(2).spaceAvailale()/3);
                                 System.out.println("Space available on the third floor is "+floors.get(3).spaceAvailale()/3);
                                 System.out.println("Space available on the fourth floor is "+floors.get(4).spaceAvailale()/3);
                                 System.out.println("Space available on the fifth floor is "+floors.get(5).spaceAvailale()/3);
                                 if(value==0){
                                     System.out.println("Floor "+ (x+1)+" is full.");
                                 }
                                 break;
                             }else{
                                 System.out.println("No space in floor: "+(x+1));
                             }
                         }
                     }
                     break;
                 default:
                     System.out.println("Invalid Choice!");

             }
        System.out.println("");
        String vehicle=sc.nextLine();
    }

    @Override
    public void deleteVehicle(List<Floor> floors, List<ArrayList<Vehicle>> Vehicle,ArrayList<Vehicle> common) {
        if(common.size()!=0) {
            System.out.println("Enter the Idenification number of the vehicle that is leaving.");
            String IDLeave = sc.nextLine();
            for (int x = 0; x < common.size(); x++) {
                if (common.get(x).getVehicleRegNo().equals(IDLeave)) {
                    System.out.println(common.get(x));
                    common.remove(common.get(x));
                } else {
                    System.out.println("No such Vehicle in the parking lot: " + x);
                }
            }
            for (int y = 0; y < 6; y++) {
                for (int z = 0; z < Vehicle.get(y).size(); z++)
                    if (Vehicle.get(y).get(z).getVehicleRegNo().equals(IDLeave)) {
                        Vehicle.remove(Vehicle.get(y).get(z));
                        floors.get(y).setSlotsUsed(-(Vehicle.get(y).get(z).getSpaceOccupied()));
                        int value = floors.get(y).spaceAvailale();
                        System.out.println("Space available in floor " + y + " is " + value / 3);
                    }
            }
        }else{
            System.out.println("No vehicles in the parkinglot.");
        }
    }

    @Override
    public void printVehicleParked(ArrayList<Vehicle> common) {
        if(common.size()!=0) {
            for (int x = common.size() - 1; x > -1; x--) {
                System.out.println(common.get(x));
            }
        }else{
            System.out.println("No vehicles in the parkinglot.");
        }

    }

    @Override
    public void printPercentage(ArrayList<Vehicle> common) {
        float car = 0;
        float miniBus = 0;
        float miniLorry = 0;
        float van = 0;
        float motorbike = 0;
        if(common.size()!=0){
        for (int x = 0; x < common.size(); x++) {
            if (common.get(x).getType().equals("Car")) {
                car++;
            } else if (common.get(x).getType().equals("MiniBus")) {
                miniBus++;
            } else if (common.get(x).getType().equals("MiniLorry")) {
                miniLorry++;
            } else if (common.get(x).getType().equals("Van")) {
                van++;
            } else if (common.get(x).getType().equals("MotorBike")) {
                motorbike++;
            }
        }
        int total = common.size();
        float CarPercentage = (car / total) * 100;
        float VanPercentage = (van / total) * 100;
        float MinilorryPercentage = (miniLorry / total) * 100;
        float MinibusPercentage = (miniBus / total) * 100;
        float MotorbikePercentage = (motorbike / total) * 100;
        System.out.println("Percentage of Cars in the parkinglot is: " + CarPercentage + "%");
        System.out.println("Percentage of Vans in the parkinglot is: " + VanPercentage + "%");
        System.out.println("Percentage of Minibuses in the parkinglot is: " + MinibusPercentage + "%");
        System.out.println("Percentage of Minilorries in the parkinglot is: " + MinilorryPercentage + "%");
        System.out.println("Percentage of Motorbikes in the parkinglot is: " + MotorbikePercentage + "%");
    }else{
            System.out.println("No vehicles in the parkinglot.");
        }
    }

    @Override
    public void printLongest(ArrayList<Vehicle> common) {
        System.out.println("The Vehicle tat is parked the longest is"+common.get(common.size()-1))

    }

    @Override
    public void printLastVehicle(ArrayList<Vehicle> common) {
        if(common.size()!=0){
        System.out.println("Last vehicle to park is: "+common.get(common.size()-1));
    }else{
            System.out.println("No vehicles in the parkinglot.");
        }
    }


    @Override
    public void printReceipt(ArrayList<Vehicle> common) {
        if(common.size()!=0) {
            System.out.println("Enter Date and Time in Order");
            System.out.println("Enter day: ");
            int day = sc.nextInt();
            System.out.println("Enter month: ");
            int month = sc.nextInt();
            System.out.println("Enter year: ");
            int year = sc.nextInt();
            System.out.println("Enter hour: ");
            int hour = sc.nextInt();
            System.out.println("Enter minute: ");
            int minute = sc.nextInt();
            DateTime checkDateTime = new DateTime(day, month, year, hour, minute);
            for (int x = 0; x < common.size(); x++) {
                double total = 0;
                double years = (checkDateTime.getYear() - common.get(x).getDate().getYear()) * 8928;
                double months = (checkDateTime.getMonth() - common.get(x).getDate().getMonth()) * 744;
                double days = (checkDateTime.getDay() - common.get(x).getDate().getDay()) * 24;
                double hours = checkDateTime.getHour() - common.get(x).getDate().getHour();
                if (years < 0) {
                    System.out.println("Invalid Input");
                } else{
                    total = years + months + days + hours;
                }

                    if (total <= 3) {
                        System.out.println(total);
                        double charge = (common.get(x).getSpaceOccupied() / 3) * total * 300;
                        System.out.println("Charge for: " + common.get(x).getVehicleRegNo() + " is " + charge + " LKR.");
                    } else if (total > 3 && total <= 24) {
                        double chargeFor3Hours = 3 * 300 * (common.get(x).getSpaceOccupied() / 3);
                        double remainingHours = total - 3;
                        double remainingCharge = remainingHours * 100 * (common.get(x).getSpaceOccupied() / 3);

                        double totalCharge = chargeFor3Hours + remainingCharge;

                        if (totalCharge > 3000) {
                            System.out.println("Charge for: " + common.get(x).getVehicleRegNo() + " is 3000 LKR.");
                        } else {
                            System.out.println("Charge for: " + common.get(x).getVehicleRegNo() + " is " + totalCharge + " LKR.");
                        }
                    } else if (total > 24) {
                        double finalTotal = 0;
                        double chargeFor3Hours = 3 * 300 * (common.get(x).getSpaceOccupied() / 3);
                        double remainingChargeForDayOne = 21 * 100 * (common.get(x).getSpaceOccupied() / 3);
                        double totalChargeForDayOne = remainingChargeForDayOne + chargeFor3Hours;
                        if (totalChargeForDayOne > 3000) {
                            finalTotal += 3000;
                        } else {
                            finalTotal += totalChargeForDayOne;
                        }

                        double numberOf24Hours = Math.floor((total - 24) / 24);
                        double chargeFortheMultiple24Hours = numberOf24Hours * 3000;

                        finalTotal += chargeFortheMultiple24Hours;
                        double remainingHours = (total - 24) % 24;

                        double chargeForRemainingHours = remainingHours * 100 * (common.get(x).getSpaceOccupied() / 3);
                        if (chargeForRemainingHours > 3000) {
                            finalTotal += 3000;
                        } else {
                            finalTotal += chargeForRemainingHours;
                        }
                        System.out.println("Charge for: " + common.get(x).getVehicleRegNo() + " is " + finalTotal + " LKR.");

                    }


            }
        }else{
            System.out.println("No vehicles in the parkinglot.");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//      Initialize the empty floors
//        initialize the Array of Floors (all floors empty)
        Floor floor0 = new Floor(true, true, true, true, true);
        Floor floor1 = new Floor(true, true, true, false, false);
        Floor floor2 = new Floor(true, true, true, false, false);
        Floor floor3 = new Floor(true, false, false, false, false);
        Floor floor4 = new Floor(true, false, false, false, false);
        Floor floor5 = new Floor(true, false, false, false, false);

//        Initialize Parking Storage or some shit
        List<Floor> floors = new ArrayList<>();

        floors.add(floor0);
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        floors.add(floor4);
        floors.add(floor5);

        //Making Lists for the vehicles to be parked
        ArrayList<Vehicle> ground=new ArrayList<>();
        ArrayList<Vehicle> first=new ArrayList<>();
        ArrayList<Vehicle> second=new ArrayList<>();
        ArrayList<Vehicle> third=new ArrayList<>();
        ArrayList<Vehicle> fourth=new ArrayList<>();
        ArrayList<Vehicle> fifth=new ArrayList<>();

//Initializing a list of lists
        List<ArrayList<Vehicle>> listOfVehicles=new ArrayList<>();

        listOfVehicles.add(ground);
        listOfVehicles.add(first);
        listOfVehicles.add(second);
        listOfVehicles.add(third);
        listOfVehicles.add(fourth);
        listOfVehicles.add(fifth);
//Common list of vehicles
        ArrayList<Vehicle> common=new ArrayList<>();


        int choice = 1;

        IITCarParkManager CarParkManager =new IITCarParkManager();

        while(choice != 9) {
//            Menu
            System.out.println("1. Park a vehicle.");
            System.out.println("2. Retrieve a vehicle.");
            System.out.println("3. Print a list of the vehicles that are parked in the parkinglot.");
            System.out.println("4. Print the percentage of the type of vehicles in the parkinglot.");
            System.out.println("5. The vehicle that stayed the longest and the last vehicle that entered the parkinglot last.");
            System.out.println("6. Print the charges per vehicle");
            System.out.println("9. Exit");

            int x=sc.nextInt();

            switch(x) {
//                park vehicle
                case 1:
                    CarParkManager.parkVehicle(floors,listOfVehicles,common);
                    break;

//              retrieve vehicle
                case 2:
                    CarParkManager.deleteVehicle(floors, listOfVehicles,common);
                    break;
                case 3:
                    CarParkManager.printVehicleParked(common);
                    break;
                case 4:
                    CarParkManager.printPercentage(common);
                    break;
                case 5:
                    CarParkManager.printLongest(common);
                    CarParkManager.printLastVehicle(common);
                    break;

                case 6:
                    CarParkManager.printReceipt(common);
                    break;

                case 9:
                    System.exit(-1);
                    break;

                default:
                    System.out.println("Invalid input!");
                    choice = 1;
            }

        }

    }
}
