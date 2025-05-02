package miu.edu.cs.cs425.eregistrarwebapi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "student_number", nullable = false)
    private String studentNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "cgpa")
    private double cgpa;

    @Column(name = "enrollment_date", nullable = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate enrollmentDate;

    @Column(name = "is_international", nullable = false)
    private String isInternational;

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate enrollmentDate, String isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }
    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, String isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;

        this.isInternational = isInternational;
    }
}