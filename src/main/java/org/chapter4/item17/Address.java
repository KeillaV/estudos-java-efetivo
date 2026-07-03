package org.chapter4.item17;

// Item 17: minimize class mutability
public final class Address {
    private final String street;
    private final String neighborhod;
    private final String city;
    private final String state;
    private final int cep;

    public Address(final String street, final String neighborhod, final String city,
                   final String state, final int cep) {
        this.street = street;
        this.neighborhod = neighborhod;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    public String getStreet() {
        return this.street;
    }

    public String getNeighborhod() {
        return this.neighborhod;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public int getCep() {
        return this.cep;
    }
}
