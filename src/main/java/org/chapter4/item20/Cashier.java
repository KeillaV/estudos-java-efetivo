package org.chapter4.item20;

import java.math.BigDecimal;

public class Cashier {

    public static void payBill(final BigDecimal value, final PaymentMethod paymentMethod) {
        paymentMethod.pay(value);
    }

    public static void main(String[] args) {
        PaymentMethod paymentMethod1 = new Pix();
        PaymentMethod paymentMethod2 = new Billet();

        payBill(BigDecimal.valueOf(50), paymentMethod1);
        payBill(BigDecimal.valueOf(100), paymentMethod2);
    }
}
