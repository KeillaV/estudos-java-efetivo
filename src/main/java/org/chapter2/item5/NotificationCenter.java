package org.chapter2.item5;

// Item 5: Prefer using dependency injection
public class NotificationCenter {

    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();
        MessageSender wppSender = new WhatsappSender();

        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.notify("Hi! How are you?");

        notificationService.changeSender(smsSender);
        notificationService.notify("I need your help to analise this document");

        notificationService.changeSender(wppSender);
        notificationService.notify("Have a great day!");
    }

}
