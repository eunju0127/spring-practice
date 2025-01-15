package com.catch_me_study.catch_me_study.domain.user.repository;

import com.catch_me_study.catch_me_study.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoty extends JpaRepository<UserEntity, String> {

}
