package modern_adapter;

public class PaymentMethods {
    public static void creditCard(double amount) {
        System.out.println("Processing credit card payment");
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    public static void boleto(double amount) {
        System.out.println("Processing boleto payment");
        System.out.println("Paid " + amount + " using Boleto.");
    }

    public static void pix(double amount) {
        System.out.println("Processing Pix payment");
        System.out.println("Paid " + amount + " using Pix.");
    }
}
