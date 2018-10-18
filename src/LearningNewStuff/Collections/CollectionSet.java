package LearningNewStuff.Collections;

import java.util.*;

public class CollectionSet {
    public static void main(String[] args) {


        Set<String> hashSet = new HashSet<>();
        hashSet.add("one");     // добавили 3 одинаковых объекта
        hashSet.add("one");
        hashSet.add("one");
        System.out.println(hashSet.size());         // результат матода size() будет 1, т.к Set не поддерживает дубликаты
        hashSet.add(null);                          // во все сеты можно ложить null
        System.out.println(hashSet.contains(null));

        hashSet.clear();
        hashSet.add("one");                         // HashSet сохраняет все объекты в случайном порядке
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        for (String s : hashSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("one");                         // LinkedHashSet сохраняет все объекты в порядке добавления
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        for (String s : linkedHashSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n");


        Set<String> treeSet = new TreeSet<>();          // TreeSet это сортированый сет, и все элементы сортируются при добавлении
        treeSet.add("d");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("e");
        for (String s : treeSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // TreeSet это коллекция с сортировкой, что значит элементы которые туда добавлены должны имплементить Comparable

        Set<Student> treeSetStudent = new TreeSet<>();
        treeSetStudent.add(new Student(3));
        treeSetStudent.add(new Student(2));
        treeSetStudent.add(new Student(1));
        System.out.println(treeSetStudent.size() + "\n");
        for (Student student : treeSetStudent) {
            System.out.print(student.id + " ");
        }

        // можно так же передать компаратор в конструктор TreeSet
        /*
        Set<String> set = new TreeSet<String>(new Comparator<String>() {
            public boolean equals(Object obj) {

                return ;
            }
            public int compareTo(String one, String other) {

                return;
            }
        });
        */
    }

    static class Student implements Comparable{
        int id;

        public Student(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            return id - ((Student)o).id;
        }
    }
}
