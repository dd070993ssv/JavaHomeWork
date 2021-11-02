package com.pb.susoev.hw5;

import com.pb.susoev.hw3.Array;

import java.util.ArrayList;
import java.util.Date;

public class Library {
    public static void main(String[] args) {
        /*Класс Library используется как демонстрация работы классов Book и Reader.
Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
Выполняются такие действия:
- печатаются все книги.
- печатаются все читатели.
- демонстрируется работа всех вариантов методов takeBook() и returnBook().
*/
        Book [] books = {new Book("Приключения","Иванов И. И.","2000 г."),
                new Book("Словарь","Сидоров А. В.","1980 г."),
                new Book("Энциклопедия","Гусев К. В. ","2010 г.")
        };
        Reader [] readers = {new Reader("Петров В. В.",0,"dtpt",new Date(System.currentTimeMillis()),0352222),
                new Reader("Макарон С. А.",1,"dmpt",new Date(System.currentTimeMillis()),85916516),
                new Reader("Повар М. В.",2,"drpt",new Date(System.currentTimeMillis()),54654545)
        };
//
        System.out.println("Все книги :");
        for (Book b:books){
            System.out.println(b.getNamebook()+" - "+b.getNameaftor()+" "+b.getYaer() + ",");
        }
        System.out.println("Все читатели :");
        for (Reader r:readers){
            System.out.println(r.getFIO()+" "+r.getReadernumber()+" "+r.getFakultet() + " "+ r.getDate()+" "+r.getPhone()+",");
        }


        //создаем цикл, который переберает масив читателей
        for (Reader r:readers){
           //вызываем методы из экземпляра читателя, размерностью библиотеки
            r.takeBook(books.length);
            r.returnBook(books.length);
            //создаем масив размероностью библиотеки, для хранения имен книг
            String [] names = new String[books.length];
            //наполняем именами книг созданный масив
            for (int i=0; i< books.length; i++){
                names[i]=books[i].getNamebook();
        }
            //вызываем методы,подставляя колекции книг и имен
            r.takeBook(names);
            r.takeBook(books);
            r.returnBook(names);
            r.returnBook(books);

        }
       // Reader reader1 =new Reader ();
       // Reader reader2 =new Reader ();
      //  Book book = new Book();
       // book.setNameaftor("Иванов И. И.");
      //  book.setYaer("2000 г.");
      //  book.setNamebook("Приключения");
     //   Book book1 = new Book();
      //  book1.setNameaftor("Сидоров А. В.");
     //   book1.setYaer("1980 г.");
       // book1.setNamebook("Словарь");
        //reader1.setFIO("Петров В. В.");
       // reader2.setFIO("Иванов Б. В.");
      //  Reader reader2 =new Book("gfdh","fggg",2013);
     //   Reader reader3 =new Book("gffdsa","hjjjjjjjjjjjj",2022);
       // reader1.takeBook(3);
       // reader1.takeBook("Приключения","Словарь", "Энциклопедия");
       // reader1.takeBook(book,book1);

       // reader1.returnBook(3);
       // reader1.returnBook("Приключения","Словарь", "Энциклопедия");
       // reader1.returnBook(book,book1);



    }
}
