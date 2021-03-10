package kz.iitu.anel.repo;

import kz.iitu.anel.model.Account;
import kz.iitu.anel.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
