package com.SER.SER_app.people_service;

import com.SER.SER_app.dto.UserResponse;
import com.SER.SER_app.exception.DatabaseException;
import com.SER.SER_app.exception.UserServiceException;
import com.SER.SER_app.people_model.User;
import com.SER.SER_app.people_repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Optional;

@Service
public class UserService {
@Autowired
   private   UserRepo userRepo;

   public User saveUser(UserResponse userResponse){
     User user = new User();

     user.setEmail(userResponse.getEmail());
     user.setPassword(userResponse.getPassword());
     user.setRole(userResponse.getRole());

     return userRepo.save(user);

   }

}
