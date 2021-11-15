package com.pb.susoev.hw7;

public class Skirt extends Clothes  implements WomenClothes {
    public Skirt(Size size,Integer cost, String colour) {
        super.size= size;
        super.cost= cost;
        super.colour= colour;

    }

    @Override
    public String dressWomen() {
        return ("Skirt :size "+super.size.getEuroSize()+" "+super.size.getDescription()+" "+ "cost "+ super.cost+" "+"colour "+super.colour);
    }
}
