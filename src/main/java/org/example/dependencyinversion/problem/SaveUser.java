package org.example.dependencyinversion.problem;

import org.example.object.User;

public class SaveUser {
    //the beast way it's depend of abstraction and not depend on one specific class
    public void save(User user) {

        dataBaseSQL(user);
    }

    private void dataBaseSQL(User user) {
        //Logic to save in database
    }


}
