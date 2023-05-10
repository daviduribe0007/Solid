package org.example.dependencyinversion.solution;

import org.example.dependencyinversion.solution.implementatios.SaveUserDataBaseSQL;
import org.example.object.User;

public class Main {



    public static void main(String[] args) {
        SaveUserUseCase saveUserUseCase = new SaveUserUseCase(new SaveUserDataBaseSQL());

        saveUserUseCase.setSaveDataBase(User.builder()
                .id(1)
                .lastName("Uribe")
                .name("David")
                .build());

    }

}
