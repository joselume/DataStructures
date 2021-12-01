package com.example.dataStructures.imp;

import com.example.dataStructures.DataStructure;
import com.example.dataStructures.model.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataStructureImp1 implements DataStructure {
    @Override
    public Map<String, Long> testHashMap(List<String> names) {

        // OOP
/*        Map<String, Long> map = new HashMap<>();
        for (String name :
                names) {
            if(!map.containsKey(name)){
                map.put(name, 1L);
            } else {
                map.put(name, map.get(name) + 1L);
            }
        }*/


        // Functional
        Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println("Entry key: "+entry.getKey() + " Entry value: " + entry.getValue());
        }
        return map;
    }

    @Override
    public Set<Student> testHashSet(List<Student> students) {

        Set<Student> set = new HashSet<>();
        for (Student student:
                students) {
            set.add(student);
        }

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); ;
        }
        return set;
    }

    @Override
    public void testStack() {
        System.out.println();
        System.out.println("TestStack");
        Stack<String> stack = new Stack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        while(stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    @Override
    public void testQueue() {
        System.out.println();
        System.out.println("testQueue");

        Queue<String> queue = new PriorityQueue<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        while(queue.size()> 0) {
            System.out.println(queue.poll());
        }
    }

    @Override
    public void testTreeMap() {
        System.out.println();
        System.out.println("testTreeMap");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(7, "Seven");
        treeMap.put(4, "Four");
        treeMap.put(8, "Eight");
        treeMap.put(1, "One");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }
    }
}
