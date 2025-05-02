package edu.miu.eregistrar.lab_10.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

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
    @NonNull
    private LocalDate enrollmentDate;
    @NonNull
    private String isInternational;         //Yes or No,, use Radio Button

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate enrollmentDate, String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;

    }


}
