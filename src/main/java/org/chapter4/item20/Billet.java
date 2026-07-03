package org.chapter4.item20;

import java.math.BigDecimal;

public class Billet implements PaymentMethod {

    @Override
    public void pay(BigDecimal value) {
        System.out.println("Paying " + value + " with billet...");
    }

}
