package com.example.demo.Mapper;

import com.example.demo.Gentity.WorkOrderDetails;

public interface WorkOrderDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkOrderDetails record);

    int insertSelective(WorkOrderDetails record);

    WorkOrderDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkOrderDetails record);

    int updateByPrimaryKey(WorkOrderDetails record);
}