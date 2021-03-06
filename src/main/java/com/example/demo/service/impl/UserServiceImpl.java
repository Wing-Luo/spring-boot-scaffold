package com.example.demo.service.impl;

import com.example.demo.common.annotation.BaseService;
import com.example.demo.common.base.BaseServiceImpl;
import com.example.demo.dao.mapper.UserMapperExtend;
import com.example.demo.dao.model.User;
import com.example.demo.dao.model.UserExample;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserService实现
* Created by Wing on 2018/4/28.
*/
@Service
@Transactional
@BaseService
public class UserServiceImpl extends BaseServiceImpl<UserMapperExtend, User, UserExample> implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserMapperExtend userMapperExtend;

}