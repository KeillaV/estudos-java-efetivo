package org.chapter4.item18;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Item 18: Prefer composition over heritage
public class ShoppingCart {

    private final List<ShoppingProduct> shoppingProductList;
    private final String owner;

    public ShoppingCart(final String owner) {
        this.shoppingProductList = new ArrayList<>();
        this.owner = owner;
    }

    public void addItem(final ShoppingProduct item) {
        var cartItem = getProductIfPresent(item);

        if (cartItem.isPresent()) {
             cartItem.get().incrementQuantity();
        } else {
            shoppingProductList.add(item);
        }
    }

    public void removeItem(final ShoppingProduct item) {
        var cartItem = getProductIfPresent(item);

        if (cartItem.isEmpty()) {
            throw new UnsupportedOperationException("Cannot remove a item that don't exist");
        }

        ShoppingProduct existingItem = cartItem.get();
        if (existingItem.isUnique()) {
            shoppingProductList.remove(cartItem.get());
        } else {
            existingItem.decreaseQuantity();
        }
    }

    private Optional<ShoppingProduct> getProductIfPresent(final ShoppingProduct product) {
        if (shoppingProductList.contains(product)) {
            int indexOfProduct = shoppingProductList.indexOf(product);
            return Optional.of(shoppingProductList.get(indexOfProduct));
        }

        return Optional.empty();
    }

    @Override
    public String toString() {
        String list = "\n Shopping list: \n";
        for (ShoppingProduct product: this.shoppingProductList) {
            list = list.concat(product.toString() + "\n");
        }
        return list;
    }

    public String getOwner() {
        return this.owner;
    }
}
