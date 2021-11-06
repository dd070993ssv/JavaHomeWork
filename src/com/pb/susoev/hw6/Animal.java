package com.pb.susoev.hw6;

import java.util.Objects;

public class Animal {
    private String nameAnimal;
    private String food ;
    private String location;


    public Animal() {

    }

    public Animal( String nameAnimal,String food, String location) {
        this.nameAnimal = nameAnimal;
        this.food = food;
        this.location = location;

    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
    public String getNameAnimal() {
        return this.nameAnimal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
            this.food = food;
        }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise (){}

    public void eat() {}

    public void sleep (){}

    public String toString() {
        return getNameAnimal() + " лежит";
    }

    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}

}
