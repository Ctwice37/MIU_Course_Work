package miu.edu.cs.cs425.eregistrarwebapi.Service.ServiceImpl;


import miu.edu.cs.cs425.eregistrarwebapi.Service.StudentService;
import miu.edu.cs.cs425.eregistrarwebapi.dto.StudentRequest;
import miu.edu.cs.cs425.eregistrarwebapi.model.Student;
import miu.edu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;


    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student registerNewStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public Student registerNewStudent(StudentRequest newStudent) {
        Student student = new Student();

        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
            return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student deleteStudentById(Long studentId) {
        var deletedStudent = studentRepository.findById(studentId).orElse(null);
        studentRepository.deleteById(studentId);
        return deletedStudent;
    }

    @Override
    public Student updateStudent(Long studentId, StudentRequest studentRequest){
        var student = studentRepository.findById(studentId).orElse(null);
                if(student != null) {
            StudentDTOservice(student, studentRequest);
                        return studentRepository.save(student);
        }
        return null;
    }

    public void StudentDTOservice(Student existingStudent, StudentRequest studentEditRequest){

        existingStudent.setStudentNumber(studentEditRequest.getStudentNumber());
        existingStudent.setFirstName(studentEditRequest.getFirstName());
        existingStudent.setMiddleName(studentEditRequest.getMiddleName());
        existingStudent.setLastName(studentEditRequest.getLastName());
        existingStudent.setCgpa(studentEditRequest.getCgpa());
        existingStudent.setEnrollmentDate(studentEditRequest.getEnrollmentDate());
        existingStudent.setIsInternational(studentEditRequest.getIsInternational());

    }
}
