package LearningNewStuff.Collections;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionList {
    public static void main(String[] args) {

        // List это Interface, он просто добавляет ряд методов, ничего более
        // лист итерируется по индексу

        System.out.println("|------ArrayList-------|");
        // Обычный список
        List<String> arrayList = new ArrayList<>();


        System.out.println("|------LinkedList------|");
        // Здесь используются Node, которые содержат ссылки на след элемент и на предыдущий, и так они по цепочке соединены
        List<String> linkedList = new LinkedList<>();


        System.out.println("|------Vector----------|");
        // То же что и ArrayList, но все методы synchronized, и capacity х2,а не x1.5, что делает Vector медленнее, но потокобезопасным
        List<String> vector = new Vector<>();

        System.out.println("|------Stack-----------|");
        // extend Vector, FILO - первым вошел, последним вышел
        List<String> stack = new Stack<>();

        System.out.println("|---synchronizedList---|");
        // такой подход можно использовать для потокобезопасных решений
        // возвращет обертку ArrayList, все теже самые методы, что и обычного ArrayList.
        // Но при этом они оборачиваются в синхронизированную обертку
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());


        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");
        // modify then iterate
        // Нельзя изменять лист во время итерации, он выкенет эксепшен
        /*for (String s : arrayList) {
            System.out.print(s + " ");
            arrayList.remove(0);  // ConcurrentModificationException
        }*/

        // sort, соотеветственно если мы сортируем объекты они должны быть Comparable
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        Collections.sort(arrayList);
        for (String s : arrayList) {
            System.out.print(s + " ");
        }

        // binary search
        // поиск по бинарной коллекции может быть только по отсортированной
        System.out.println("\n" + arrayList.get(Collections.binarySearch(arrayList, "B")));

        // to Array and back  // Array may be faster then List, but not sure about that
        String[] str = new String[arrayList.size()];
        str = arrayList.toArray(str);
        System.out.println(str[0]);

        List<String> stringList = Arrays.asList(str);
        System.out.println(stringList.get(0));

        // toString()
//        System.out.println(arrayList.toString());

        // equals
        System.out.println(arrayList.equals(stringList));

        // Vector vs synchronized ArrayList
        // synchronization is just a wraper, т.е если у нас есть готовая колекция то проще обернуть её в synchronizedList
        // Vector же будет копировать колекцию себе
        // synchronizedList будет проходить быстрее по коллекции, потому что Vector lock next


    }
}
