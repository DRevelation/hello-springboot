package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-10 15:57
 * @Desc
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(User user) {
        return userService.addUser(user);
    }

    @PutMapping
    public User updateUser(User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable(value = "id") Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping(value = "/{name}")
    public User findUserByName(@PathVariable(value = "name") String name) {
        return userService.findUserByName(name);
    }

    /**
     * 分页
     * localhost:8082/user/page/1-2
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/page/{cPage}-{pSize}")
    public Page<User> getUserByPage(@PathVariable(value = "cPage") Integer currentPage, @PathVariable(value = "pSize") Integer pageSize) {
        return userService.findAllByPage(currentPage, pageSize);
    }

    /**
     * 分页+排序
     * localhost:8082/user/order/age?cPage=2&pSize=3
     * @param sortColumn
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/order/{sColumn}")
    public Page<User> getUserByPageOrderAge(@PathVariable(value = "sColumn") String sortColumn,
                                            @RequestParam(value = "cPage") Integer currentPage,
                                            @RequestParam(value = "pSize") Integer pageSize) {
        return userService.findAllByPageOrderAge(sortColumn, currentPage, pageSize);
    }

}
