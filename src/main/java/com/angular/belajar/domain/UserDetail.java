/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cak-ust
 */
@Entity
@Table(name = "user_detail")
public class UserDetail {
    
    @Id
    @Column(name = "user_id")
    private String userId;
    
    @Column(name = "user_name")
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
