package org.example.di_springtest.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.di_springtest.model.User;
import org.example.di_springtest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserLoginController {
  private final UserService userService;

  @GetMapping("/login")
  public String userLogin(){
    return "userLogin";
  }

//  @PostMapping("/login")
//  public String userLogin(User user, HttpSession session){
////    userService.createNewUser(user);
//    System.out.println(user.getPassword());
//    User findUser = userService.getUserByUserId(user.getUserId());
//
//    if(findUser != null && findUser.getPassword().equals(user.getPassword())){
//      session.setAttribute("user", findUser);
//      return "redirect:/posts/list";
//    }else{
//      return "redirect:/users/login";
//    }
//  }

  @GetMapping("/logout")
  public String logout(HttpSession session){
    session.invalidate();
    return "redirect:/users/login";
  }
  
}

