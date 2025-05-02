package edu.miu.eregistrar.lab_10.Service.ServiceImpl;

import edu.miu.eregistrar.lab_10.Model.Student;
import edu.miu.eregistrar.lab_10.Repository.StudentRepo;
import edu.miu.eregistrar.lab_10.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepo.getReferenceById(studentId);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        if(studentRepo.findById(studentId).isPresent())
            studentRepo.deleteById(studentId);

    }

    @Override
    public List<Student> searchStudents() {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }


}
