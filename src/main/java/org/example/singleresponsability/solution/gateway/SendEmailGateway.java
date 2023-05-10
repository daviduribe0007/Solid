package org.example.singleresponsability.solution.gateway;

import org.example.object.User;
import org.example.singleresponsability.solution.interfaces.SendEmailInterface;

public class SendEmailGateway implements SendEmailInterface {
    public void sendEmail(User user) {
        // logic to sent email
    }
}
