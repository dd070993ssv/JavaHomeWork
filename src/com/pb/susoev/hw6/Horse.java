package com.pb.susoev.hw6;

import java.util.Objects;

public class Horse extends Animal{

    public Horse(String nameAnimal, String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation("живет "+location);
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" делает брр-гав");
    }
    @Override
    public void sleep(){
        System.out.println(getNameAnimal()+" спит");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" кушает "+ getFood());
    }
    @Override
    public String toString() {
        return getNameAnimal() + "не делает ничего";
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}


}
