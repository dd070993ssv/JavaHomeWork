package com.pb.susoev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int operand1;
        int operand2;
        String sign;
        int rezult;

        System.out.println("введите цифру №1");
        operand1=scan.nextInt();
        System.out.println("введите цифру №2");
        operand2=scan.nextInt();
        System.out.println("введите знак операции");
        sign= scan.next();

       // System.out.println(operand1+operand2+sign);

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
                rezult=operand1/operand2;
                System.out.println("Результат="+rezult);
                break;
            default: System.out.println("ошибка ввода знака");
         //   System.out.println("ошибка");
        }

    }
}