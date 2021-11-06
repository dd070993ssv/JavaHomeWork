package com.pb.susoev.hw6;

import java.util.Objects;

public class Cat extends Animal{

    public Cat(String nameAnimal, String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation("живет "+location);
    }
    @Override
    public void sleep(){
        System.out.println(getNameAnimal()+" не спит");
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" делаеет мяу-мяу");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" кушает "+ getFood());
    }
    @Override
    public String toString() {
        return getNameAnimal() + " где-то ходит";
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}

}
