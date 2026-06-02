package org.chapter1.item2;

public class OrderPizza {

    public static void main(String[] args) {
        Pizza standardPizza = new Pizza.Builder(8, PizzaFlavor.CHICKEN).build();
        System.out.println("Order 1...");
        System.out.println(standardPizza.toString());

        Pizza pizzaWithExtraCheeseAndOlives = new Pizza.Builder(12, PizzaFlavor.CHEESE)
                .addExtraCheese().putOlives().build();
        System.out.println("Order 2...");
        System.out.println(pizzaWithExtraCheeseAndOlives.toString());

        Pizza pizzaAllIn = new Pizza.Builder(6, PizzaFlavor.MEAT)
                .fillEdge().addExtraCheese().addSpecialSauce().putOlives()
                .build();
        System.out.println("Order 3...");
        System.out.println(pizzaAllIn.toString());
    }

}
