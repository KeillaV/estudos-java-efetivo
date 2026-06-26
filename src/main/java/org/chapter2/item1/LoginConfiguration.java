package org.chapter2.item1;

public class LoginConfiguration {

    private static LoginConfiguration INSTANCE;

    private LoginConfiguration() {
    }

    public static synchronized LoginConfiguration getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoginConfiguration();
        }

        return INSTANCE;
    }

    public void login(final User user) {
        System.out.println("Logging user " + user.getName() + " (" + user.getBirthDate() + ")...");
        System.out.println("Successfully logged!");
    }

}
