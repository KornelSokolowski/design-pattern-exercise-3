package pizza;

import java.util.List;

public class PizzaFactory {

public Pizza create(PizzaType pizzaType, double cost, List<String> components){
    if (pizzaType.equals(PizzaType.CAPRICIOSA)){
        return new CapriciosaPizza(cost,components);
    }else if (pizzaType.equals(PizzaType.FUNGIDEWALI))
        return new FungiDewaliPizza(cost,components);
    else if(pizzaType.equals(PizzaType.HAWAI))
        return new HawaiPizza(cost, components);
    else if(pizzaType.equals(PizzaType.MARGHERITA));
    return null;
}

}
