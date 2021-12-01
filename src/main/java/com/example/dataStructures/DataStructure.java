package com.example.dataStructures;

import com.example.dataStructures.model.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DataStructure {
    Map<String, Long> testHashMap(List<String> names);
    Set<Student> testHashSet(List<Student> students);
    Student testStack(List<Student> students);
    Student testQueue (List<Student> students);
    Map<Student, Integer> testTreeMap(List<Student> students);
    // Sorted structure
}
