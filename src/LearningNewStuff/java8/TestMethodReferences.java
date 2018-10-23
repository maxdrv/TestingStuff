package LearningNewStuff.java8;

import java.util.stream.Stream;

public class TestMethodReferences {
    public static void main(String[] args) {

        //
        Stream.of("one", "two").map(x -> x.toUpperCase());
        Stream.of("one", "two").map(String::toUpperCase);


        // ссылка на метод
        Stream.of(new Student("Mike"), new Student("Max")).map(Student::getName).forEach(System.out::println);
        Stream.of("Jonh", "Andy").map(Student::new).forEach(x -> System.out.println(x.getName()));
    }
}

class Student{
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
