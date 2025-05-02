package miu.edu.cs.cs425.eregistrarwebapi.Service;

import miu.edu.cs.cs425.eregistrarwebapi.dto.StudentRequest;
import miu.edu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {

    public abstract List<Student> listStudents();
    public abstract Student registerNewStudent(Student newStudent);
    public abstract Student registerNewStudent(StudentRequest newStudent);
    public abstract Student getStudentById(Long studentId);
    public abstract Student deleteStudentById(Long studentId);
    public abstract Student updateStudent(Long studentId, StudentRequest studentRequest);
}
