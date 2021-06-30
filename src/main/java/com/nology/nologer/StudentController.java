package com.nology.nologer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
public class StudentController {

    List<Student> students = new ArrayList<Student>();
    public StudentController() {
        String[] interests = {"Skiing", "Holidays"};
        Student john =new Student("John", "Doe", 50, "London", interests);
        students.add(john);
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.students;
    }

    public Student getStudent(String id) {
       return this.students.get(0);
    }
}
