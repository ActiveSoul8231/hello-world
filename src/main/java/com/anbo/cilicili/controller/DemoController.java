package com.anbo.cilicili.controller;

import com.anbo.cilicili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther wenlan
 * @Date 2019/10/14
 */
@Controller
@RequestMapping("user")
public class DemoController {
    /*依赖注入*/
    @Autowired
    HttpServletRequest request;
    @Autowired
    UserService userService;
    /**
     *
     * @param userName
     * @return
     *
     * RequestMapping
     * path: http://localhost:port/ ${path} ? param = ?
     */

    /*两种写法*/
//    @RequestMapping("test")
    /*@RequestMapping(path = "test",method = RequestMethod.GET)
    public String test(String userName){
        System.out.println(userName);
        return "/jsp/index.jsp";
    }*/


//    @RequestMapping(path = "test",method = RequestMethod.GET)
//    public String test(HttpServletRequest request,String userName){
//        request.setAttribute("userName",userName);
//        System.out.println(userName);
//        return "/jsp/index.jsp";
//    }

    @RequestMapping(path = "test",method = RequestMethod.GET)
    public String test(HttpServletRequest request, String userName){
        request.setAttribute("userName",userName);
        System.out.println(userName);
        return "/jsp/index.jsp";
    }


    /**
     * 登录Test
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(path = "login",method = RequestMethod.POST)
    public ModelAndView userLogin(String userName,String password){
        ModelAndView modelAndView = new ModelAndView();
        //调用userService 的 loginUser 方法 并获取返回页面路径
        //setViewName 页面跳转 参数 页面名称 页面路径
        String s = userService.loginUser(userName, password);
        System.out.println(s);
        modelAndView.setViewName(s);
        //addObject 向页面添加数据
        modelAndView.addObject("userName",userName);
        return modelAndView;
    }

}
