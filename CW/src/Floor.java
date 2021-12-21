//Class is used to see where the vehicles can park and to calculate and keep track of the slots used

public class Floor {
    private int capacity = 180;
    private int slotsUsed = 0;
    private boolean parkCar;
    private boolean parkMotorbike;
    private boolean parkVan;
    private boolean parkMinibus;
    private boolean parkMinilorry;


//    Constructor
    public Floor(boolean can_park_car, boolean can_park_motorbike, boolean can_park_van, boolean can_park_minibus, boolean can_park_minilorry ){
        this.parkCar = can_park_car;
        this.parkMotorbike = can_park_motorbike;
        this.parkVan = can_park_van;
        this.parkMinibus = can_park_minibus;
        this.parkMinilorry = can_park_minilorry;
    }

    public boolean canParkCar(){
        return parkCar;
    }
    public boolean canParkMotorbike(){
        return parkMotorbike;
    }
    public boolean canParkVan(){
        return parkVan;
    }
    public boolean canParkMinibus(){
        return parkMinibus;
    }
    public boolean canParkMiniLorry(){
        return parkMinilorry;
    }


    public int spaceAvailale(){
        return (getCapacity() - getSlotsUsed());
    }

    public void setSlotsUsed(int x){
        this.slotsUsed = getSlotsUsed() + x;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getSlotsUsed(){
        return slotsUsed;
    }
}
