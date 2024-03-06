package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentDAO;

;

@Service
@Transactional
public class StudentsServicelmpl implements StudentService {

	@Autowired
	private StudentDAO dao;

	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}

	@Override
	public Student save(Student students) {
		// TODO Auto-generated method stub
		return dao.save(students);
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.findStudentById(id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}