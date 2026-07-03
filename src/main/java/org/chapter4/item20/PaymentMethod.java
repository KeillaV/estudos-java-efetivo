package org.chapter4.item20;

import java.math.BigDecimal;

// Item 20: Prefer using interfaces over abstract classes
public interface PaymentMethod {

    void pay(final BigDecimal value);

}
