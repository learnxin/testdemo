package com.example.demo.Mapper;

import com.example.demo.Gentity.DonatePerson;

public interface DonatePersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DonatePerson record);

    int insertSelective(DonatePerson record);

    DonatePerson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DonatePerson record);

    int updateByPrimaryKey(DonatePerson record);
}