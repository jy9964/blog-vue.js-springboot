package com.jy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jy.entity.User;

/**
 * @author jy
 * <p>
 * 2018年11月8日
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByAccount(String account);

}
