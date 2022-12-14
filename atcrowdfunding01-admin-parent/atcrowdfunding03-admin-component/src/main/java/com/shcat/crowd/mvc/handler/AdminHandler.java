package com.shcat.crowd.mvc.handler;

import com.shcat.crowd.constant.CrowdConstant;
import com.shcat.crowd.entity.Admin;
import com.shcat.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author shcat
 * @description
 * @create 2022.11.5 17:05:22
 */
@Controller
public class AdminHandler {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/admin/do/login.do")
    public String doLogin(
            @RequestParam("loginAcct") String loginAcct,
            @RequestParam("userPswd") String userPswd,
            HttpSession session
    ) {
        // 1.调用service方法执行登录检查
        // 返回admin对象说明登录成功，否则会抛出异常
        Admin admin = adminService.getAdminByLoginAcct(loginAcct, userPswd);

        // 2.将登录成功返回的admin对象存入Session域
        session.setAttribute(CrowdConstant.ATTR_NAME_LOGIN_ADMIN, admin);
        return "redirect:/admin/to/main.do";
    }

    @RequestMapping(value = "/admin/do/logout.do")
    public String doLogout(HttpSession session) {

        // 强制Session失效
        session.invalidate();
        return "redirect:/admin/to/login.do";
    }
}
