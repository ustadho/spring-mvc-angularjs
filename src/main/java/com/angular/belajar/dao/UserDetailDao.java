/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar.dao;

import com.angular.belajar.domain.UserDetail;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cak-ust
 */
@Repository("userDetailHibernate")
public class UserDetailDao {
    @Autowired
    SessionFactory sessionFactory;
    
    public Boolean simpan(UserDetail u){
        sessionFactory.getCurrentSession().save(u);
        return true;
    }
    
    public List<UserDetail> getAllUser(){
        return sessionFactory.getCurrentSession().createQuery("from UserDetail").list();
    }

    public Boolean deleteUser(String userId) {
        String hql= "delete UserDetail u where u.userId = :id";
        int iDel=sessionFactory.getCurrentSession().createQuery(hql)
                .setString("id", userId)
                .executeUpdate();
        return true;
    }
}
