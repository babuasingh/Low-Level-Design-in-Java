package ParkingLotDesign.Ticket;

import java.util.Date;
import java.time.*;

import ParkingLotDesign.Parking.ParkingSpot;
import ParkingLotDesign.Vehicles.Vehicle;

public class Ticket {

    private int TicketNo;
    private Vehicle vehicle;
    private LocalDateTime startTime;
    private ParkingSpot parkingSpot;

    public Ticket(int ticket_no,Vehicle vehicle,ParkingSpot spot){
        this.TicketNo= ticket_no;
        this.vehicle=vehicle;
        startTime=LocalDateTime.now();
        this.parkingSpot=spot;
    }

    public int getTicketNo(){
        return TicketNo;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public LocalDateTime getStartTime(){
        return startTime;
    }

    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }
}
