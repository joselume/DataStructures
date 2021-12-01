package com.example.dataStructures;

import com.example.dataStructures.imp.DataStructureImp1;
import com.example.dataStructures.model.Student;

import java.util.*;

public class Application {
    private DataStructure dt = new DataStructureImp1();

    public Map<String, Long> testHashMap(List<String> names) {
        return dt.testHashMap(names);
    }

    public Set<Student> testHashSet(List<Student> students) {
        return dt.testHashSet(students);
    }

    public Student testStack(List<Student> students) {
        return dt.testStack(students);
    }

    public Student testQueue(List<Student> students) {
        return dt.testQueue(students);
    }

    public Map<Student, Integer> testTreeMap(List<Student> students) {
        return dt.testTreeMap(students);
    }
}
