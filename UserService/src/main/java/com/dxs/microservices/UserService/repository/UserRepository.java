package com.dxs.microservices.UserService.repository;

import com.dxs.microservices.UserService.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
