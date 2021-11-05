package com.pb.susoev.hw6;

public class Horse extends Animal{

    public Horse(String nameAnimal, String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation(location);
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" брр-гав");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" кушает "+ getFood());
    }

}
