package org.chapter3.itens10_11_12;

public class Money {

    private final Currency currency;
    private final double amount;

    public Money(final double amount, final Currency currency) {
        this.amount  = amount;
        this.currency = currency;
    }

    // Item 10: Overwriting equals
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Money)) {
            return false;
        }

        Money convertedObj = (Money) obj;

        return (convertedObj.getCurrency() == this.currency) &&
                (convertedObj.getAmount() == this.amount);
    }

    // Item 10: Overwriting hashCode
    @Override
    public int hashCode() {
        int result = Double.hashCode(amount);
        result = 31 * result + currency.hashCode();
        return result;
    }

    // Item 10: Overwriting toString
    @Override
    public String toString() {
        return this.currency.getRepresentation() + " " + String.format("%.2f", amount);
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public double getAmount() {
        return this.amount;
    }
}
