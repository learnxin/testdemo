package com.example.demo.Mapper;

import com.example.demo.Gentity.shoreStation;

public interface shoreStationMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(shoreStation record);

    int insertSelective(shoreStation record);

    shoreStation selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(shoreStation record);

    int updateByPrimaryKey(shoreStation record);
}