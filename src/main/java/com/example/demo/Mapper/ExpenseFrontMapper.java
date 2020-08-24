package com.example.demo.Mapper;

import com.example.demo.Gentity.ExpenseFront;

public interface ExpenseFrontMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ExpenseFront record);

    int insertSelective(ExpenseFront record);

    ExpenseFront selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ExpenseFront record);

    int updateByPrimaryKey(ExpenseFront record);
}