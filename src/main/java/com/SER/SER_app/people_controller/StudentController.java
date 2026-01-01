package com.SER.SER_app.people_controller;

import com.SER.SER_app.dto.StudentResponse;
import com.SER.SER_app.exception.UserServiceException;
import com.SER.SER_app.people_model.Student;
import com.SER.SER_app.people_model.User;
import com.SER.SER_app.people_service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("{uid}/{pid}/saveStudent")
    public Student saveStudent(@PathVariable("uid") Long user_id,@PathVariable("pid") Long parent_profile_id,@RequestBody StudentResponse student)throws UserServiceException{
        return studentService.saveStudent(user_id,parent_profile_id,student);
    }

    @GetMapping("{sid}")
    public StudentResponse StudentGetId(@PathVariable("sid") Long id) throws UserServiceException {

        return studentService.getStudentById(id);

    }

}
