package org.lyc.platform.sys.dao;


import org.apache.ibatis.annotations.Mapper;
import org.lyc.platform.sys.bean.User;

@Mapper
public interface UserMapper {

    User findUserByUserCode(String userCode);

    <User> User checklogin(User user);

    User checkloginmd5(User user);
}