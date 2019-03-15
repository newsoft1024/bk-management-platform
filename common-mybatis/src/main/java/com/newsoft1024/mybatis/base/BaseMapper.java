package com.newsoft1024.mybatis.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 基础mapper
 * @param <T>
 *
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
