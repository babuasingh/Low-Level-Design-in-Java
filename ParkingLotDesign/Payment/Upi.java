package ParkingLotDesign.Payment;

public class Upi implements Payment{

    @Override
    public void pay(Double amount) {
        System.out.println("Processing payment of "+amount+" via UPI Payment");
    }
    
}
