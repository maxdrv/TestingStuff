package LearningNewStuff.patterns.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "Dark roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
