package miu.edu.cs.cs425.eregistrarwebapi.dataGenerator;

import miu.edu.cs.cs425.eregistrarwebapi.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentGenerator {

        private static final Random rand = new Random();

        private static final String[] FIRST_NAMES = {"Lynn", "Jack", "Oliver", "Emma", "Noah", "Sophia"};
        private static final String[] LAST_NAMES = {"Doe", "Smith", "Johnson", "Brown", "Taylor", "Lee"};

        public static void main(String[] args) {
            List<Student> students = createStudents(50);
            // Print or use students here
        }

        public static List<Student> createStudents(int numStudents) {
            List<Student> students = new ArrayList<>();
            for(int i = 0; i < numStudents; i++) {
                String id = String.valueOf(111 + i);
                String firstName = FIRST_NAMES[rand.nextInt(FIRST_NAMES.length)];
                String middleName = "Jane"; // I assumed you want "Jane" to be the constant middle name for all students
                String lastName = LAST_NAMES[rand.nextInt(LAST_NAMES.length)];
                double gpa = Math.round((2.0 + 2.0 * rand.nextDouble()) * 100.0) / 100.0;
                LocalDate date = LocalDate.of(2019, 5, rand.nextInt(31) + 1);
                String lastParam = rand.nextBoolean() ? "Yes" : "No";
                students.add(new Student(id, firstName, middleName, lastName, gpa, date, lastParam));
            }
            return students;
        }
    }


