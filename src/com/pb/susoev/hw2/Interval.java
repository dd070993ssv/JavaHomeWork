package com.pb.susoev.hw2;

import java.util.Scanner;

public class Interval {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int cufra = 0;
            System.out.println("введите цифру");
            try {
                cufra = scan.nextInt();
            } catch (Exception ex1) {
                System.out.println("Это не цифра");
                return;
            }
            if (cufra<0){
                System.out.println("Цифра с знаком минус");
            }
            else if (cufra>=0&&cufra<=14){
              System.out.println("Диапазон [0 -14]");
            }
          else if (cufra>14&&cufra<=35){
              System.out.println("Диапазон [15 -35]");
          }
          else if (cufra>35&&cufra<=50){
              System.out.println("Диапазон [36 -50]");
          }
          else if (cufra>50&&cufra<=100){
              System.out.println("Диапазон [51 -100]");
          }
          else System.out.println("Диапазон больше 100");
        }
    }

