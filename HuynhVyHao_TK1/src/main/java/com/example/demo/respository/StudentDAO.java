package com.example.demo.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;



@Repository
public interface StudentDAO {
	public List<Student> findAll();
	public Student save( Student students);
	public Student findStudentById(int id);
	public String delete(int id);
}