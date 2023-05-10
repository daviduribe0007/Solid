package org.example.dependencyinversion.solution;

import lombok.AllArgsConstructor;
import org.example.dependencyinversion.solution.interfaces.SaveDateBase;
import org.example.object.User;

@AllArgsConstructor
public class SaveUserUseCase {

    private SaveDateBase saveDataBase;

    public void setSaveDataBase(User user){
        saveDataBase.save(user);
    }

}
