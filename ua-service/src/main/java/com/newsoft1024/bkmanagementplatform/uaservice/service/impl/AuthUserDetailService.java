package com.newsoft1024.bkmanagementplatform.uaservice.service.impl;

import com.newsoft1024.bkmanagementplatform.uaservice.dao.AccountDao;
import com.newsoft1024.bkmanagementplatform.uaservice.dao.RoleDao;
import com.newsoft1024.bkmanagementplatform.uaservice.model.Account;
import com.newsoft1024.bkmanagementplatform.utils.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Author: Doctor
 * Description:
 * Date: 2019-1-31 14:15
 * Modify By:
 */
@Service
public class AuthUserDetailService implements UserDetailsService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        ValidateUtil.validateAndThrowMessage(username,"用户名为空");

        Account account = accountDao.getByUserName(username);
        ValidateUtil.validateAndThrowMessage(account,"不存在用户名为:"+username+" 的账户信息");

        account.setAuthorities(roleDao.getListByAccountId(account.getId()));

        return account;
    }
}
