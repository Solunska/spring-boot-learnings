package com.project.cruddemo;

import com.project.cruddemo.dao.StudentDAO;
import com.project.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            // createStudent(studentDAO);

            createMultipleStudents(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        Student student = new Student("Aneta", "Solunska", "aneta@gmail.com");
        studentDAO.save(student);
        System.out.println("Saved student with id: " + student.getId());
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        Student student1 = new Student("John", "Doe", "john@gmail.com");
        Student student2 = new Student("Mary", "Public", "mary@gmail.com");
        Student student3 = new Student("Bonita", "Applebum", "bonita@gmail.com");

        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }
}
