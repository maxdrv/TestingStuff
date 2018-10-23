package LearningNewStuff.patterns.observer;

public interface Subject {

    // Оба метода получают в аргументе реализацию Observer
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // этот метод вызывается для оповещения наблюдателей при изменении состояния субъекта
    public void notifyObservers();

}

