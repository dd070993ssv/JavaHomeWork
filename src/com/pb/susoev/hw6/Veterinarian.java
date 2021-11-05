package com.pb.susoev.hw6;

import com.pb.susoev.hw5.Book;

public class Veterinarian {
    public Veterinarian() {
    }

    public void treatAnimal (Animal  animal){
        System.out.print(animal.getNameAnimal() + " "+animal.getFood());
        animal.makeNoise();
     }
    }

