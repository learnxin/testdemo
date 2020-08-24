package com.example.demo.Mapper;

import com.example.demo.Gentity.PresentRelevance;

public interface PresentRelevanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PresentRelevance record);

    int insertSelective(PresentRelevance record);

    PresentRelevance selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PresentRelevance record);

    int updateByPrimaryKey(PresentRelevance record);
}