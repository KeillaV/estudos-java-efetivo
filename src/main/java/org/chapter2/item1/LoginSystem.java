package org.chapter2.item1;

public class LoginSystem {

    public static void main(String[] args) {
        // Item 1: consider using static factory methods instead of public constructors:
        var user = User.of("Keilla", Date.from(24, 3, 2002));
        var user2 = User.of("Ayanne", Date.from(1, 7, 2002));
        var loginConfiguration = LoginConfiguration.getInstance();

        loginConfiguration.login(user);
        loginConfiguration.login(user2);
    }
}
