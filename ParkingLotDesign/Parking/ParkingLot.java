package ParkingLotDesign.Parking;
import java.util.*;

import ParkingLotDesign.Vehicles.Vehicle;

public class ParkingLot {

    private static ParkingLot parkingLot;

    private List<ParkingFloor> floors;
    private String parkingLotName;
    private Location location;

    private ParkingLot(int floors,int carspots,int bikespots,String name,Location location){
        this.floors=new ArrayList<>();
        for(int i=0;i<floors;i++){
            this.floors.add(new ParkingFloor(i, carspots, bikespots));
        }
        this.parkingLotName=name;
        this.location=location;
    }

    public static ParkingLot getInstanceOfParkingLot(int floors,int carspots,int bikespots,String name,Location location){
        if(parkingLot==null){
            parkingLot=new ParkingLot(floors, carspots, bikespots, name, location);
        }
        return parkingLot;
    }

    public ParkingSpot addVehicle(Vehicle vehicle){
        for(ParkingFloor floor:floors){
            ParkingSpot spot = floor.parkVehicle(vehicle);
            if(spot!=null){
                System.out.println(" "+vehicle+" Parked Successfully at floor "+floor.getFloorNo());
                return spot;
            }
        }
        System.out.println(" Failed to park the vehicle ");
        return null;
    }

    

    public boolean removeVehicle(Vehicle vehicle,int floorNo){
        if(floors.get(floorNo).removeVehicle(vehicle)){
            System.out.println(vehicle+" has been removed successfully");
            return true;
        }else{
            System.out.println("Failed to remove the vehicle "+vehicle);
            return false;
        }
    }

}
