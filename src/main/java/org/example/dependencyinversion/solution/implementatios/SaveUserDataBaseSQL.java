package org.example.dependencyinversion.solution.implementatios;

import org.example.dependencyinversion.solution.interfaces.SaveDateBase;
import org.example.object.User;

public class SaveUserDataBaseSQL implements SaveDateBase {
    @Override
    public void save(User user) {
        //Logic to save in SQL
    }
}
