package org.example.singleresponsability.solution;

import lombok.RequiredArgsConstructor;
import org.example.object.User;
import org.example.singleresponsability.solution.interfaces.DataBaseInterface;
import org.example.singleresponsability.solution.interfaces.CreateReportUserNotSaveInterface;
import org.example.singleresponsability.solution.interfaces.SendEmailInterface;
import org.example.singleresponsability.solution.interfaces.SendInfoToBusinessContactInterface;

@RequiredArgsConstructor
public class SaveUserUseCase {

    private DataBaseInterface dataBaseInterface;
    private SendEmailInterface sendEmailInterface;
    private SendInfoToBusinessContactInterface sendInfoToBusinessContactInterface;
    private CreateReportUserNotSaveInterface createReportUserNotSaveInterface;

    public void save(User user){
        if(dataBaseInterface.saveUser(user)){
            sendEmailInterface.sendEmail(user);
            sendInfoToBusinessContactInterface.sendInfoToBusinessContact(user);

        }
        else {
            createReportUserNotSaveInterface.reportUserNotSave(user);
        }
    }


}
