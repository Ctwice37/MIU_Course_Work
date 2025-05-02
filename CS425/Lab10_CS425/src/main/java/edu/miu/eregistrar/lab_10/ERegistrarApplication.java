package edu.miu.eregistrar.lab_10;

import edu.miu.eregistrar.lab_10.Model.Student;
import edu.miu.eregistrar.lab_10.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ERegistrarApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(ERegistrarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student(null, "11111111", "Lynn", "Smith", "Mary", 4.4, LocalDate.of(1950, 10, 1), "Yes");

        studentService.saveStudent(student1);
    }
}
