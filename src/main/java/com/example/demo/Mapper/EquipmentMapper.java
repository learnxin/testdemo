package com.example.demo.Mapper;

import com.example.demo.Gentity.Equipment;

public interface EquipmentMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    Equipment selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}