package LearningNewStuff.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class TestStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("five");
        list.add("four");
        list.add("three");

        // стрим один раз открывается и после окончания работы закрывается
        list.stream().forEach(x -> System.out.println(x));
        System.out.println("----------------------------------------------");
        // lazy and eager методы. Lazy методы сработают только если был вызван eager метод
        //
        list.stream().filter(x -> {
            System.out.println(x);
            return x.equals("one");
        }).count();
        System.out.println("----------------------------------------------");

        // метод collect, а в нем Collectors.toSet() так можно превратить коллекцию в другой вид коллекции
        list.stream().filter(x -> x.startsWith("f")).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
        System.out.println("-----------------------------------------------");

        // map превращает из одного объекта в другой
        list.stream().map(x -> x.toUpperCase());

        // flatMap   - объединяет несколько колекций в одну колекцию
        // Stream.of  -  способ объявление стрима
        Stream.of(asList("one", "two"), asList("three", "four")).flatMap(x -> x.stream()).map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
        System.out.println("------------------------------------------------");

        // min max
        int value = Stream.of(1,2).min(Comparator.comparing(x -> x)).get();
        int value2 = Stream.of(1,2).max(Comparator.comparing(x -> x)).get();
        System.out.println(value + " " + value2);

        // reduce
        int count = Stream.of(1, 2, 3, 4).reduce(0, (acc, element) -> acc + element);  // acc -акуумулятор и element -следующий элемент

        // sorted()       limit(100) первые сто элементов
        // distinct()         skip(1) пропустить значение

        // IntStream  summaryStatistics()
        Stream.of(1,2).mapToInt(x -> x).sum();
        IntStream intStream = Stream.of(1,2,3,4,5,6).mapToInt(x -> x);
        intStream.summaryStatistics().getAverage();
        intStream.summaryStatistics().getCount();
        intStream.summaryStatistics().getSum();      // и т.д.
    }
}
