package com.example.demo.Mapper;

import com.example.demo.Gentity.DonateInfo;

public interface DonateInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DonateInfo record);

    int insertSelective(DonateInfo record);

    DonateInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DonateInfo record);

    int updateByPrimaryKey(DonateInfo record);
}