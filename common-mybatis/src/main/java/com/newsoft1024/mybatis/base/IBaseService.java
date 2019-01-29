package com.newsoft1024.mybatis.base;

import com.github.pagehelper.PageInfo;
import com.newsoft1024.mybatis.base.request.PageRequest;


import java.util.List;

public interface IBaseService<T> {
    T getById(Long id);

    List<T> getAll();

    PageInfo<T> getPageList(PageRequest<T> request);

    void insert(T model);

    void update(T model);

    void delete(T model);
}
