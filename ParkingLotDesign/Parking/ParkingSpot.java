package ParkingLotDesign.Parking;

import ParkingLotDesign.Vehicles.Vehicle;

public abstract class ParkingSpot {

    private String parkingForVehicleType;
    private boolean isTaken;
    private Vehicle vehicle;
    private int floorNoOfParkingSpot;

    ParkingSpot(String type,int spot){
        parkingForVehicleType=type;
        floorNoOfParkingSpot=spot;
        isTaken=false;
    }

    public ParkingSpot addVehicle(Vehicle vehicle){
        if(!isTaken && vehicle.getVehicleType().equalsIgnoreCase(parkingForVehicleType)){
            this.vehicle=vehicle;
            isTaken=true;
            return this;
        }

        System.out.println("The Spot is already taken or "+vehicle.getVehicleType()+" is not allowed to park at this spot");
        return null;
    }

    public void removeVehicle(){
            isTaken=false;
            vehicle=null;
        // System.out.println("Spot is already vacant");
    }

    public String getParkingSpotType(){
        return parkingForVehicleType;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }


    public boolean isAvailable(){
        return !isTaken;
    }

    public int getfloorNoForParkingSpot(){
        return floorNoOfParkingSpot;
    }
}
