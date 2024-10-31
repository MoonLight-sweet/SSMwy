package com.property.management.mapper;

import com.property.management.entity.Community;
import com.property.management.entity.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeciveMapper {
    List<Device> queryByName(@Param("conmunityName") String conmunityName, @Param("startTime") String startTime, @Param("endTime") String endTime);

    Long queryByNameCount(@Param("conmunityName") String conmunityName, @Param("startTime") String startTime, @Param("endTime") String endTime);

    Device queryById(String id);

    int updateDecive(Device device);

    List<Community> queryCommunityInfo();

    int insertDecive(Device device);

    int deleteDeciveById(Integer id);

    int deletedDeciveByIds(String ids);
}
