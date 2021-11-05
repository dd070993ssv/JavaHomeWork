package com.pb.susoev.hw6;

public class Cat extends Animal{

    public Cat(String nameAnimal, String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation(location);
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+"мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" кушает "+ getFood());
    }
}
