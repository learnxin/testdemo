package com.example.demo.Mapper;

import com.example.demo.Gentity.PresentArchival;

public interface PresentArchivalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PresentArchival record);

    int insertSelective(PresentArchival record);

    PresentArchival selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PresentArchival record);

    int updateByPrimaryKey(PresentArchival record);
}