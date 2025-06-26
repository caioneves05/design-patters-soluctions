package modern_adapter;

public class Main {
    public static void main(String[] args) {
        String paymentMethod = "BOLETO"; /* CREDIT_CARD, BOLETO, PIX */

        PaymentMethod.valueOf(paymentMethod).pay(203.50);
    }
}