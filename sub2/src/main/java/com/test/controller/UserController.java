package com.test.controller;

import com.test.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by DBQ on 11/05/2017.
 */

@Controller
public class UserController {

    @RequestMapping(value = "/hello")
    public String index(Model model, UserBean user) {
        user = new UserBean();
        user.setName("DBQ");
        model.addAttribute("user", user.getName());
        return "index";
    }

}
