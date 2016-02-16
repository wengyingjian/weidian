package com.wengyingjian.weidian.dao.mapper;

import com.wengyingjian.weidian.common.model.User;
import com.wengyingjian.weidian.common.model.query.UserQuery;

import java.util.List;

/**
 * Created by wengyingjian on 16/2/1.
 */
public interface UserMapper {

    int insertSelective(User user);

    List<User> selectUsers(UserQuery userQuery);

    int updateUser(User user);

}
