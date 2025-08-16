package ParkingLotDesign.Gates;

import ParkingLotDesign.Parking.ParkingLot;
import ParkingLotDesign.Parking.ParkingSpot;
import ParkingLotDesign.Ticket.Ticket;
import ParkingLotDesign.Vehicles.Vehicle;

public class EntranceGate {

    private Ticket ticket;
    static int x1=1,x2=1000;

    public Ticket getTicket() {
        if(ticket==null){
            System.out.println("Ticket not generated yet");
        }
        return ticket;
    }

    public void generateTicket(Vehicle vehicle,ParkingLot obj) {
        try {

            ParkingSpot spot = obj.addVehicle(vehicle);
            if(spot==null){
                throw new Exception();
            }
            int ticketno = generateRandomInteger();
            this.ticket = new Ticket(ticketno, vehicle,spot);
//            System.out.println("Vehicle Parked Succesfully "+vehicle);
        } catch (Exception e) {
            System.out.println("Error occured during generating the ticket ");
        }
    }

    public int generateRandomInteger(){
        double f = Math.random()/Math.nextDown(1.0);
        double x = x1*(1.0 - f) + x2*f;
        return (int)x;
    }
    
}
