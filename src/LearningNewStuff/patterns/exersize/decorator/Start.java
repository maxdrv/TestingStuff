package LearningNewStuff.patterns.exersize.decorator;

public class Start {

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        darkRoast.setMocha(true);
        System.out.println(darkRoast.cost());
    }
}
