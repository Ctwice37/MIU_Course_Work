package miu.edu.mystudentmgmtapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String CourseCode;
    private String CourseName;



    @ManyToMany()
    @JoinTable(name = "Student_Courses",
            joinColumns = {@JoinColumn(name = "FK_CourseId", referencedColumnName = "courseId")},
            inverseJoinColumns = {@JoinColumn(name = "FK_StudentId", referencedColumnName = "studentId")}
    )
    private List<Student> students;


    public Course(Integer courseId, String courseCode, String courseName) {
        this.courseId = courseId;
        CourseCode = courseCode;
        CourseName = courseName;
    }
}
