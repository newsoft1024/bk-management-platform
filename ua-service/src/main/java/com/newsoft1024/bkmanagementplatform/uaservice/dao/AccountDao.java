package com.newsoft1024.bkmanagementplatform.uaservice.dao;

import com.newsoft1024.bkmanagementplatform.uaservice.model.Account;
import com.newsoft1024.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Author: Doctor
 * Description:
 * Date: 2019-2-11 9:25
 * Modify By:
 */
@Mapper
@Repository
public interface AccountDao extends BaseMapper<Account> {
    @Select("select * from sso_account where username=#{username}")
    Account getByUserName(@Param("username")String username);
}
