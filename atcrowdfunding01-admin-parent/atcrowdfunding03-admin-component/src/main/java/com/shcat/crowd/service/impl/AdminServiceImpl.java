package com.shcat.crowd.service.impl;

import com.shcat.crowd.entity.Admin;
import com.shcat.crowd.mapper.AdminMapper;
import com.shcat.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shcat
 * @description
 * @create 2022.11.2 15:50:33
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
        // throw new RuntimeException();
    }
}
