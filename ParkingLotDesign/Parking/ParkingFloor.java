package ParkingLotDesign.Parking;
import java.util.*;

import ParkingLotDesign.Vehicles.Vehicle;

public class ParkingFloor {
    
    private int floorNo;
    private List<ParkingSpot> spots;

    public ParkingFloor(int no,int carspots,int bikespots){
        this.floorNo=no;
        spots = new ArrayList<>();
        addSpots(carspots,bikespots);
    }

    private void addSpots(int carspots, int bikespots) {
        for(int i=0;i<carspots;i++)
            spots.add(new CarParkingSpot(floorNo));

        for(int i=0;i<bikespots;i++)
            spots.add(new BikeParkingSpot(floorNo));
    }

    public int getFloorNo(){
        return floorNo;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:spots){
            if(spot.isAvailable() && spot.getParkingSpotType().equalsIgnoreCase(vehicle.getVehicleType())){
                spot.addVehicle(vehicle);
                return spot;
            }
        }
        return null;
    }

    public boolean removeVehicle(Vehicle vehicle){
        for(ParkingSpot spot:spots){
            if(!spot.isAvailable() && spot.getVehicle().equals(vehicle)){
                spot.removeVehicle();
                return true;
            }
        }
        return false;
    }


    
}
