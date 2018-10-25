package LearningNewStuff.patterns.factory.pizzatype;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "NA Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
