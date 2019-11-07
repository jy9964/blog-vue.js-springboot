package com.jy.service;

import java.util.List;

import com.jy.entity.User;

/**
 * @author jy
 * <p>
 * 2019年11月9日
 */
public interface UserService {

    List<User> findAll();

    User getUserByAccount(String account);

    User getUserById(Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    void deleteUserById(Long id);
}
