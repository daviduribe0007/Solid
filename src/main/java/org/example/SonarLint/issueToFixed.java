package org.example.SonarLint;

import java.util.logging.Level;
import java.util.logging.Logger;

public class issueToFixed {

    Logger logger = Logger.getLogger(issueToFixed.class.getName());

    //Wrong name to method
    public void PrintNumbers(){

    }

    //Name in method don't say noting
    //areaRectangulo
    public int ar(int a, int b){
        return a*b;
    }

    //parameters not used

    public void printParameters(String name,String lastName,int age ){
        System.out.println("your name is: "+ name+" and your last name is "+ lastName);
    }

    //how to print something
    public void printName(String name){
        System.out.println(name);
        logger.log(Level.INFO,name);
    }

    //Unused code

    public static class UnusedCodeExample {
        public void unusedMethod() {
            // This method is not used anywhere in the code
        }
        public void usedMethod() {
            // This method is used somewhere in the code
        }
    }

    //classes only comment

//    public static class UnusedCodeExample {
//        public void unusedMethod() {
//            // This method is not used anywhere in the code
//        }
//        public void usedMethod() {
//            // This method is used somewhere in the code
//        }
//    }

    //

    public static class NullPointerExample {
        public void doSomething(String str) {
            if (str.length() > 0) {
                // Do something with the string
            }
        }
    }

    //fixed

    public class NullPointerExampleWithValidation {
        public void doSomething(String str) {
            if (str != null && str.length() > 0) {
                // Do something with the string
            }
        }

    }





}
