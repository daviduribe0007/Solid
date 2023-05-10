package org.example.dependencyinversion;

import lombok.AllArgsConstructor;
import org.example.dependencyinversion.solution.interfaces.SaveDateBase;

@AllArgsConstructor
public class SaveUserUseCase {

    private SaveDateBase saveDataBase;

}
