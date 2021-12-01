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

    public void testStack() {
        dt.testStack();
    }

    public void testQueue() {
        dt.testQueue();
    }

    public void testTreeMap() {
        dt.testTreeMap();
    }
}
