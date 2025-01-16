package com.catch_me_study.catch_me_study.domain.user.service;

import com.catch_me_study.catch_me_study.domain.user.dto.UserDto;
import com.catch_me_study.catch_me_study.domain.user.entity.UserEntity;
import com.catch_me_study.catch_me_study.domain.user.mapper.UserMapper;
import com.catch_me_study.catch_me_study.domain.user.repository.UserRepositoty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
//    private final UserRepositoty userRepositoty;
//    private final UserMapper userMapper;
//
//    public List<UserDto> getUserList() {
//        List<UserEntity> userEntityList = UserRepositoty.findByIsDeletedFalse();
//        return UserMapper.toDto(userEntityList);
//    }
}
