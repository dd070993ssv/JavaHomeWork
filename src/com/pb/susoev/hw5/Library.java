package com.pb.susoev.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 =new Reader ("Петров В. В.");
      //  Reader reader2 =new Book("gfdh","fggg",2013);
     //   Reader reader3 =new Book("gffdsa","hjjjjjjjjjjjj",2022);

 reader1.takeBook(3);
 reader1.takeBook("Приключения","Словарь", "Энциклопедия");

    }
}
