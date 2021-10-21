package com.pb.susoev.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Игра началась!!!\nОтгадай число, вводя свою цифру от 0 до 100");
        Scanner scan = new Scanner(System.in);
    //    Scanner line = new Scanner(System.in);
        int cufra;
        int q = (int) (Math.random() * 2);
        int count = 0;
        boolean w = true;


        while (w) {
            System.out.println("Введите цифру:");
            try {
                cufra = scan.nextInt();
            } catch (Exception ex1) {
                System.out.println("Это не цифра");
                return;
            }
            count++;
            if (cufra<0){
                System.out.println("Ваша цифра с знаком минус. Мое загаданное цисло от 0 до 100");
            } else
            if (cufra > q) {
                System.out.println("Твоя цифра больше моей");
            }
            if (cufra < q&& cufra >=0) {
                System.out.println("Твоя цифра меньше моей");
            }
            if (cufra == q) {
                w=false;
                System.out.println("Красавчик. Ты выиграл!\nКоличество твоих попыток="+count);
            }
            if(w){
                System.out.println("Хотите продолжать?\nВведите символ 'y' - хочу или 'n' - остановить ");
                String ln;
                ln = scan.next();
                if (ln.equals("n")){
                    w=false;
                    System.out.println("Програма остановлена");
                } else
                if (!ln.equals("y")){
                   System.out.println("ошибка ввода знака");
                  return;
            }
            }

        }
        }
    }
