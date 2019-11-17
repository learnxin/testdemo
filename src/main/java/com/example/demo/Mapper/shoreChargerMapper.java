package com.example.demo.Mapper;

import com.example.demo.Gentity.shoreCharger;

public interface shoreChargerMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(shoreCharger record);

    int insertSelective(shoreCharger record);

    shoreCharger selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(shoreCharger record);

    int updateByPrimaryKey(shoreCharger record);
}