package com.pb.susoev.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[]  clothes ={
                new Pants(Size.S,1115,"red"),
                new Skirt(Size.L,2222,"green"),
                new Tie(Size.XS,333,"blue"),
                new Tshirt(Size.XXS,444,"black"),
                new Skirt(Size.M,555,"red"),
        };
        dressMan(clothes);
        dressWomen(clothes);
    }

    private  static void dressMan(Clothes[]  clothes){
        for(int i =0 ;i< clothes.length;i++){
            if(clothes[i] instanceof ManClothes){
                System.out.println("ManClothes "+  ((ManClothes) clothes[i]).dressMan());
            }
        }
    }

    private  static void dressWomen(Clothes[] clothes){
        for(int i =0 ;i< clothes.length;i++){
            if(clothes[i] instanceof WomenClothes){
                System.out.println("WomenClothes "+  ((WomenClothes) clothes[i]).dressWomen());
            }
        }
    }
}
