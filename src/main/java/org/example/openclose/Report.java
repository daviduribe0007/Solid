package org.example.openclose;

import org.example.enums.TipeReport;
import org.example.object.User;
import org.example.openclose.problem.MakeReport;
import org.example.openclose.solution.CreateReportJSON;
import org.example.openclose.solution.MakeReportUseCase;

import java.util.ArrayList;
import java.util.List;

public class Report {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();

        MakeReport makeReport = new MakeReport();
        makeReport.generateReport(userList, TipeReport.EXCEL);


        ///----

        MakeReportUseCase makeReportUseCase = new MakeReportUseCase(new CreateReportJSON());
        makeReportUseCase.makeReport(userList);

    }


}
