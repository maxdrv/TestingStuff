package LearningNewStuff.Collections;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class CollectionsQueue {
    public static void main(String[] args) {

        Queue<String> linkedList = new LinkedList<>();      // LinkedList лучше в случае если надо часто удалять
        Deque<String> linkedDeque = new LinkedList<>();
        Deque<String> arrayDeque = new ArrayDeque<>();   // чаще всего используется ArrayDeque, Array много лучше linkedList
                                                        //
        Queue<String> priorityQueue = new PriorityQueue<>(); // позволяет получить в отсортированном порядке

        // блокирующие очереди работают в многопоточном программировании
        //
        Queue<String> blockingQueue = new LinkedBlockingQueue<>();

        arrayDeque.add("a");
        arrayDeque.add("c");
        arrayDeque.add("b");

        for (String s : arrayDeque) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        priorityQueue.add("b");
        priorityQueue.add("a");
        priorityQueue.add("c");

        for (String s : priorityQueue) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        while (priorityQueue.size() != 0) {
            System.out.print(priorityQueue.remove() + " ");
        }


    }
}
