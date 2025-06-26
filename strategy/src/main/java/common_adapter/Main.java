package common_adapter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int paymentMethodCode = 1  /* 1 for Credit Card, 2 for Boleto, 3 for Pix */;
        int amountTransaction = 1000;

        Map<Integer, PaymentMethod> methods = Map.of(
                1, new CreditCard(),
                2, new Boleto(),
                3, new Pix()
        );


        PaymentMethod selectedMethod = methods.get(paymentMethodCode);

        PaymentService paymentService = new PaymentService(selectedMethod);

        paymentService.pay(1000);

    }
}