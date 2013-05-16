/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar.controller;

import com.angular.belajar.domain.UserDetail;
import com.angular.belajar.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author cak-ust
 */
@Controller
@RequestMapping("/users")
public class UserDetailController {
    @Autowired
    private UserService userService;
    
    @RequestMapping("/userlist.json")
    public @ResponseBody List<UserDetail> getUserList(){
        return userService.getAllUsers();
    }
    
    @RequestMapping(value = "/removeUser/{userId}", method = RequestMethod.DELETE)
    public @ResponseBody void removeCar(@PathVariable("userId") String userId) {
        userService.deleteUser(userId);
    }
    
    @RequestMapping("/layout")
    public String getUserPartialPage(){
        return "/users/layout";
    }
}
