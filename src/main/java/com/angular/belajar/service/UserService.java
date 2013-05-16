/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar.service;

import com.angular.belajar.domain.UserDetail;
import java.util.List;

/**
 *
 * @author cak-ust
 */
public interface UserService {
    public Boolean simpan(UserDetail u);
    public List<UserDetail> getAllUsers();
}
