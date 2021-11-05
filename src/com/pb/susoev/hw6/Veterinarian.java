package com.pb.susoev.hw6;

import com.pb.susoev.hw5.Book;

public class Veterinarian {
    public Veterinarian() {
    }

    public void treatAnimal (Animal  animal){
       System.out.println(animal.getNameAnimal()+ " "+animal.getLocation());
        animal.makeNoise();
        animal.sleep();
        animal.eat();
        System.out.println(animal.toString());
        System.out.println("hashCode : " + animal.hashCode());

     }

    }

