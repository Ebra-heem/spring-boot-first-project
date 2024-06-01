package com.ebrahim.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(
         @Qualifier("DBStudentService") StudentService studentService
    ) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(
           @RequestBody Student student
    ){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
           @PathVariable("email") String email
    ) {
        return studentService.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(
           @RequestBody Student student
    ){
        return studentService.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
         @PathVariable("email") String email
    ) {
        studentService.delete(email);
    }
}
