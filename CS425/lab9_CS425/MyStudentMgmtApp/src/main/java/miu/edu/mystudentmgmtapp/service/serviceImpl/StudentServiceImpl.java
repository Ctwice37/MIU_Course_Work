package miu.edu.mystudentmgmtapp.service.serviceImpl;

import miu.edu.mystudentmgmtapp.model.Student;
import miu.edu.mystudentmgmtapp.repository.StudentRepo;
import miu.edu.mystudentmgmtapp.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements studentService {

    private StudentRepo studentRepo;

    @Autowired
    private StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }
}
