package LearningNewStuff.patterns.exersize.decorator;

public class DarkRoast extends Beverage{



    public DarkRoast() {
        this.description = "Most excelent dark roast";
    }

    public double cost() {

        return IngredientsCost.DARKROAST.getCost() + super.cost();
    }
}
