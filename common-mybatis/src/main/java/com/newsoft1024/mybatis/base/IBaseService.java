package com.newsoft1024.mybatis.base;

import com.github.pagehelper.PageInfo;
import com.newsoft1024.mybatis.base.request.PageRequest;
import tk.mybatis.mapper.entity.Example;


import java.util.List;

/**
 * 基础service接口，基本定义了某一实体类的增删查改以及分页查询
 * @author Doctor
 * @param <T>  model类
 */
public interface IBaseService<T> {
    T getById(Long id);

    List<T> getAll();

    PageInfo<T> getPageList(PageRequest<T> request);

    void insert(T model);

    void update(T model);

    void delete(T model);

    List<T> selectByExample(T entity);
}
