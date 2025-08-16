package ParkingLotDesign.Payment;

public class PaymentStrategy {
    private Payment payment;

    public PaymentStrategy(Payment payment){
        this.payment=payment;
    }

    public void processPayment(double amount) {
        this.payment.pay(amount);
    }
}
