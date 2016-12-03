package ru.kamyshenko.model.beer;

import java.util.ArrayList;
import java.util.List;

/**
 * Helps to choose a beer.
 */
public class BeerExpert {

    /**
     * Select Beer by BeerColor.
     * @param amber BeerColor beer.
     * @return Beer right color.
     */
    public List<BeerBrand> selectByColor(BeerColor amber) {
        ArrayList<BeerBrand> brands = new ArrayList<>();
        if(amber == BeerColor.Amber){
            brands.add(BeerBrand.JackAmber);
            brands.add(BeerBrand.RedMoose);
        }else {
            brands.add(BeerBrand.JailPaleAle);
            brands.add(BeerBrand.GoutStout);
        }
        return brands;
    }
}
