import lombok.*;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;


public class LombokTest {

    @Data
    class Student {
        public String name;
        
        public int age;
    }

    @Test
    public void dataTest() {
        Student student = new Student();
        student.getName();
        student.setName("student");
        student.toString();
        student.equals(new Student());
        student.hashCode();
    }

    @AllArgsConstructor
    @NoArgsConstructor
    class Teacher {
        public String name;

        public int age;
    }

    @Test
    public void constructorTest() {
        Teacher teacher = new Teacher("teacher", 29);
        Teacher student1 = new Teacher();
    }

    @Data
    @RequiredArgsConstructor
    class School {
        @NonNull
        public String name;

        public final String school;

        public int size;
    }

    @Test
    public void requiredArgsConstructorTest() {
        School school = new School("CQU","ChongQing");
        assertEquals("CQU", school.getName());
        assertEquals("ChongQing", school.getSchool());
    }

    @Test(expected = NullPointerException.class)
    public void nonNullTest() {
        School school = new School("CQU","ChongQing");
        school.setName(null);
    }
    
    @Test(expected = FileNotFoundException.class)
    public void cleanUpTest() throws IOException {
        // The following three forms are equal

        // Form 1
        @Cleanup BufferedReader reader1 = new BufferedReader(new FileReader("input.txt"));
        @Cleanup BufferedWriter writer1 = new BufferedWriter(new FileWriter("output.txt"));
        // ......

        // Form 2
        try (BufferedReader reader2 = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("output.txt"))) {
            // ......
        }

        // Form 3
        BufferedReader reader3 = null;
        BufferedWriter writer3 = null;
        try {
            reader3 = new BufferedReader(new FileReader("input.txt"));
            writer3 = new BufferedWriter(new FileWriter("output.txt"));
            // ......
        } finally {
            if (reader3 != null) {
                reader3.close();
            }
            if (writer3 != null) {
                writer3.close();
            }
        }
    }
}
