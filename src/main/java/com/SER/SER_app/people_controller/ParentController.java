package com.SER.SER_app.people_controller;

import com.SER.SER_app.dto.ParentResponse;
import com.SER.SER_app.people_model.ParentProfile;
import com.SER.SER_app.people_service.ParentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParentController {

    @Autowired
    ParentProfileService parentProfileService;

    @PostMapping("{pid}/saveParent")
    public ParentProfile saveParentData(@PathVariable("pid") Long user_id, @RequestBody ParentResponse parentResponse) throws IllegalAccessException{
        return parentProfileService.saveParentData(user_id, parentResponse);
    }

   @GetMapping("getParent/{pid}")
    public ParentProfile getUserData(@PathVariable("pid") Long id){
        return parentProfileService.getParentData(id);
   }
}
