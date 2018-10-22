package LearningNewStuff.patterns.strategy;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< SILENCE >>");
    }
}
