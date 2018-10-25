package LearningNewStuff.patterns.factory;

import LearningNewStuff.patterns.factory.pizzatype.*;

public class KaliforniaStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new KaliforniaStylePepperoniPizza();
        } else if (type.equals("pepperoni")) {
            return new KaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new KaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new KaliforniaStyleVeggiePizza();
        } else return null;
    }
}
