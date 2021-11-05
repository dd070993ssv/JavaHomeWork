package com.pb.susoev.hw6;

import com.pb.susoev.hw5.Book;
import javafx.scene.AmbientLight;

public class Dog extends Animal{
String nameAnimal;

    @Override
    public String getNameAnimal() {
        return nameAnimal;
    }

    @Override
    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public Dog(String nameAnimal,String food) {
        this.nameAnimal=nameAnimal;
        super.setFood(food);
    }

    public Dog() {
        super();
    }


//ublic Dog (String nameAnimal){
   //  this.nameAnimal=nameAnimal;
//}

    public void makeNoise() {
        System.out.println(" гав-гав");
    }
}
