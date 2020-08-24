package com.example.demo.Mapper;

import com.example.demo.Gentity.Executive;

public interface executiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Executive record);

    int insertSelective(Executive record);

    Executive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Executive record);

    int updateByPrimaryKey(Executive record);
}