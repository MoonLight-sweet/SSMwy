package com.property.management.service.impl;

import com.property.management.entity.ActiveEntity;
import com.property.management.mapper.ActiveMapper;
import com.property.management.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActiveServiceImpl implements ActiveService {
    @Autowired
    private ActiveMapper activeMapper;
    @Override
    @Transactional(readOnly = true)
    public List<ActiveEntity> selectAll(String activeName) {
        return activeMapper.selectAll(activeName);
    }

    @Override
    @Transactional
    public boolean deleteOne(Integer id) {
        Long i = activeMapper.deleteOne(id);
        return i>0;
    }

    @Override
    @Transactional
    public boolean addOne(ActiveEntity activeEntity) {
        Long i = activeMapper.addOne(activeEntity);
        return i>0;
    }

    @Override
    @Transactional
    public boolean updateOne(ActiveEntity activeEntity) {
        Long i = activeMapper.updateOne(activeEntity);
        return i>0;
    }

    @Override
    @Transactional(readOnly = true)
    public ActiveEntity selectId(Integer id) {
        ActiveEntity i = activeMapper.selectId(id);
        return i;
    }

    @Override
    @Transactional
    public Long deleteById(int parseInt) {
        Long i = activeMapper.deleteById(parseInt);
        return i;
    }

    @Override
    @Transactional(readOnly = true)
    public Integer selectCount(String activeName) {
        return activeMapper.selectCount(activeName);
    }
}
