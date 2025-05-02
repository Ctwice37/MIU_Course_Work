package miu.edu.cs.cs425.eregistrarwebapi;

import miu.edu.cs.cs425.eregistrarwebapi.Service.StudentService;
import miu.edu.cs.cs425.eregistrarwebapi.dataGenerator.StudentGenerator;
import miu.edu.cs.cs425.eregistrarwebapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ERegistrarWebApiApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(ERegistrarWebApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		StudentGenerator generator = new StudentGenerator();

		generator.createStudents(15).forEach(studentService::registerNewStudent);



	}
}
