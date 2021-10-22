package com.pb.susoev.hw4;

import java.util.Scanner;

public class CapitalLetter {
         public static void main(String[] args) {
              System.out.println("Введите строку:");
              String str2 = getString();
              char[] charArray = str2.toCharArray();
              boolean foundSpace = true;

              for(int i = 0; i < charArray.length; i++) {
                   if(Character.isLetter(charArray[i])) {
                        if(foundSpace) {
                             charArray[i] = Character.toUpperCase(charArray[i]);
                             foundSpace = false;}
                   } else {
                        foundSpace = true;}
              }
              str2 = String.valueOf(charArray);
              System.out.println("Интерпритированая строка:\n" + str2);
         }
     private static String getString() {
          Scanner scan = new Scanner(System.in);
          String str = scan.nextLine();
          return str;
     }
}
