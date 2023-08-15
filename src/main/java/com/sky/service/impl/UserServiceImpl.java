package com.sky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.domain.User;
import com.sky.service.UserService;
import com.sky.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Payment
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2023-08-15 17:23:05
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




