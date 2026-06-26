package org.chapter3.itens10_11_12;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    void whenEqualObjectsShouldReturnTrue() {
        var money1 = new Money(5, Currency.BRL);
        var money2 = new Money(5, Currency.BRL);
        var money3 = new Money(5, Currency.BRL);

        // reflexive
        assertEquals(money1, money1);
        assertEquals(money2, money2);
        assertEquals(money3, money3);

        //symmetric
        assertEquals(money1, money2);
        assertEquals(money2, money1);

        // transitive
        assertEquals(money2, money3);
        assertEquals(money3, money1);

        // consistent
        assertEquals(money1, money2);
        assertEquals(money1, money2);
        assertEquals(money1, money2);
    }

    @Test
    void whenNotEqualObjectsShouldReturnFalse() {
        var money1 = new Money(5, Currency.BRL);
        var money2 = new Money(5, Currency.USD);
        var money3 = new Money(15, Currency.BRL);
        var currency = Currency.USD;

        assertNotEquals(money1, money2);
        assertNotEquals(money2, money3);
        assertNotEquals(money3, money1);
        assertNotEquals(currency, money1);
    }

    @Test
    void whenEqualObjectsShouldReturnSameHashCode() {
        var money1 = new Money(5, Currency.BRL);
        var money2 = new Money(5, Currency.BRL);

        assertEquals(money1.hashCode(), money2.hashCode());
    }

    @Test
    void whenNotEqualObjectsShouldReturnDifferentHashCode() {
        var money1 = new Money(5, Currency.BRL);
        var money2 = new Money(5, Currency.USD);

        assertNotEquals(money1.hashCode(), money2.hashCode());
    }

    @Test
    void shouldReturnValidToString() {
        var money = new Money(10, Currency.BRL);
        var money2 = new Money(10, Currency.USD);

        assertEquals("R$ 10,00", money.toString());
        assertEquals("$ 10,00", money2.toString());
    }

}
