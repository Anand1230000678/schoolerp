package com.SER.SER_app.people_service;

import com.SER.SER_app.dto.ParentResponse;
import com.SER.SER_app.people_model.ParentProfile;
import com.SER.SER_app.people_model.User;
import com.SER.SER_app.people_repo.ParentProfileRepo;
import com.SER.SER_app.people_repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParentProfileService {

  @Autowired
    ParentProfileRepo parentProfileRepo;
   @Autowired
    UserRepo userRepo;
  public ParentProfile saveParentData(Long user_uid,ParentResponse parentResponse) throws IllegalAccessException{
      if(user_uid == null){
         throw  new IllegalAccessException("user id not found!");
      }
      Optional<User> optionalUser = userRepo.findById(user_uid);
      ParentProfile parentProfile1 = new ParentProfile();
      User user2 = optionalUser.get();
      parentProfile1.setUser(user2);
      parentProfile1.setAddress(parentResponse.getAddress());
      parentProfile1.setContactNumber(parentResponse.getContactNumber());
      parentProfile1.setFatherName(parentResponse.getFatherName());
      parentProfile1.setAlternateContact(parentResponse.getAlternateContact());
      parentProfile1.setGuardianName(parentResponse.getGuardianName());
      parentProfile1.setMotherName(parentResponse.getMotherName());
      parentProfile1.setChildren(parentResponse.getChildren());



      return parentProfileRepo.save(parentProfile1);



  }
public ParentProfile getParentData(Long pid){
      ParentProfile parentProfile = parentProfileRepo.findById(pid).orElseThrow();

     ParentResponse parentResponse2 =  new ParentResponse();
     parentResponse2.setAddress(parentProfile.getAddress());
     parentResponse2.setChildren(parentProfile.getChildren());
     parentResponse2.setFatherName(parentProfile.getFatherName());
     parentResponse2.setGuardianName(parentProfile.getGuardianName());
     parentResponse2.setContactNumber(parentProfile.getContactNumber());
     parentResponse2.setMotherName(parentProfile.getMotherName());
    parentResponse2.setEmail(parentProfile.getUser().getEmail());

     return parentProfile;
}

}
