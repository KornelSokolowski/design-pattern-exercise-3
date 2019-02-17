package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
//        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
//        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));
//        FungiDewaliPizza fungiDewaliPizza = new FungiDewaliPizza(34.99, Arrays.asList("mashrooms"));

        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza hawaiPizza=pizzaFactory.create(PizzaType.HAWAI, 12.00, Arrays.asList("aaaa"));

        hawaiPizza.showPizzaInfo();




    }

}
