package com.pb.susoev.hw7;

public class Tshirt extends Clothes  implements ManClothes,WomenClothes {
    public Tshirt(Size size,Integer cost, String colour) {
        super.size= size;
        super.cost= cost;
        super.colour= colour;

    }
    @Override
    public String dressMan() {

        return("Tshirt :size "+super.size.getEuroSize()+" "+super.size.getDescription()+" "+ "cost "+ super.cost+" "+"colour "+super.colour);
    }

    @Override
    public String dressWomen() {
        return("Tshirt :size "+super.size.getEuroSize()+" "+super.size.getDescription()+" "+ "cost "+ super.cost+" "+"colour "+super.colour);

    }
}
