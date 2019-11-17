package com.example.demo.Mapper;

import com.example.demo.Gentity.WorkOrderTitle;

public interface WorkOrderTitleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkOrderTitle record);

    int insertSelective(WorkOrderTitle record);

    WorkOrderTitle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkOrderTitle record);

    int updateByPrimaryKey(WorkOrderTitle record);
}