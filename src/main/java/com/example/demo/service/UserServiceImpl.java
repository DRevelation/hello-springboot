package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-10 15:51
 * @Desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    @Override
    public Page<User> findAllByPage(Integer currentPage, Integer pageSize) {
        return userRepository.findAll(PageRequest.of(currentPage - 1, pageSize));
    }

    @Override
    public Page<User> findAllByPageOrderAge(String sortColumn, Integer currentPage, Integer pageSize) {
        return userRepository.findAll(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortColumn)));
    }
}
