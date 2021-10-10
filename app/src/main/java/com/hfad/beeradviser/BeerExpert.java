package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String drinkType){
        System.out.println(drinkType);
        ArrayList<String> Brands = new ArrayList<>();
        if(drinkType.equals("milk")){
            Brands.add("Jack");
            Brands.add("Rose");
        }else {
            Brands.add("Json");
            Brands.add("White");
        }
        return Brands;
    }
}
