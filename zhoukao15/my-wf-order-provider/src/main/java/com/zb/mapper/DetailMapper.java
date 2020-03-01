package com.zb.mapper;

import com.zb.entity.Detail;
import com.zb.entity.Houseinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DetailMapper {
    public List<Detail> getAll(@Param("projectId") Integer projectId);

    int add(Detail detail);




}
