package com.ebrahim.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service

public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Ebrahim",
                        "Kholil",
                        LocalDate.now(),
                        "admin@gmail.com",
                        29
                ),
                new Student(
                        "Ishmael Xaviul",
                        "Idrak",
                        LocalDate.now(),
                        "Idrakn@gmail.com",
                        2
                )
        );
    }
}
