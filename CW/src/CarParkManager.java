import java.util.ArrayList;
import java.util.List;

public interface CarParkManager {
     void parkVehicle(List<Floor> floors, List<ArrayList<Vehicle>> Vehicle,ArrayList<Vehicle> common);
     void deleteVehicle(List<Floor> floors, List<ArrayList<Vehicle>> Vehicle,ArrayList<Vehicle> common);
     void printVehicleParked(ArrayList<Vehicle> common);
     void printPercentage(ArrayList<Vehicle> common);
     void printLongest(ArrayList<Vehicle> common);
     void printLastVehicle(ArrayList<Vehicle> common);
     void printReceipt(ArrayList<Vehicle> common);
}
