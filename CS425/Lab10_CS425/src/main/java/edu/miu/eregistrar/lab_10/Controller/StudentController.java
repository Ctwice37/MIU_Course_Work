package edu.miu.eregistrar.lab_10.Controller;


import edu.miu.eregistrar.lab_10.Model.Student;
import edu.miu.eregistrar.lab_10.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/eregistrar/students"})
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping("/list")
    public ModelAndView displayStudentList(){
        var modelAndView = new ModelAndView();
        var students = studentService.getAllStudents();
        modelAndView.addObject("studentssss", students);
        modelAndView.setViewName("/students/list");


        return modelAndView;
    }

    @GetMapping("/new")
    public String registerNewStudent(Model model){
        model.addAttribute("student", new Student(null, null, null, null, null, null, null, null));
        return "/students/new";
    }

    @PostMapping("/new")
    public String addNewStudent(@Validated @ModelAttribute("students") Student student, BindingResult bindingResult , Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("student", student);
            return "/students/new";
        }
       studentService.saveStudent(student);
        return "redirect:/eregistrar/students/list";
    }

    @GetMapping(value = {"/edit/{studentId}"})                    //@RequestParam("publisherId") Integer publisherId
    public String editStudent(@PathVariable Long studentId, Model model) {
        var student = studentService.getStudentById(studentId);
        if(student != null) {
            model.addAttribute("student", student);
            return "/students/edit";                            //"Logical" name of the view (looks in the templates folder for a file with this name)
        }
        return "redirect:/students/list";
    }

    @PostMapping(value = {"/update"})
    public String updateStudent(@Validated @ModelAttribute("students") Student student,
                                  BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("student", student);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "students/edit";
        }
        studentService.updateStudent(student);
        return "redirect:/eregistrar/students/list";
    }



    @GetMapping(value = {"/delete/{studentId}"})
    public String deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudentById(studentId);
        return "redirect:/eregistrar/students/list";
    }



}
