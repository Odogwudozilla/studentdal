package com.odogwu.student.dal;

import java.util.Optional;

import com.odogwu.student.dal.entities.Student;
import com.odogwu.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {

		Student student = new Student();
		student.setName("Chidozie");
		student.setCourse("Java Web Services");
		student.setFee(480);

		studentRepository.save(student);

	}

	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}

}
