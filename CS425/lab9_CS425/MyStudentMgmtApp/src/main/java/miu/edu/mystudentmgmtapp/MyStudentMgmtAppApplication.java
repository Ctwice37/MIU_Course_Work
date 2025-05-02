package miu.edu.mystudentmgmtapp;

import miu.edu.mystudentmgmtapp.model.Classroom;
import miu.edu.mystudentmgmtapp.model.Course;
import miu.edu.mystudentmgmtapp.model.Student;
import miu.edu.mystudentmgmtapp.model.Transcript;
import miu.edu.mystudentmgmtapp.service.classroomService;
import miu.edu.mystudentmgmtapp.service.courseService;
import miu.edu.mystudentmgmtapp.service.studentService;
import miu.edu.mystudentmgmtapp.service.transcriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {


    @Autowired
    public classroomService classroomservice;
    @Autowired
    public studentService studentservice;
    @Autowired
    public transcriptService transcriptservice;
    @Autowired
    public courseService courseservice;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Student student1 = new Student(null, "11111", "Charles", "Grant","Carpenter" ,3.8 , LocalDate.of(2003, 7, 9));
        Student student2 = new Student(null, "22222", "John", "Doe","Carpenter" ,3.8 , LocalDate.of(2003, 7, 9));
        Student student3 = new Student(null, "33333", "Jane", "Doe","Carpenter" ,3.8 , LocalDate.of(2003, 7, 9));
        Student student4 = new Student(null, "44444", "Mary", "Doe","Carpenter" ,3.8 , LocalDate.of(2003, 7, 9));

        Transcript transcript1 = new Transcript(null, "Computer Science");
        Transcript transcript2 = new Transcript(null, "History");
        Transcript transcript3 = new Transcript(null, "Computer Science");
        Transcript transcript4 = new Transcript(null, "Math");

        Course course1 = new Course(null, "CS390", "Java");
        Course course2 = new Course(null, "CS401", "C#");
        Course course3 = new Course(null, "CS545", "Python");
        Course course4 = new Course(null, "CS570", "C++");

        Classroom classroom1 = new Classroom(null, "McLaughlin", "M105");
        Classroom classroom2 = new Classroom(null, "McLaughlin", "M106");
        Classroom classroom3 = new Classroom(null, "McLaughlin", "M107");
        Classroom classroom4 = new Classroom(null, "McLaughlin", "M108");




        course1.setStudents(List.of(student1, student2, student3, student4));
        course2.setStudents(List.of(student1, student2, student3));
        course3.setStudents(List.of(student1, student2, student3, student4));
        course4.setStudents(List.of(student1, student2, student3));



        student1.setClassroom(classroom1);
        student2.setClassroom(classroom2);
        student3.setClassroom(classroom3);
        student4.setClassroom(classroom4);


        transcript1.setStudent(student1);
        transcript2.setStudent(student2);
        transcript3.setStudent(student3);
        transcript4.setStudent(student4);



        addTranscript(transcript1);
        addTranscript(transcript2);
        addTranscript(transcript3);
        addTranscript(transcript4);

        addCourse(course1);
        addCourse(course2);
        addCourse(course3);
        addCourse(course4);


    }
    public Student addStudent(Student student){
        return studentservice.createStudent(student);
    }

    public Course addCourse(Course course){
        return courseservice.createCourse(course);
    }

    public Transcript addTranscript(Transcript transcript){
        return transcriptservice.createTranscript(transcript);
    }
    public Classroom addClassroom(Classroom classroom){
        return classroomservice.createClassroom(classroom);
    }
    public void addStudentToCourse(Student student, Course course){
                course.getStudents().add(student);
    }
    public void addStudentToClassroom(Student student, Classroom classroom){
        var newClassroom =classroom.getStudents();
        newClassroom.add(student);
    }
}
