package com.newsoft1024.bkmanagementplatform.uaservice.dao;

import com.newsoft1024.bkmanagementplatform.uaservice.model.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Doctor
 * Description:
 * Date: 2019-2-11 14:32
 * Modify By:
 */
@Mapper
@Repository
public interface RoleDao {
    @Select("select * from sso_account_role where uid = #{uid}")
    @Results(
            {@Result(property = "userId",column = "user_id"),
             @Result(property = "name",column = "name")})
    List<Role> getListByAccountId(@Param("uid")Long accountId);
}
