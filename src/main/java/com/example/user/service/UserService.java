package com.example.user.service;

import com.example.eql.Dql;
import com.example.user.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by y on 2018/3/12.
 */
@Service
public class UserService {

    public int userOperate(String name, String type, String sex) {

        return new Dql().insert("userOperate").params(name, type, sex).execute();
    }

    public int insertUser(UserInfo user) {
        //TODO
        return new Dql().insert("insertUser-bean").params(user.getUserId(),user.getName(),user.getType(),user.getSex()).execute();
    }

    public int deleteUser(String userId){

        return new Dql().delete("deleteUser").params(userId).execute();

    }
    public List<UserInfo> selectUserList(){
        return new Dql().select("selectUserList").execute();
    }

}