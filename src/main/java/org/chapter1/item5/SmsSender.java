package org.chapter1.item5;

public class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS text with message: " + message);
    }
}
