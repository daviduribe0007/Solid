package org.example.dry;


public class DontRepeatYourself {

    public String getDay(int dayWeek){
        String day = "Out of range";

        if(dayWeek == 1){
            day = "Monday";
        }
        if(dayWeek == 2){
            day = "Tuesday";
        }
        if(dayWeek == 3){
            day = "Wednesday";
        }
        if(dayWeek == 4){
            day = "Thursday";
        }
        if(dayWeek == 5){
            day = "Friday";
        }
        if(dayWeek == 6){
            day = "Saturday";
        }
        if(dayWeek == 7){
            day = "Sunday";
        }

        return day;
    }

    public String getDayStringFromNumber(int dayWeek){

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};

        if(dayWeek < 1|| dayWeek>7 ){
            return "Out of range";
        }
        return daysOfWeek[dayWeek-1];
    }


}
