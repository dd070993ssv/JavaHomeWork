package com.pb.susoev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int x;
        int y;
        String znak;

        System.out.println("vvedite cifru1");
        x=scan.nextInt();
        System.out.println("vvedite cifru2");
        y=scan.nextInt();
        System.out.println("vvedite znak");
        znak= scan.next();


        System.out.println(x+y+znak);

    }
}