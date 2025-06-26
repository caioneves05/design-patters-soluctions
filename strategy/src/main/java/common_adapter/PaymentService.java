package common_adapter;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(int amount) {
        if(paymentMethod == null)
            throw new IllegalArgumentException("Payment method cannot be accepted as null");
        paymentMethod.pay(amount);
    }
}
