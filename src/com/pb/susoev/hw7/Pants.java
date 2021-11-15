package com.pb.susoev.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {
    public Pants(Size size,Integer cost, String colour) {
        super.size= size;
        super.cost= cost;
        super.colour= colour;

    }
    @Override
    public String dressMan() {
       return ("Pants :size "+super.size.getEuroSize()+" "+super.size.getDescription()+" "+ "cost "+ super.cost+" "+"colour "+super.colour);
    }
    @Override
    public String dressWomen() {
        return ("Pants :size "+super.size.getEuroSize()+" "+super.size.getDescription()+" "+ "cost "+ super.cost+" "+"colour "+super.colour);

    }
}
