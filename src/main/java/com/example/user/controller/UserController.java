package com.example.user.controller;

import com.example.user.domain.Result;
import com.example.user.domain.UserInfo;
import com.example.user.service.UserService;
import org.n3r.idworker.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by y on 2018/3/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService ;

    @RequestMapping("/insert-user")
    public Result insertUser (@RequestBody UserInfo user) {
        String id = Id.next()+"";
        user.setUserId(id);
        userService.insertUser(user);
        System.out.println(id);
        return Result.build(id);
    }
    @RequestMapping("/delete-user")
    public void deleteUser(@RequestParam String userId) {
        // TODO
        userService.deleteUser(userId);
    }

    @RequestMapping("select-userList")
    public List<UserInfo> selectUserList(){
        System.out.println(userService.selectUserList());
        return userService.selectUserList();
    }
}
