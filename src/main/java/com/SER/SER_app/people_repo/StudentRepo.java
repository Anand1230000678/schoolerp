package com.SER.SER_app.people_repo;

import com.SER.SER_app.people_model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
