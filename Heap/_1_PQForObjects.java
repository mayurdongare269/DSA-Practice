import java.util.*;
import java.util.PriorityQueue;

public class _1_PQForObjects {

    static class Student implements Comparable<Student> { // overriding
        String name;
        int rank;

        Student(String n, int r) {
            name = n;
            rank = r;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 5));// O(logn)
        pq.add(new Student("B", 4));
        pq.add(new Student("C", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // o(logn)
            pq.remove();
        }

    }
}
