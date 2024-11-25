package com.project.cruddemo;

import com.project.cruddemo.dao.StudentDAO;
import com.project.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            // createMultipleStudents(studentDAO);
            // readStudent(studentDAO);
            // queryForStudents(studentDAO);
            queryForStudentsByLastName(studentDAO);
        };
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Doe");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        Student student = new Student("John", "Doe", "john@gmail.com");
        studentDAO.save(student);

        System.out.println("Student id: " + student.getId());

        int studentId = student.getId();
        Student retrievedStudent = studentDAO.findById(studentId);

        System.out.println("Retrieved student: " + retrievedStudent);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        Student student1 = new Student("John", "Doe", "john@outlook.com");
        Student student2 = new Student("Mary", "Public", "mary@outlook.com");
        Student student3 = new Student("Bonita", "Applebum", "bonita@outlook.com");

        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }
}
