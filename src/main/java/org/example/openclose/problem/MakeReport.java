package org.example.openclose.problem;

import org.example.enums.TipeReport;
import org.example.object.User;

import java.util.List;


public class MakeReport {

    public void generateReport(List<User> userList, TipeReport tipeReport) {
        //this is a generic code to create reports

        if (tipeReport == TipeReport.EXCEL){
            generateReportExcel(userList);
        }else  if (tipeReport == TipeReport.PDF){
            generateReportPDF(userList);
        }else if (tipeReport == TipeReport.JSON){
            generateReportJSON(userList);
        }else if (tipeReport == TipeReport.XML){
            generateReportXML(userList);
        }
    }

    private void generateReportPDF(List<User> userList) {
        //Logic to create the report on PDF with the user list ...
    }

    private void generateReportJSON(List<User> userList) {
        //Logic to create the report on JSON with the user list ...
    }

    private void generateReportXML(List<User> userList) {
        //Logic to create the report on XML with the user list ...
    }

    private void generateReportExcel(List<User> userList) {
        //Logic to create the report on Excel with the user list ...
    }
}
