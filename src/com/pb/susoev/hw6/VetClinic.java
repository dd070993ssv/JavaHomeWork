package com.pb.susoev.hw6;



public class VetClinic {
    public static void main(String[] args) {
      Animal [] animals = {new Dog("Пес","кость","дома"),
              new Cat("Кот","мясо","на мусорке"),
              new Horse("Лошадь","сено","в плугу"),
              new Animal("кролик","сено","в клетке")};

     Veterinarian veterinarian = new Veterinarian();
        for(Animal a:animals){
            veterinarian.treatAnimal(a);
        }


         }

    //new Animal("horse","сено")};
    // Animal [] animals= new Animal[1];
    //  Dog dog = new Dog("dog");
    //  Dog dog = new Dog("dog");
    //dog.setFood("кость");
    ///animals[0]=dog;

    }




