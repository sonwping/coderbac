package com.tom.coderbac.service;


import com.tom.coderbac.bean.User;
import com.tom.code22.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao22;

    public User getAll() {
        User selectall = adminDao22.selectall();
        System.out.println("service...selectall.tostring=" + selectall.toString());
        return selectall;
    }
}
