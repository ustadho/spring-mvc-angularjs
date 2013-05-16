/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar.service.impl;

import com.angular.belajar.dao.UserDetailDao;
import com.angular.belajar.domain.UserDetail;
import com.angular.belajar.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author cak-ust
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserDetailDao userDao;
    
    @Override
    public Boolean simpan(UserDetail u) {
        return userDao.simpan(u);
    }

    @Override
    public List<UserDetail> getAllUsers() {
        return userDao.getAllUser();
    }
    
}
