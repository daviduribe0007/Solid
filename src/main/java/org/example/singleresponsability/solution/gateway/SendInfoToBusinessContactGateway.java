package org.example.singleresponsability.solution.gateway;

import org.example.object.User;
import org.example.singleresponsability.solution.interfaces.SendEmailInterface;

public class SendInfoToBusinessContactGateway implements SendEmailInterface {
    public void sendEmail(User user) {
        // logic to send information to businessContact
    }
}
