package LearningNewStuff.patterns.decorator;

public class Espresso extends Beverage{

    public Espresso() {
        this.description = "Espreso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
