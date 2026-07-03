package org.chapter4.item18;

import java.math.BigDecimal;

public class ShoppingProduct {
    private final long id;
    private final String name;
    private final BigDecimal price;
    private final String category;
    private int quantity;

    public ShoppingProduct(final long id, final String name,
                           final BigDecimal price, final String category, final int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean isUnique() {
        return this.quantity == 1;
    }

    public void incrementQuantity() {
        this.quantity++;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ShoppingProduct)) {
            return false;
        }

        ShoppingProduct otherItem = (ShoppingProduct) obj;
        return (this.id == otherItem.getId()) &&
                (this.name.equals(otherItem.getName())) &&
                (this.price.equals(otherItem.getPrice())) &&
                (this.category.equals(otherItem.getCategory()));
     }

    @Override
    public int hashCode() {
        int result = Long.hashCode(this.id);
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.price.hashCode();
        result = 31 * result + this.category.hashCode();

        return result;
     }

    @Override
    public String toString() {
        return this.quantity + " " + this.name + "(R$" + this.price + ")";
    }

}
