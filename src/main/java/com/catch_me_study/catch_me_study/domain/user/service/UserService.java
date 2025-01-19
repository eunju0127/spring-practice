package com.catch_me_study.catch_me_study.domain.user.service;

import com.catch_me_study.catch_me_study.domain.user.dto.UserDto;
import com.catch_me_study.catch_me_study.domain.user.entity.UserEntity;
import com.catch_me_study.catch_me_study.domain.user.mapper.UserMapper;
import com.catch_me_study.catch_me_study.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDto> getUserList() {
        List<UserEntity> userEntityList = userRepository.findByIsDeletedFalse();
        return userMapper.toDto(userEntityList);
    }

    private UserEntity findById(String id) {

        Optional<UserEntity> userEntity = userRepository.findByIdAndIsDeletedFalse(id);
        userEntity.orElseThrow(() -> new RuntimeException("등록되지 않은 회원입니다."));

        return userEntity.get();
    }

    public UserDto getUserById(String id) {
        return userMapper.toDto(findById(id));
    }

    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = userMapper.toEntity(userDto);
        userRepository.save(userEntity);
        return userMapper.toDto(userEntity);
    }

    public UserDto updateUser(UserDto userDto) {
        UserEntity userEntity = findById(userDto.getId());
        userEntity.update(userDto.getEmail(), userDto.getPassword(), userDto.getName());

        userRepository.save(userEntity);

        return userMapper.toDto(userEntity);
    }

    public String deleteUserById(String id) {
        UserEntity userEntity = findById(id);
        userEntity.delete();

        userRepository.save(userEntity);

        return userEntity.getId();
    }
}
