package com.mytube;

public class TheEmailService implements EmailService {
    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}