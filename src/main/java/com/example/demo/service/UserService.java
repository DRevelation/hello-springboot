package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-10 15:51
 * @Desc
 */
public interface UserService {

    User addUser(User user);

    User updateUser(User user);

    void deleteUserById(Long id);

    List<User> findAllUser();

    User findUserByName(String name);

    Page<User> findAllByPage(Integer currentPage, Integer pageSize);

    Page<User> findAllByPageOrderAge(String sortColumn, Integer currentPage, Integer pageSize);
}
