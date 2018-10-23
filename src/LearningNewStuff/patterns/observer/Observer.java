package LearningNewStuff.patterns.observer;

// обсервер реализуетс всеми наблюдателями, таким образом они все обязаны реализовать метод update()
public interface Observer {
    public void update(float temperature, float humidity, float presure);
}
