package com.jy.common.util;

import org.apache.shiro.SecurityUtils;

import com.jy.common.constant.Base;
import com.jy.entity.User;

/**
 * @author jy
 * <p>
 * 2019年11月1日
 */
public class UserUtils {

    public static User getCurrentUser() {
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute(Base.CURRENT_USER);
        return user;
    }
}
