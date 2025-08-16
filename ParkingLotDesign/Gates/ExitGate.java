package ParkingLotDesign.Gates;

import java.time.*;
import java.util.Date;

import ParkingLotDesign.Parking.ParkingLot;
import ParkingLotDesign.Payment.Payment;
import ParkingLotDesign.Ticket.Ticket;

public class ExitGate {
    private Ticket ticket;

    public ExitGate(Ticket ticket) {
        this.ticket = ticket;
    }

    public void ExitVehicle(ParkingLot obj) {
        if (obj.removeVehicle(ticket.getVehicle(), ticket.getParkingSpot().getfloorNoForParkingSpot())) {
            System.out.println("Vehicle removed Successfully "+ticket.getVehicle());
        } else {
            System.out.println("Error occured during removing the vehicle");
        }
    }

    public double calculateParkCharge() {
        LocalDateTime start = ticket.getStartTime();
        LocalDateTime current = LocalDateTime.now();
        long diffinMinutes = Duration.between(start, current).toMinutes();
        long hours = diffinMinutes / 60;
        double vehicleRate = ticket.getVehicle().getRate();
        double ans = hours * vehicleRate;

        if (diffinMinutes % 60 > 15)
            ans += vehicleRate;
        return ans;

    }

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

}
