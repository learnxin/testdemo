package com.example.demo.Mapper;

import com.example.demo.Gentity.ExpenseInfo;

public interface ExpenseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpenseInfo record);

    int insertSelective(ExpenseInfo record);

    ExpenseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpenseInfo record);

    int updateByPrimaryKey(ExpenseInfo record);
}