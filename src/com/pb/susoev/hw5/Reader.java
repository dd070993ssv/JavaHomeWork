package com.pb.susoev.hw5;

import java.util.Date;

public class Reader {
    private String FIO;
    private int readernumber;
    private String fakultet;
    private Date date;
    private int phone;

    public Reader() {

    }

    public Reader(String FIO, int readernumber, String fakultet, Date date, int phone) {
        this.FIO = FIO;
        this.readernumber = readernumber;
        this.fakultet = fakultet;
        this.date = date;
        this.phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getReadernumber() {
        return readernumber;
    }

    public void setReadernumber(int readernumber) {
        this.readernumber = readernumber;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void takeBook(Integer count){
        System.out.println("\n"+ FIO +" взял:"+count+" книги"); ;
    }
   public void takeBook(String... namebooks) {
        System.out.print( this.FIO +" взял книги :"); ;
            for (String namebook : namebooks) {
                System.out.print(namebook+",");
            }
       System.out.println();
    }
    public void takeBook(Book... namebooks) {
        System.out.print( this.FIO +" взял книги :"); ;
            for ( Book book : namebooks) {
                System.out.print(book.getNamebook()+"( "+ book.getNameaftor()+" " + book.getYaer()+"),");
            }
        System.out.println();
    }
    public void returnBook(Integer count){
        System.out.println( FIO +" вернул:"+count+" книги"); ;
    }
    public void returnBook(String... namebooks) {
        System.out.print( this.FIO +" вернул книги :"); ;
        for (String namebook : namebooks) {
            System.out.print(namebook+",");
        }
        System.out.println("");
    }
    public void returnBook(Book... namebooks) {
        System.out.print( this.FIO +" вернул книги :"); ;
        for ( Book book : namebooks) {
            System.out.print(book.getNamebook()+"( "+ book.getNameaftor()+" " + book.getYaer()+"),");
        }
    }

  }

