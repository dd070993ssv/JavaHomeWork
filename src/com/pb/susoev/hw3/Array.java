package com.pb.susoev.hw3;
//import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int[] array2 = array;
        int sum = 0;
        int count=0;
        boolean w = true;
        String mas ;
//ввод масива
     /*   for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }*/
        while (w) {
            System.out.println("Введите масив с целых чисел:");
            try {
                for (int i = 0; i < array.length; i++) {
                    mas = input.next();
                    array[i] = Integer.parseInt(mas.trim());
                   w=false;}
            } catch (Exception ex1) {
                System.out.println("Неверно введенный масив");
                continue;
            }}
//вывод первого масива
        System.out.print ("Введенный масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.print ("\n");

        int sort;
        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j + 1]) {
                    sort = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = sort;
                }
            }
        }
//вывод второго масива
        System.out.print ("Отсортированый масив:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print (" " + array2[i]);
        }
        System.out.print ("\n");

        //сумма первого масива
        for (int i = 0; i < array.length; i++) {
           sum=sum+array[i];
           if (array[i]>0) count++;
        }
        System.out.print ("Сумма всех элементов: "+sum+"\n");
        System.out.print ("Количество положительных элементов: "+count+"\n");
        }
    }
