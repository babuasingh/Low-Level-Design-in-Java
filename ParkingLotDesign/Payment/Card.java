package ParkingLotDesign.Payment;

public class Card implements Payment{

    @Override
    public void pay(Double amount) {
        System.out.println("Processing payment of "+amount+" via Card Payment");
    }
    
}
