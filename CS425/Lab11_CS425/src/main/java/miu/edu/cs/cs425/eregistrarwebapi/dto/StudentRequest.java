package miu.edu.cs.cs425.eregistrarwebapi.dto;


import lombok.Data;

import java.time.LocalDate;

@Data

public class StudentRequest {
    private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private double cgpa;
    private LocalDate enrollmentDate;
    private String isInternational;
}
