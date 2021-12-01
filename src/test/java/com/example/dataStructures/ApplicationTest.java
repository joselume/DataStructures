package com.example.dataStructures;


import com.example.dataStructures.model.Student;
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ApplicationTest {
    private Application app = new Application();

    @Test
    public void testCountRepeatedNamesUsingHashMap(){
        // Logic: find repeated names using hashmap

        // Arrange
        List<String> names = Arrays.asList("jose", "luis", "jorge", "jose", "jose", "jose");

        // Act
        Map<String, Long> map = app.testHashMap(names);

        // Assert
        assertTrue(map.containsKey("jose"));
        assertEquals(Long.valueOf(4L), Long.valueOf(map.get("jose")));
    }

    @Test
    public void testEliminateDuplicatesUsingHashMap(){
        // Logic: find repeated names using hashmap

        // Arrange
        List<Student> students = Arrays.asList(
                new Student(1, "Jose Luis"),
                new Student (1, "Jorge Luis"),
                new Student (2, "Mary"),
                new Student (3, "Luisa")
        );

        // Act
        Set<Student> set = app.testHashSet(students);

        // Assert
        assertEquals(Integer.valueOf(3), Integer.valueOf(set.size()));
    }

    @Test
    public void testLastInputIsFirstOutput(){
        // Logic: find repeated names using hashmap

        // Arrange
        List<Student> students = Arrays.asList(
                new Student(1, "Jose Luis"),
                new Student (1, "Jorge Luis"),
                new Student (2, "Mary"),
                new Student (3, "Luisa")
        );

        // Act
        Student peakStudent = app.testStack(students);

        // Assert
        assertEquals(new Student(3, "Luisa"), peakStudent);
    }

    @Test
    public void testQueueFirstInputIsFirstOutput(){
        // Logic: find repeated names using hashmap

        // Arrange
        List<Student> students = Arrays.asList(
                new Student (2, "Mary"),
                new Student(1, "Jose Luis"),
                new Student (1, "Jorge Luis"),
                new Student (3, "Luisa")
        );

        // Act
        Student peakStudent = app.testQueue(students);

        // Assert
        assertEquals(new Student(1, "Jose Luis"), peakStudent);
    }

    @Test
    public void testTreeSetStoreUsingNaturalOrder(){
        // Logic: find repeated names using hashmap

        // Arrange
        List<Student> students = Arrays.asList(
                new Student (3, "Luisa"),
                new Student (2, "Mary"),
                new Student(1, "Jose Luis"),
                new Student (1, "Jorge Luis")
        );

        // Act
        Map<Student, Integer> sortedStudents = app.testTreeMap(students);

        // Assert
        assertEquals("{Student{id=1, name='Jose Luis'}=1, Student{id=2, name='Mary'}=2, Student{id=3, name='Luisa'}=3}", sortedStudents.toString());
    }




}
