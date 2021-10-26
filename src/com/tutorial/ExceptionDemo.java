package com.tutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no::");
        int b = sc.nextInt();


            int result = a / b;
            System.out.println("Result is::" + result);

            String s=null;
            System.out.println(s.length());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Ivalid Iput"+inputMismatchException.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("HIII");
        }
        System.out.println("execute this");

    }
}