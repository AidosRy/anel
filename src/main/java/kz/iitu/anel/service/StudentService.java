package kz.iitu.anel.service;

import kz.iitu.anel.model.Student;
import kz.iitu.anel.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private final StudentRepo repo;

    public void addStudent(Student student) {
        repo.save(student);
    }

    public void deleteStudent(Student student) {
        repo.delete(student);
    }

    public void updateStudent(Student student) {
        repo.save(student);
    }
}
