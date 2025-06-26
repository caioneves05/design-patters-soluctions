package common_adapter;

public class Boleto implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Boleto.");
    }
}
