package miu.edu.mystudentmgmtapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NonNull
    private String studentNumber;
    @NonNull
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    private Double cgpa;
    private LocalDate dateOfEnrollment;

    @OneToOne(mappedBy = "student")
    private Transcript transcript;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_classroomId")
    private Classroom classroom;

    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private List<Course> courses;

    public Student(Long studentId, @NonNull String studentNumber, @NonNull String firstName, String middleName, @NonNull String lastName, Double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }
}
