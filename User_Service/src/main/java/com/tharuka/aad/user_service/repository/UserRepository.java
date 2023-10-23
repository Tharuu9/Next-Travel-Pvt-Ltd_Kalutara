package com.tharuka.aad.user_service.repository;

import com.tharuka.aad.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Boolean existsByUserName(String userName);

    Boolean existsUserByUserNameAndPassword(String userName, String password);

    User findByUserNameAndPassword(String userName, String password);
}
