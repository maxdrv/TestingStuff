package LearningNewStuff.patterns.exersize.decorator;

public class Beverage {

    String description = "";

    Boolean milk = false;
    Boolean soy = false;
    Boolean mocha = false;
    Boolean whip = false;

    public double cost() {
        double cost = 0;
        if (getMilk()) {
            cost += IngredientsCost.MILK.getCost();
        }
        if (getMocha()) {
            cost += IngredientsCost.MOCHA.getCost();
        }
        if (getWhip()) {
            cost += IngredientsCost.WHIP.getCost();
        }
        if (getSoy()) {
            cost += IngredientsCost.SOY.getCost();
        }
        return cost;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }

    public Boolean getMilk() {
        return milk;
    }

    public Boolean getSoy() {
        return soy;
    }

    public Boolean getMocha() {
        return mocha;
    }

    public Boolean getWhip() {
        return whip;
    }
}
