package com.shcat.crowd.mvc.handler;

import com.shcat.crowd.entity.Admin;
import com.shcat.crowd.entity.Student;
import com.shcat.crowd.service.api.AdminService;
import com.shcat.crowd.util.CrowdUtil;
import com.shcat.crowd.util.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author shcat
 * @description
 * @create 2022.11.2 17:10:53
 */
//@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/send/array1.do")
    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array){
        // 接收参数时需要在参数名后面加[]
        for (Integer number : array){
            System.out.println(number);
        }
        return "success";
    }

    private final Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @ResponseBody
    @RequestMapping("/send/array2.do")
    public String testReceiveArrayTwo(@RequestBody List<Integer> array){

        for (Integer number : array){
            logger.info("number="+number); //注意是 org.slf4j.Logger，不是jul中的Logger
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("/send/compose/object.do")
    public ResultEntity<Student> testReceiveComplicatedObject(@RequestBody Student student, HttpServletRequest request){

        boolean judgeResult = CrowdUtil.judgeRequestType(request);
        logger.info("judgeResult = "+judgeResult);

        logger.info(student.toString());
        return ResultEntity.successWithData(student);
    }

    @RequestMapping("/test/ssm.html")
    public String testSSM(ModelMap modelMap, HttpServletRequest request){

        boolean judgeResult = CrowdUtil.judgeRequestType(request);
        logger.info("judgeResult = "+judgeResult);

        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList",adminList);
        return "target";
    }


}