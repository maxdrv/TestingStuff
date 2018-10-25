package LearningNewStuff.patterns.exersize.decorator;

public enum IngredientsCost {
    MILK(20), MOCHA(15), SOY(30), WHIP(20), DARKROAST(120);

    double cost;

    IngredientsCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
