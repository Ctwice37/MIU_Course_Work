package miu.edu.mystudentmgmtapp.service.serviceImpl;

import miu.edu.mystudentmgmtapp.model.Classroom;
import miu.edu.mystudentmgmtapp.model.Student;
import miu.edu.mystudentmgmtapp.repository.ClassroomRepo;
import miu.edu.mystudentmgmtapp.service.classroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements classroomService {

    private ClassroomRepo classroomRepo;

    @Autowired
    private ClassRoomServiceImpl(ClassroomRepo classroomRepo) {
        this.classroomRepo = classroomRepo;
    }

    @Override
    public Classroom createClassroom(Classroom classroom) {
        return classroomRepo.save(classroom);
    }




}
