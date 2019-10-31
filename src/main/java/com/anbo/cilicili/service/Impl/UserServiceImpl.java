package com.anbo.cilicili.service.Impl;

import com.anbo.cilicili.bean.User;
import com.anbo.cilicili.dao.UserDao;
import com.anbo.cilicili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther wenlan
 * @Date 2019/10/14
 */
/*扫描包*/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String loginUser(String userName, String password) {
        User user = userDao.getUserByName(userName);
        if(user !=null){
            if (user.getPassword().equals(password)){
                return "index";
            }else {
                return "login";
            }
        }
        return "register";
    }
}
