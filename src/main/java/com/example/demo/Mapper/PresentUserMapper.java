package com.example.demo.Mapper;

import com.example.demo.Gentity.PresentUser;

public interface PresentUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PresentUser record);

    int insertSelective(PresentUser record);

    PresentUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PresentUser record);

    int updateByPrimaryKey(PresentUser record);
}