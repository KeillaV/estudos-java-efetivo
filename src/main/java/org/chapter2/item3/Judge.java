package org.chapter2.item3;

// Item 3: implementing singleton using enum
public enum Judge {
    INSTANCE;

    public void judge() {
        System.out.println("Start judging...");
        System.out.println("Finished");
    }

    public static void main(String[] args) {
        Judge.INSTANCE.judge();
    }

}

