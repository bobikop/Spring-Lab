package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {


     @RequestMapping("/profile")
     public String profileTable(Model model){

         Profile myProfile = new Profile();
         myProfile.setName("mike");
         myProfile.setSurname("smith");
         myProfile.setUserName("msmith");
         myProfile.setPhoneNumber("+1256342345");
         myProfile.setEmail("msmith@gmail.com");
         myProfile.setCreatedDate( LocalDateTime.now());

         model.addAttribute("profile", myProfile);

         return "profile/profile-info";
     }
 }


