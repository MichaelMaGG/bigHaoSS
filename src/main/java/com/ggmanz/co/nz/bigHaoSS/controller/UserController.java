package com.ggmanz.co.nz.bigHaoSS.controller;

import com.ggmanz.co.nz.bigHaoSS.entity.UserInfo;
import com.ggmanz.co.nz.bigHaoSS.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by mazhuang on 2018/6/15.
 */
@RestController
public class UserController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/hello")
    public String getHello(String name) throws UnknownHostException {
        StringBuilder sb = new StringBuilder("Welcome to BigHaoSS! ");
        if (name != null && name.length() > 0) {
            sb.append(name).append("!");
        } else {
            sb.append("friends!").append("!");
        }
        System.out.println("welcome:" + name );

        return sb.toString() + "from " +InetAddress.getLocalHost().getHostAddress();
    }


    @RequestMapping(value="/user", method= RequestMethod.GET)
    public UserInfo userInfo(@RequestBody UserInfo userInfo) {

        UserInfo user = userInfoMapper.getUserById(userInfo.getId());

        return user;
    }

    @RequestMapping(value="/users", method= RequestMethod.GET)
    public List<UserInfo> usersInfo() {
        List<UserInfo> users = userInfoMapper.getUsers();
        return users;
    }

    @RequestMapping(value="/user", method= RequestMethod.POST)
    public String add(@RequestBody UserInfo userInfo) {
        if(userInfo != null) {
//            System.out.println(userInfo.getId());
            System.out.println(userInfo.getName());
            System.out.println(userInfo.getGender());
            System.out.println(userInfo.getIdNum());
            System.out.println(userInfo.getPhoneNum());
            System.out.println(userInfo.getSchool());
            System.out.println(userInfo.getDistributing());
            System.out.println(userInfo.getHighPerformance());
            System.out.println(userInfo.getRegisterDate());
            System.out.println(userInfo.getCircle());
            System.out.println(userInfo.getAptl());
            System.out.println(userInfo.getNewEmployee());
            System.out.println(userInfo.getCbt());
            System.out.println(userInfo.getFixedModule());
            System.out.println(userInfo.getMovedModule());
            System.out.println(userInfo.getThisField());
            System.out.println(userInfo.getRemark());

            userInfoMapper.insert(userInfo.getGroupId(),userInfo.getName(),
                    userInfo.getGender(), userInfo.getAvatar(), userInfo.getIdNum(), userInfo.getPhoneNum(),
                    userInfo.getSchool(), userInfo.getDistributing(), userInfo.getHighPerformance(),
                    userInfo.getRegisterDate(), userInfo.getEnglish(), userInfo.getCircle(), userInfo.getAptl(),
                    userInfo.getNewEmployee(), userInfo.getCbt(), userInfo.getFixedModule(),
                    userInfo.getMovedModule(), userInfo.getThisField(),userInfo.getRemark());
        } else {
            System.out.println("got nothing!");
        }

        return "";
    }
}
