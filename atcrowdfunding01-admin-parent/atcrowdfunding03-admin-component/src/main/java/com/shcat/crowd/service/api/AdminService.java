package com.shcat.crowd.service.api;

import com.github.pagehelper.PageInfo;
import com.shcat.crowd.entity.Admin;

import java.util.List;

/**
 * @author shcat
 * @description
 * @create 2022.11.2 15:50:00
 */
public interface AdminService {
    void saveAdmin(Admin admin);
    List<Admin> getAll();

    Admin getAdminById(Integer id);
    Admin getAdminByLoginAcct(String loginAcct, String userPswd);
}
