package com.newsoft1024.bkmanagementplatform.uaservice.model;

import com.newsoft1024.mybatis.base.BaseModel;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Author: Doctor
 * Description:
 * Date: 2019-1-31 14:19
 * Modify By:
 */
@Entity
@Table(name = "sso_account_role")
public class Role extends BaseModel implements GrantedAuthority {

    private Integer userId;

    private String name;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getAuthority() {
        return name;
    }
}
