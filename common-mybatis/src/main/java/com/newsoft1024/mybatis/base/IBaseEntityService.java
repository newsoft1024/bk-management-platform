package com.newsoft1024.mybatis.base;

import com.github.pagehelper.PageInfo;
import com.newsoft1024.mybatis.base.request.PageRequest;
import tk.mybatis.mapper.entity.Example;


import java.util.List;

/**
 * 基础实体类service  区别于model类
 * @param <T>     model类
 * @param <QM>    查询entity类
 */
public interface IBaseEntityService<T,QM> {
    T getById(Long id);

    List<T> getAll();

    PageInfo<T> getPageList(PageRequest<QM> request);

    void insert(T model);

    void update(T model);

    void delete(T model);

    List<T> selectByExample(QM entity);
}
