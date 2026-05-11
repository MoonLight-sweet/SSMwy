package com.property.management.service.impl;

import com.property.management.entity.Community;
import com.property.management.entity.Park;
import com.property.management.mapper.ParkMapper;
import com.property.management.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ParkServiceImpl implements ParkService {

    @Autowired
    private ParkMapper parkMapper;


    @Override
    @Transactional(readOnly = true)
    public List<Community> queryCommunityInfo(Integer id) {
        return parkMapper.queryCommunityInfo(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Park> queryByName(String parkName, String startTime, String endTime) {
        return parkMapper.queryByName(parkName, startTime, endTime);
    }


    @Override
    @Transactional(readOnly = true)
    public Long queryByNameCount(String parkName, String startTime, String endTime) {
        return parkMapper.queryByNameCount(parkName, startTime, endTime);
    }

    @Override
    @Transactional
    public Boolean deleteById(Integer id) {
        return parkMapper.deleteById(id);
    }

    @Override
    @Transactional
    public Boolean deleteByIds(String ids) {
        return parkMapper.deleteByIds(ids);
    }

    @Override
    @Transactional
    public boolean insertInfo(Park park) {
        return parkMapper.insertInfo(park);
    }

    @Override
    @Transactional(readOnly = true)
    public Community queryById(Integer id) {
        return parkMapper.queryById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Park queryId(Integer id) {
        return parkMapper.queryId(id);
    }

    @Override
    @Transactional
    public Boolean updatePark(Park park) {
        return parkMapper.updatePark(park);
    }


}
