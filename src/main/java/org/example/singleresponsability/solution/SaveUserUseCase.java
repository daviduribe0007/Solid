package org.example.singleresponsability.solution;

import lombok.RequiredArgsConstructor;
import org.example.object.User;
import org.example.singleresponsability.solution.interfaces.DataBaseSQLInterface;
import org.example.singleresponsability.solution.interfaces.CreateReportUserNotSaveInterface;
import org.example.singleresponsability.solution.interfaces.SendEmailInterface;
import org.example.singleresponsability.solution.interfaces.SendInfoToBusinessContactInterface;

@RequiredArgsConstructor
public class SaveUserUseCase {

    private DataBaseSQLInterface dataBaseSQLInterface;
    private SendEmailInterface sendEmailInterface;
    private SendInfoToBusinessContactInterface sendInfoToBusinessContactInterface;
    private CreateReportUserNotSaveInterface createReportUserNotSaveInterface;

    public void save(User user){
        if(dataBaseSQLInterface.saveUser(user)){
            sendEmailInterface.sendEmail(user);
            sendInfoToBusinessContactInterface.sendInfoToBusinessContact(user);

        }
        else {
            createReportUserNotSaveInterface.reportUserNotSave(user);
        }
    }


}
