package com.example.demo.Mapper;

import com.example.demo.Gentity.shoreStake;

public interface shoreStakeMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(shoreStake record);

    int insertSelective(shoreStake record);

    shoreStake selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(shoreStake record);

    int updateByPrimaryKey(shoreStake record);
}