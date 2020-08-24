package com.example.demo.Mapper;

import com.example.demo.Gentity.DonateOrg;

public interface DonateOrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DonateOrg record);

    int insertSelective(DonateOrg record);

    DonateOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DonateOrg record);

    int updateByPrimaryKey(DonateOrg record);
}