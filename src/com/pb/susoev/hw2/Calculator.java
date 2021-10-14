package com.pb.susoev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int operand1 = 0;
        int operand2 = 0;
        String sign;
        int rezult;

        System.out.println("введите цифру №1");
        try {
            operand1=scan.nextInt();
        }
        catch (Exception ex1){
            System.out.println("Это не цифра");
            return;
        }
        System.out.println("введите цифру №2");
        try {
            operand2=scan.nextInt();
        }
        catch (Exception ex2){
            System.out.println("Это не цифра");
            return;
        }
        System.out.println("введите знак операции");
        sign= scan.next();
        //  if (!sign.equals("/")){
        //       if (!sign.equals("*")){
        //            if (!sign.equals("+")){
        //                if (!sign.equals("-")){
        //                      System.out.println("ошибка ввода знака");
        //                }
        //            }
        //        }
        //    }
        switch (sign){
            case "+":
                rezult=operand1+operand2;
                System.out.println("Результат="+rezult);
                break;
            case "-":
                rezult=operand1-operand2;
                System.out.println("Результат="+rezult);
                break;
            case "*":
                rezult=operand1*operand2;
                System.out.println("Результат="+rezult);
                break;
            case "/":
                try {
                    rezult=operand1/operand2;
                }
                catch (ArithmeticException ex3 ) {
                    System.out.println("Ошибка деления на 0");
                    return;
                }
                System.out.println("Результат="+rezult);
                break;
            default: System.out.println("ошибка ввода знака");
        }

    }
}
