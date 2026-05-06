package org.chapter1.item1;

public class User {

    private final String name;
    private final Date birthDate;

    private User(final String name, final Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public static User of(final String name, final Date birthDate) {
        return new User(name, birthDate);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate.toString();
    }


}
