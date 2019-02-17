package pizza;

import java.util.List;

public class HawaiPizza extends Pizza {
    public HawaiPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.HAWAI);
    }
}
