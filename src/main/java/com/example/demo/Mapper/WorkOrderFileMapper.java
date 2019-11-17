package com.example.demo.Mapper;

import com.example.demo.Gentity.WorkOrderFile;

public interface WorkOrderFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkOrderFile record);

    int insertSelective(WorkOrderFile record);

    WorkOrderFile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkOrderFile record);

    int updateByPrimaryKey(WorkOrderFile record);
}