package org.chapter3.itens10_11_12;

public enum Currency {
    BRL("R$"), USD("$");

    private final String representation;

    Currency(final String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return this.representation;
    }
}
