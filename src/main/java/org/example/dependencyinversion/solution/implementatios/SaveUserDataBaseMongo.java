package org.example.dependencyinversion.solution.implementatios;

import org.example.dependencyinversion.solution.interfaces.SaveDateBase;
import org.example.object.User;

public class SaveUserDataBaseMongo implements SaveDateBase {
    @Override
    public void save(User user) {
        //Logic to save in mongo
    }
}
