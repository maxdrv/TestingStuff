package LearningNewStuff.patterns.decorator;

public class Decaf extends Beverage{

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
