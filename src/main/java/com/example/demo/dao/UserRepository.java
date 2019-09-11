package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther DRevelation
 * @Date 2019-06-10 15:50
 * @Desc
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String name);

}
