package com.property.management.service.impl;

import com.property.management.entity.ComplainEntity;
import com.property.management.mapper.ComplainMapper;
import com.property.management.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ComplainServiceImpl implements ComplainService {
    @Autowired
    private ComplainMapper complainMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ComplainEntity> selectAll(String complainName) {
        return complainMapper.selectAll(complainName);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer selectCount(String complainName) {
        return complainMapper.selectCount(complainName);
    }

    @Override
    @Transactional
    public boolean deleteOne(Integer id) {
        Integer i = complainMapper.deleteOne(id);
        return i>0;
    }

    @Override
    @Transactional
    public boolean addOne(ComplainEntity complainEntity) {
        Integer i = complainMapper.addOne(complainEntity);
        return i>0;
    }

    @Override
    @Transactional(readOnly = true)
    public ComplainEntity selectId(Integer id) {
        return complainMapper.selectId(id);
    }

    @Override
    @Transactional
    public boolean updateOne(ComplainEntity complainEntity) {
        Integer i = complainMapper.updateOne(complainEntity);
        return i>0;
    }

    @Override
    @Transactional
    public Long deleteById(int parseInt) {
        Integer i = complainMapper.deleteById(parseInt);
        return Long.valueOf(i);
    }
}
