package org.example.singleresponsability.problem;

import org.example.object.User;

public class SaveUser {

    public void save(User user ){
        if(saveOnDataBase(user)){
            sendEmail(user);
            sendInfoToBusinessContact(user);

        }
        else {
            reportUserNotSaved(user);
        }


    }

    private Boolean saveOnDataBase(User user){
        //call to db and return true if the result be okay
        return user.getId()==1;
    }

    private void sendEmail(User user){
        //Logic to crate the email and sent it
    }

    private void sendInfoToBusinessContact(User user){
        //Consume one service to send the notification " One new user was created"
    }

    private void reportUserNotSaved(User user){
        //register when the operation save failed
    }


}
