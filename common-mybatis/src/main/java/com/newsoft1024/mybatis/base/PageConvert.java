package com.newsoft1024.mybatis.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;

public class PageConvert {

    public static <T> PageInfo convert(PageInfo<T> pageInfo, Class clazz) {
        PageInfo ePageInfo = new PageInfo<>();
        BeanUtils.copyProperties(pageInfo, ePageInfo, clazz);

        String json = JSON.toJSONString(pageInfo);
        TypeUtils.castToJavaBean(pageInfo, clazz);

        return ePageInfo;
    }


}
