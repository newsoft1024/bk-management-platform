package com.newsoft1024.mybatis.base;

import com.github.pagehelper.PageInfo;
import com.newsoft1024.mybatis.base.request.PageRequest;


import java.util.List;

public interface IBaseEntityService<T,QM> {
    T getById(Long id);

    List<T> getAll();

    PageInfo<T> getPageList(PageRequest<QM> request);

    void insert(T model);

    void update(T model);

    void delete(T model);
}
