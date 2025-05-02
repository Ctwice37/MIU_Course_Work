package miu.edu.mystudentmgmtapp.service;

import miu.edu.mystudentmgmtapp.model.Classroom;
import miu.edu.mystudentmgmtapp.model.Course;
import miu.edu.mystudentmgmtapp.repository.CourseRepo;

public interface courseService {

    public abstract Course createCourse(Course course);
}
