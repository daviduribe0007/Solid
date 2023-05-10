package org.example.singleresponsability.solution.repository;

import org.example.object.User;
import org.example.singleresponsability.solution.interfaces.DataBaseSQLInterface;

public class DataBaseSQLRepository implements DataBaseSQLInterface {
    public boolean saveUser(User user) {
        //Logic to save on data base sql
        return user.getId()==1;
    }
}
