package com.property.management.service.impl;

import com.property.management.entity.Building;
import com.property.management.entity.Community;
import com.property.management.mapper.BuildingMapper;
import com.property.management.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingMapper buildingMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Building> query(String buildingName, String startTime, String endTime) {
        return buildingMapper.query(buildingName,startTime,endTime);
    }

    @Override
    @Transactional(readOnly = true)
    public Long queryCount(String buildingName, String startTime, String endTime) {
        return buildingMapper.queryCount(buildingName,startTime,endTime);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Community> queryCommunityInfo(Object o) {
        return buildingMapper.queryCommunityInfo(o);
    }

    @Override
    @Transactional
    public Integer insertBuilding(Building building) {
        return buildingMapper.insertBuilding(building);
    }

    @Override
    @Transactional
    public Integer deleteBuildingById(Integer id) {
        return  buildingMapper.deleteBuildingById(id);
    }

    @Override
    @Transactional
    public Integer deleteBuildingByIds(String ids) {
        return buildingMapper.deleteBuildingByIds(ids);
    }

    @Override
    @Transactional(readOnly = true)
    public Building queryById(Integer id) {
        return buildingMapper.queryById(id);
    }

    @Override
    @Transactional
    public Integer buildingUpdate(Building building) {
        return buildingMapper.buildingUpdate(building);
    }
}
