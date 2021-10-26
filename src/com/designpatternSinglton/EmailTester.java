package com.designpatternSinglton;

public class EmailTester {
    public static void main(String[] args) {
        EmailValidator oj=new EmailValidator();
        boolean isValid=oj.validateEmail("Dhanashri.Ahire@gmail.com");
        System.out.println(isValid);
        isValid=oj.validateEmail("Dhanashri.Ahire@gmailcom");
        System.out.println(isValid);


    }
}
