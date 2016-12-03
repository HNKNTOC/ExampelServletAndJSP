package ru.kamyshenko.model;

import org.junit.Test;
import ru.kamyshenko.model.beer.BeerBrand;
import ru.kamyshenko.model.beer.BeerExpert;
import ru.kamyshenko.model.beer.BeerColor;

import java.util.List;

import static org.junit.Assert.*;


public class BeerExpertTest {
    @Test
    public void selectAmberBeerByColor() throws Exception {
        BeerExpert expert = new BeerExpert();
        List<BeerBrand> strings = expert.selectByColor(BeerColor.Amber);

        assertTrue(strings.size() == 2);
        assertTrue(strings.contains(BeerBrand.JackAmber));
        assertTrue(strings.contains(BeerBrand.RedMoose));
    }

    @Test
    public void selectNotAmberBeerByColor() throws Exception {
        BeerExpert expert = new BeerExpert();
        List<BeerBrand> strings = expert.selectByColor(BeerColor.Brown);

        assertTrue(strings.size() == 2);
        assertTrue(strings.contains(BeerBrand.GoutStout));
        assertTrue(strings.contains(BeerBrand.JailPaleAle));
    }
}