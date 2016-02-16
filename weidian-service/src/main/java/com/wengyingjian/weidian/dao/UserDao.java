package com.wengyingjian.weidian.dao;

import com.wengyingjian.weidian.common.model.User;
import com.wengyingjian.weidian.common.model.query.UserQuery;
import com.wengyingjian.weidian.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wengyingjian on 16/2/1.
 */
@Repository
public class UserDao {

    @Autowired
    private UserMapper masterUserMapper;
    @Autowired
    private UserMapper slaveUserMapper;

    public List<User> selectUsers(UserQuery userQuery) {
        return slaveUserMapper.selectUsers(userQuery);
    }

    public int insertSelective(User user) {
        return masterUserMapper.insertSelective(user);
    }

    public int updateUser(User user) {
        return masterUserMapper.updateUser(user);
    }
}
