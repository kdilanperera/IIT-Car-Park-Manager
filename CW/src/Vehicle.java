import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Vehicle {
    private String vehicleRegNo;
    private DateTime date;
    private int spaceOccupied;
    private String type;
    private int price;

    public Vehicle() {

    }

    public String getVehicleRegNo(){
        return this.vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo){
        this.vehicleRegNo=vehicleRegNo;
    }

    public DateTime getDate(){
        return date;
    }

    public void setDate(DateTime date){
        this.date=date;
    }

    public void setSpaceOccupied(int spaceOccupied){
        this.spaceOccupied=spaceOccupied;
    }

    public int getSpaceOccupied(){
        return spaceOccupied;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setPrice(DateTime checkDateTime, ArrayList<Vehicle> common){
//        for(int x=0;x<common.size();x++) {
//            int years = checkDateTime.getYear() - common.get(x).getDate().getYear();
//            int months=checkDateTime.getMonth()-common.get(x).getDate().getMonth();
//
//        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Vehicle Registration Number='" + vehicleRegNo + '\'' +
                ", Entry Date=" + date +
                ", type='" + type + '\'' +
                '}';
    }
}
