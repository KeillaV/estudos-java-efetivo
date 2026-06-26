package org.chapter2.item5;

public class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(final String message) {
        messageSender.send(message);
    }

    public void changeSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

}
