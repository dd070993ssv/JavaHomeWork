package com.pb.susoev.hw5;

import java.util.Date;

public class Reader {
    private String FIO;
    private int readernumber;
    private String fakultet;
    private Date date;
    private int phone;

    public Reader(String FIO) {
        this.FIO = FIO;
    }
    public void takeBook(Integer count){
        System.out.println( FIO +" взял:"+count+" книги"); ;
    }
    public void takeBook(String... namebooks) {
        System.out.print( FIO +" взял книги :"); ;
            for (String namebook : namebooks) {
                System.out.print(namebook+",");
            }

        }
}
