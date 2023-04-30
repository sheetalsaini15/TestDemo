package com.signup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signup.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
