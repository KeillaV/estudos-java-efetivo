package org.chapter4.item18;

import java.math.BigDecimal;

public class Market {

    public static void main(String[] args) {
        var product1 = new ShoppingProduct(1, "Arroz", BigDecimal.valueOf(3.5), "Alimento", 1);
        var product2 = new ShoppingProduct(2, "Detergente", BigDecimal.valueOf(2.5), "Limpeza", 2);

        var shoppingCart = new ShoppingCart("Keilla");
        shoppingCart.addItem(product1);
        System.out.println(shoppingCart);
        shoppingCart.addItem(product2);
        System.out.println(shoppingCart);

        shoppingCart.removeItem(product1);
        System.out.println(shoppingCart);
        shoppingCart.addItem(product2);
        System.out.println(shoppingCart);
    }
}