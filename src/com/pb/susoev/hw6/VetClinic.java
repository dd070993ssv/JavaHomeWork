package com.pb.susoev.hw6;



public class VetClinic {
    public static void main(String[] args) {
      Animal [] animals = {new Dog("dog","кость","дома"),
              new Cat("cat","мясо","мусорка"),
              new Horse("horse","сено","в плугу")};
              //new Animal("horse","сено")};

        // Animal [] animals= new Animal[1];
       //  Dog dog = new Dog("dog");
      //  Dog dog = new Dog("dog");
         //dog.setFood("кость");
         ///animals[0]=dog;


     Veterinarian veterinarian = new Veterinarian();
        for(Animal a:animals){
       //     System.out.println(a.getFood());
            veterinarian.treatAnimal(a);
        }


         }

    //Animal Dog= new Dog("Dog");
    //Dog.makeNoise();


        //String [] names = new String[animal.length];
        //  for (int i = 0; i< animal.length; i++){
        //      names[i]=animal[i].getName();
        //  }
    }




