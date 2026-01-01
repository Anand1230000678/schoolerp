package com.SER.SER_app.people_repo;

import com.SER.SER_app.people_model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
