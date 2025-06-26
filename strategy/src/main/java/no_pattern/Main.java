package no_pattern;

public class Main {
    public static void main(String[] args) {
        String paymentMethod = "BOLETO"; /* CREDIT_CARD, BOLETO, PIX */

        if (paymentMethod == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }
        if (paymentMethod.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment");
        } else if (paymentMethod.equals("BOLETO")) {
            System.out.println("Processing boleto payment");
        } else if (paymentMethod.equals("PIX")) {
            System.out.println("Processing PIX payment");
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}