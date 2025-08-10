

import java.util.Deque;
import java.util.LinkedList;

public class Practice{
    public static void main(String[] args){
        Deque<String> q = new LinkedList<>();
        q.add("Aadhithiya");
        q.add("AK");
        q.add("Chithiridha");
        q.add("Prateek");
        q.add("Bharath");
        q.add("Ronald");
        System.out.println(q.poll());
        q.addFirst("Bhoopathi");
        System.out.println(q);
        System.out.println(q.pollLast());
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.contains("Giri"));
    }
}