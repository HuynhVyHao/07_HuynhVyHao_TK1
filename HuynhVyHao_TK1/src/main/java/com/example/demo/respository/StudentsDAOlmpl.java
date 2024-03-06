package com.example.demo.respository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;
@Repository
@Transactional
public class StudentsDAOlmpl implements StudentDAO {

	public static final String HASH_KEY = "Student";
	
	private final RedisTemplate template;

    StudentsDAOlmpl(RedisTemplate template) {
        this.template = template;
    }

	@Override
	public List<Student> findAll() {

		return template.opsForHash().values(HASH_KEY);
	}

	@Override
	public Student save(Student students) {
		template.opsForHash().put(HASH_KEY, students.getId(), students);
		return students;
	}

	@Override
	public Student findStudentById(int id) {
		return (Student) template.opsForHash().get(HASH_KEY, id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		template.opsForHash().delete(HASH_KEY, id);
		return "stu removed !!";
	}

}
