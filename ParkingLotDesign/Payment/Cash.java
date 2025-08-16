package ParkingLotDesign.Payment;

public class Cash implements Payment{
    @Override
    public void pay(Double amount) {
        System.out.println("Processing payment of "+amount+" via Cash Payment");
    }
}
