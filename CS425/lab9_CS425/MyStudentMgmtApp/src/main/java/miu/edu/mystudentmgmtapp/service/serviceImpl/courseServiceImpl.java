package miu.edu.mystudentmgmtapp.service.serviceImpl;


import miu.edu.mystudentmgmtapp.model.Course;
import miu.edu.mystudentmgmtapp.model.Student;
import miu.edu.mystudentmgmtapp.repository.CourseRepo;
import miu.edu.mystudentmgmtapp.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseServiceImpl implements courseService {

    private CourseRepo courseRepo;

    @Autowired
    private courseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

}
