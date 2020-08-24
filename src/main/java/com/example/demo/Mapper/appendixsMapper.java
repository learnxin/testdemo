package com.example.demo.Mapper;

import com.example.demo.Gentity.appendixs;

public interface appendixsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(appendixs record);

    int insertSelective(appendixs record);

    appendixs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(appendixs record);

    int updateByPrimaryKey(appendixs record);
}