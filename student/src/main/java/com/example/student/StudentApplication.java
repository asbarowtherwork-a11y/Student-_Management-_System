package com.example.student;


import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception{

//		Student student1 = new Student("Ram", "Singh","ram@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Asba", "Ji","as@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Renuka", "Dost","renu@gmail.com");
//		studentRepository.save(student3);
	}

}
