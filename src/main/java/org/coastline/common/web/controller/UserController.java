package org.coastline.common.web.controller;

import org.coastline.common.web.model.Constants;
import org.coastline.common.web.model.Result;
import org.coastline.common.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Jay.H.Zou
 * @date 2019/2/9
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/loginPage")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    @ResponseBody
    public Result userLogin(@RequestBody User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (user != null) {
            session.setAttribute(Constants.USER, user);
            return new Result(Result.ResultCode.SUCCESS);
        }
        return new Result(Result.ResultCode.ERROR);
    }
}
