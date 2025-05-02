package miu.edu.cs.cs425.eregistrarwebapi.controller;


import jakarta.validation.Valid;
import miu.edu.cs.cs425.eregistrarwebapi.Service.StudentService;
import miu.edu.cs.cs425.eregistrarwebapi.dto.StudentRequest;
import miu.edu.cs.cs425.eregistrarwebapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/eregistrar/api/student")
public class studentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<Student>> getAllStudents(){
        var students = studentService.listStudents();
        return ResponseEntity.ok(students);
    }

@PostMapping(value = "/update/{studentId}")
    public Student updateStudent(@Valid @RequestBody StudentRequest studentRequest,
                                                 @PathVariable Long studentId){
        var studentBeforeUpdate = studentService.getStudentById(studentId);
        var student = studentService.updateStudent(studentId, studentRequest);
        return student;
    }



    @PostMapping(value = "/register")
    public Student registerNewStudent(@RequestBody StudentRequest studentRequest){
        var student = studentService.registerNewStudent(studentRequest);
        return student;
    }

    @GetMapping(value = {"/get/{studentId}"})
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId) throws Exception {
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @GetMapping(value = {"/delete/{studentId}"})
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long studentId) {
        var deleted = studentService.deleteStudentById(studentId);
        return ResponseEntity.ok(deleted);
    }
}