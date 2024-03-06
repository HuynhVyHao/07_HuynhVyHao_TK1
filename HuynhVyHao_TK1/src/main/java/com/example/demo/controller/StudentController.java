package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
    private StudentService dao;

    @PostMapping("/save")
    public Student save(@RequestBody Student students) {
        return dao.save(students);
    }

    @GetMapping("/findAll")
    public List<Student> getAllOrders() {
        return dao.findAll();
    }

    @GetMapping("findStudentById/{id}")
    public Student findStudentById(@PathVariable int id) {
        return dao.findStudentById(id);
    }
    @DeleteMapping("delete/{id}")
    public String remove(@PathVariable int id)   {
    	return dao.delete(id);
	}
}
