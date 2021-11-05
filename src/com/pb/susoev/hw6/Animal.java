package com.pb.susoev.hw6;

public class Animal {
    private String food ;
    private String location;
    private String nameAnimal;

    public Animal() {

    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
    public String getNameAnimal() {
        return this.nameAnimal;
    }



    public Animal(String nameAnimal) {
        //System.out.println(this.nameAnimal);
        this.nameAnimal = nameAnimal;

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

    public void makeNoise (){


    }

    public void eat() {

    }

    public void sleep (){
        System.out.println("Делает что то");
    }
}
