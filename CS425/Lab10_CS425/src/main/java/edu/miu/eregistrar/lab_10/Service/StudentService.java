package edu.miu.eregistrar.lab_10.Service;

import edu.miu.eregistrar.lab_10.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public abstract Student saveStudent(Student student);

    public abstract List<Student> getAllStudents();

    public abstract Student getStudentById(Long studentId);

    public abstract void deleteStudentById(Long studentId);

    public abstract List<Student> searchStudents();

    public abstract Student updateStudent(Student student);
}
