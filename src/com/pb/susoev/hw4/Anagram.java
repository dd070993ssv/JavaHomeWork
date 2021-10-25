package com.pb.susoev.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи строку №1");
        char[] str = scan.nextLine().toCharArray();
        System.out.println("Введи строку №2");
        char[] str1 = scan.nextLine().toCharArray();
        int count=0;
        int count1=0;
        //Проверка на знаки припинания в строке
        for(int i = 0; i < str.length; i++) {
            char buk = str[i];
            if(Character.isLetter(buk)){
                count++;
            }
        }
        //Проверка на знаки припинания в строке1
        for(int j = 0; j < str1.length; j++) {
            char buk = str1[j];
            if(Character.isLetter(buk)){
                count1++;
            }
        }
        //проверка длины длины строки с длиной строки1
        if  (count != count1) {
            System.out.println("False");
        } else {

        char[] mas_bukv = new char[count];
        int buk_iter=0;
        //проверка буквы на количество вхождений в строке и строке1
        for(int i =0;i<count;i++){
            char pin=str[i];
            if(!Character.isLetter(pin)){
                continue;
            }

            if(!mas_bukv.equals(pin)){
                mas_bukv[buk_iter]=pin;
                buk_iter++;
                int countStr=0;
                int countStr1=0;
                for(int y=0;y<str.length;y++){
                    if(str[y]==pin){
                        countStr++;
                    }
                }
                for(int y=0;y<str1.length;y++){
                    if(str1[y]==pin){
                        countStr1++;
                    }
                }
                if(countStr==countStr1){
                }else{
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}}