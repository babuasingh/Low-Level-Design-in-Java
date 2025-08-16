package ParkingLotDesign.Vehicles;

public class VehicleFactory {
    private static Vehicle vehicle;

    public static Vehicle creatVehicle(String type, String vehicle_no) {
        if (type.equalsIgnoreCase("car")) {
            vehicle = new Car(vehicle_no);
        } else if (type.equalsIgnoreCase("bike")) {
            vehicle = new Bike(vehicle_no);
        } else {
            System.out.println("The following vehicle is not allowed");
        }
        return vehicle;
    }
}
