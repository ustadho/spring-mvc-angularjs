/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar;

import com.angular.belajar.domain.UserDetail;
import com.angular.belajar.service.UserService;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author cak-ust
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:com/angular/**/applicationContext.xml")
public class ServiceUserDetailTest {
    @Autowired
    private UserService service;
    
    @Test
    public void tampilkan(){
        List<UserDetail> user=service.getAllUsers();
        for(UserDetail u:user){
            System.out.println("UserID  :"+u.getUserId());
            System.out.println("UserName:"+u.getUserName());
        }
    }
    
    @Test
    public void simpan(){
        UserDetail user=new UserDetail();
        user.setUserId("001");
        user.setUserName("User 1");
        service.simpan(user);
    }
    
}
