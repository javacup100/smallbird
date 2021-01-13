package com.smallbird.backend.platform.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserInfoController {

//    @Autowired
//    private UserInfoService userInfoService;

    @GetMapping(value = {"/home", "/"})
    public String home() {
        return "home";
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

//    @GetMapping("/get-user")
//    public UserInfo getUser(@RequestParam String username) {
//        return userInfoService.getUserInfo(username);
//    }
//
//    @PreAuthorize("hasAnyRole('user')") // 只能user角色才能访问该方法
//    @GetMapping("/user")
//    public String user() {
//        return "user角色访问";
//    }
//
//    @PreAuthorize("hasAnyRole('admin')") // 只能admin角色才能访问该方法
//    @GetMapping("/admin")
//    public String admin() {
//        return "admin角色访问";
//    }
//
//    @PostMapping("/add-user")
//    public int addUser(@RequestBody UserInfo userInfo) {
//        return userInfoService.insertUser(userInfo);
//    }
//
//    @PutMapping("/updatePwd")
//    public int updatePwd(@RequestBody Map<String, String> map) {
//        return userInfoService.updatePwd(map.get("oldPwd"), map.get("newPwd"));
//    }
}
