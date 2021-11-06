package com.pb.susoev.hw6;


import java.util.Objects;

public class Dog extends Animal{
//String nameAnimal;

    public Dog(String nameAnimal,String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation("живет "+location);
    }

    public Dog() {
        super();
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" делаеет гав-гав");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" кушает "+ getFood());
    }
    @Override
    public String toString() {
        return getNameAnimal() + " прыгает";
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}

}
