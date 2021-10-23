package com.pb.susoev.hw4;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи 1");
        char[] str = scan.nextLine().toCharArray();
        System.out.println("Введи 2");
        char[] str1 = scan.nextLine().toCharArray();
        int count=0;
        int count1=0;
      //  char[] s = "fdds".toCharArray();
        //char[] s1 = "cda".toCharArray();
       // String s= "fdd";
       // String s1= "dsf";
//проверка на знаки припинания строки2
        for(int i = 0; i < str.length; i++) {
            if (str[i] != '!') {
                if (str[i] != '/') {
                    if (str[i] != '.'){
                        if (str[i] != '?'){
                            if (str[i] != ','){
                                if (str[i] != ';') {
                                    count++;
                            }
                        }
                    }
                }
            }
        }
        }
//проверка на знаки припинания строки1
        for(int j = 0; j < str1.length; j++) {
            if (str1[j] != '!') {
                if (str1[j] != '/') {
                    if (str1[j] != '.'){
                        if (str1[j] != '?'){
                            if (str1[j] != ','){
                                if (str1[j] != ';') {
                                    count1++;
                                }
                            }
                        }
                    }
                }
            }
        }
        //проверка длины длины строки с длиной строки1
        if  (count != count1) {System.out.println("False");
        }
        else
        //    substring(s, i){
        {
            System.out.println("True");
    }
        char[] bukovky = new char[count];
        int buk_iter=0;

        for(int i =0;i<count;i++){

            char pin=str[i];

            if(!Character.isLetter(pin)){
                continue;
            }

            if(!bukovky.equals(pin)){
                bukovky[buk_iter]=pin;
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
                    System.out.println("PIZDEC");
                    return;
                }


            }


        }






       //if (s.length()!=s1.length()) System.out.println("False"); else System.out.println("True");
       /* for(int i = 0; i < Math.min(s.length, s1.length); i++){
            if(s[i] != s1[i]){
                System.out.println("строка 1 символ" + i + " " + s[i] + "-->" + "строка 2 символ" + i + " " + s1[i]);
            }
            if(i == Math.min(s.length, s1.length) - 1){
                i++;
                System.out.println(s.length > i ? ("строка 1 субстрока" + substring(s, i) + "строка 2 NON")
                        : ("строка 2 субстрока" + substring(s1, i) + "строка 1 NON"));
            }
        }
    }


    private static String substring(char[] s1, int i) {
        String s = "";
        for(int a = i; a < s1.length; a++){
            s += s1[a];
        }
        return s;*/
    }
}
