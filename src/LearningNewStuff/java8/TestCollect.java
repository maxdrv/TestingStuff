package LearningNewStuff.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class TestCollect {
    public static void main(String[] args) {

        Stream.of("one", "two").collect(toList());  // нет указания какой конкретно List
        // указание того, что конкретно создать
        Stream.of("one", "two").collect(Collectors.toCollection(ArrayList::new));
        Stream.of("one", "two").collect(Collectors.toCollection(TreeSet::new));

        Stream.of("one", "two").collect(Collectors.maxBy(Comparator.comparing(x -> x)));
        Stream.of(1, 2, 3, 4, 5).collect(Collectors.averagingInt(x -> x));

        Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4).collect(Collectors.partitioningBy(x -> x > 2));

        Map<Integer, List<Integer>> map2 = Stream.of(1, 2, 3, 4).collect(Collectors.groupingBy(x -> x));

        String result = Stream.of("one", "two", "three").collect(Collectors.joining(",", "{", "}"));
        System.out.println(result);

        Map<Integer, Long> map3 = Stream.of(1, 2, 1, 4).collect(Collectors.groupingBy(x -> x, counting()));
        System.out.println(map3.get(1));
    }
}
