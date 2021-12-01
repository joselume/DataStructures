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

        System.out.println("---------- test testHashMap --------------");
        for(Map.Entry<String, Long> entry: map.entrySet()){
            System.out.println(String.format("Entry key: %s Entry value: %s", entry.getKey(), entry.getValue()) );
        }


/*        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println("Entry key: "+entry.getKey() + " Entry value: " + entry.getValue());
        }*/
        return map;
    }

    @Override
    public Set<Student> testHashSet(List<Student> students) {

        Set<Student> set = new HashSet<>();
        for (Student student:
                students) {
            set.add(student);
        }
        System.out.println("---------- test HashSet --------------");
        set.stream().forEach(System.out::println);

/*        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); ;
        }*/
        return set;
    }

    @Override
    public Student testStack(List<Student> students) {

        Stack<Student> stack = new Stack<>();
        for (Student student :
                students) {
            stack.push(student);
        }

/*        while(stack.size() > 0) {
            System.out.println(stack.pop());
        }*/
        return stack.pop();
    }

    @Override
    public Student testQueue(List<Student> students) {
        System.out.println();
        System.out.println("testQueue");

        Queue<Student> queue = new PriorityQueue<>();
        for (Student student :
                students) {
            queue.add(student);
        }


/*        while(queue.size()> 0) {
            System.out.println(queue.poll());
        }*/
        return queue.poll();
    }

    @Override
    public Map<Student, Integer>  testTreeMap(List<Student> students) {
        System.out.println();
        System.out.println("------------------------ testTreeMap ------------------------");

        TreeMap<Student, Integer> treeMap = new TreeMap<>();
        for (Student student :
                students) {
            treeMap.put(student, student.getId());
        }

        for (Map.Entry<Student, Integer> entry :
                treeMap.entrySet()) {
            System.out.println(String.format("Key: %s, Value: %s", entry.getKey(), entry.getValue()));
        }


/*        for (Map.Entry<Student, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }*/
        return treeMap;
    }
}
