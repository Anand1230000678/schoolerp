package com.SER.SER_app.people_service;

import com.SER.SER_app.dto.StudentResponse;
import com.SER.SER_app.exception.UserServiceException;
import com.SER.SER_app.people_model.ParentProfile;
import com.SER.SER_app.people_model.Student;
import com.SER.SER_app.people_model.User;
import com.SER.SER_app.people_repo.ParentProfileRepo;
import com.SER.SER_app.people_repo.StudentRepo;
import com.SER.SER_app.people_repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
@Autowired
       private  StudentRepo studentRepo;
 @Autowired
    ParentProfileRepo parentProfileRepo;
  @Autowired
   private UserRepo userRepo;
  // student me student apna data dekh sakta ha aur kuch function pr data update kr sakta hai

    public Student saveStudent(Long user_id,Long parent_profile_pid,StudentResponse studentResponse) throws UserServiceException{
        Optional<User> userOptional = userRepo.findById(user_id);
        Optional<ParentProfile> parentProfileOptional = parentProfileRepo.findById(parent_profile_pid);
        if (userOptional.isPresent()) {
         User user = userOptional.get();
         ParentProfile parentProfile = parentProfileOptional.get();
            Student student = new Student();
            student.setUser(user);
            student.setParentProfile(parentProfile);
            student.setFirstName(studentResponse.getFirstName());
            student.setLastName(studentResponse.getLastName());
            student.setDob(studentResponse.getDob());
            student.setGender(studentResponse.getGender());
            student.setPhone(studentResponse.getPhone());
            return studentRepo.save(student);
        }else {
            throw  new UserServiceException("user not save data");
        }
    }

    public StudentResponse getStudentById(Long sid )throws UserServiceException {

        Student student = studentRepo.findById(sid).orElseThrow();


        StudentResponse studentResponse1 = new StudentResponse();
        studentResponse1.setFirstName(student.getFirstName());
        studentResponse1.setLastName(student.getLastName());
        studentResponse1.setGender(student.getGender());
        studentResponse1.setDob(student.getDob());
        studentResponse1.setPhone(student.getPhone());
        studentResponse1.setStatus(student.getStatus());
        studentResponse1.setEmail(student.getUser().getEmail());
        return studentResponse1;



    }


}
