package com.example.secuitydemo.student;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v2/students")

public class StudentManagementController {
    private static final List<Student> students = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3,"Anna Smith"),
            new Student(4,"Johny Walker")
    );

    @GetMapping
    public List<Student> allStudents(){
        System.out.println("invoking GetMapping");
        return students;
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("Registered New Student" + student);
       // students.add(student);
    }
    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("Deleted Student with id :"+studentId);
    }
    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student){
        System.out.println("updated student witn id :" + studentId +" with new information" + student);
    }


}
