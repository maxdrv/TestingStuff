package LearningNewStuff.Collections;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {

        // collection это набор элементов
        Collection<String> collection;

        // List implement Collection
        // у листов есть индексы, т.е они позволяют доставать информацию по индексам
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("one");
        System.out.println(list.size());

        // Set implement Collection
        // не допускают дублирования элементов
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        System.out.println(set.size());

        // Queue implement Collection
        // можно добавлять элементы в конец очередь и извлекать из начала, FIFO - первым вошел, первым вышел
        System.out.println("|------QUEUE------|");
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("tree");
        System.out.println(queue.element()); // element() выводит первый элемент очереди
        System.out.println(queue.poll());   // извлекает элемент и удаляет его
        System.out.println(queue.size());    // соответственно сейчас значение 2
        System.out.println(queue.offer("newOne")); // засовывает элемен в конец очереди


        // Map это по сути словарь, одному ключю соответствует значение,
        // одинаковых клоючей не может быть, а вот несколько ключей ссылаются на одно Value это нормально
        // Map это отдельный интерфейс который не имплементирует Collection
        System.out.println("|------QUEUE------|");

        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.remove("1");
        System.out.println(map.get("2"));
    }
}
