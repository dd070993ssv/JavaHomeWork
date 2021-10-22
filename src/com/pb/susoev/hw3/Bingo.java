package com.pb.susoev.hw3;

import java.text.Format;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Игра началась!!!\nОтгадай число, вводя свою цифру от 0 до 100");
        Scanner scan = new Scanner(System.in);
        //    Scanner line = new Scanner(System.in);
        String cr;
        int cufra;
        int q = (int) (Math.random() * 101);
        int count = 0;
        boolean w = true;


        while (w) {
            System.out.println("Введите цифру:");
            try {
                cr = scan.next();
                cufra = Integer.parseInt(cr.trim());
                System.out.println(cufra);
            } catch (Exception ex1) {
                System.out.println("Это не цифра");
                continue;
            }
            count++;
            if (cufra < 0) {
                System.out.println("Ваша цифра с знаком минус. Мое загаданное цисло от 0 до 100");
            } else if (cufra > q) {
                System.out.println("Твоя цифра больше моей");
            }
            if (cufra < q && cufra >= 0) {
                System.out.println("Твоя цифра меньше моей");
            }
            if (cufra == q) {
                w = false;
                System.out.println("Красавчик. Ты выиграл!\nКоличество твоих попыток=" + count);
            }
            if (w) {
                    System.out.println("Если хотите продолжать нажмите любую клавишу\nВведите символ 'n' - если хотите остановить!");
                    String ln;
                    ln = scan.next();
                    if (ln.equals("n")) {
                        w = false;
                        System.out.println("Програма остановлена");
                    }
          //              continue;
                    }

            }

        }

    }


