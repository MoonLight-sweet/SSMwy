package com.property.management.service;

import com.property.management.entity.Community;
import com.property.management.entity.Device;

import java.util.List;

public interface DeciveService{
    List<Device> queryByName(String conmunityName, String startTime, String endTime);

    Long queryByNameCount(String conmunityName, String startTime, String endTime);

    Device queryById(String id);

    Boolean updateDecive(Device device);

    List<Community> queryCommunityInfo();

    Boolean insertDecive(Device device);

    Boolean deleteDeciveById(Integer id);

    Boolean deletedDeciveByIds(String ids);
}
