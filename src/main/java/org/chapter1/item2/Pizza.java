package org.chapter1.item2;

// Item 2: consider using a builder when there's too many parameters
public class Pizza {

    private final int slices;
    private final PizzaFlavor flavor;
    private final boolean estuffedEdge;
    private final boolean extraCheese;
    private final boolean specialSauce;
    private final boolean olive;

    public Pizza(Builder builder) {
        this.slices = builder.slices;
        this.flavor = builder.flavor;
        this.estuffedEdge = builder.stuffedEdge;
        this.extraCheese = builder.extraCheese;
        this.specialSauce = builder.specialSauce;
        this.olive = builder.olive;
    }

    @Override
    public String toString() {
        return flavor.name() + " pizza with " + slices + " slices \n" +
                "Estuffed edge: " + estuffedEdge + "\n" +
                "Extra cheese: " + extraCheese + "\n" +
                "Special sauce: " + specialSauce + "\n" +
                "Has olives: " + olive + "\n";
    }

    public static class Builder {
        private final int slices;
        private final PizzaFlavor flavor;
        private boolean stuffedEdge = false;
        private boolean extraCheese = false;
        private boolean specialSauce = false;
        private boolean olive = false;

        public Builder(int slices, PizzaFlavor flavor) {
            this.slices = slices;
            this.flavor = flavor;
        }

        public Builder fillEdge() {
            this.stuffedEdge = true;
            return this;
        }

        public Builder addExtraCheese() {
            this.extraCheese = true;
            return this;
        }

        public Builder addSpecialSauce() {
            this.specialSauce = true;
            return this;
        }

        public Builder putOlives() {
            this.olive = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
