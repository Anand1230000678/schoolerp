package com.SER.SER_app.people_controller;

import com.SER.SER_app.dto.UserResponse;
import com.SER.SER_app.exception.UserServiceException;
import com.SER.SER_app.people_model.User;
import com.SER.SER_app.people_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
@Autowired
   private UserService userService;
@PostMapping("save")
public User saveUserdata(@RequestBody UserResponse userResponse){
        return userService.saveUser(userResponse);
}


}

