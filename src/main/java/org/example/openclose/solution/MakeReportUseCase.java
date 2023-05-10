package org.example.openclose.solution;

import lombok.RequiredArgsConstructor;
import org.example.enums.TipeReport;
import org.example.object.User;
import org.example.openclose.solution.interfaces.ReportGenerator;

import java.util.List;

@RequiredArgsConstructor
public class MakeReportUseCase {

    private ReportGenerator reportGenerator;

    public MakeReportUseCase(ReportGenerator reportGenerator){
        this.reportGenerator= reportGenerator;
    }

    public void makeReport(List<User> userList){

        reportGenerator.createReport(userList);

    }

}
