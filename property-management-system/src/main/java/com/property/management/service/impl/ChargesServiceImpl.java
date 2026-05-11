package com.property.management.service.impl;

import com.property.management.entity.Charge;
import com.property.management.entity.Community;
import com.property.management.mapper.ChargesMapper;
import com.property.management.service.ChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("chargesService")
public class ChargesServiceImpl implements ChargesService {
    @Autowired
    private ChargesMapper chargesMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Charge> queryByName(String chargeName, String startTime, String endTime) {
        return chargesMapper.queryByName(chargeName,startTime,endTime);
    }

    @Override
    @Transactional(readOnly = true)
    public Long queryByNameCount(String chargeName, String startTime, String endTime) {
        return chargesMapper.queryByNameCount(chargeName,startTime,endTime);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Charge> queryById(String id) {
        return chargesMapper.queryById(id);
    }

    @Override
    @Transactional
    public boolean updateCharge(Charge charge) {
        int line = chargesMapper.updateCharge(charge);
        return line>0;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Community> queryCommunityInfo() {
        return chargesMapper.queryCommunityInfo();
    }

    @Override
    @Transactional
    public boolean chargeInsert(Charge charge) {
        int line = chargesMapper.chargeInsert(charge);
        return line>0;
    }

    @Override
    @Transactional
    public Boolean deleteChargeById(Integer id) {
        int line  = chargesMapper.deleteChargeById(id);
        return line>0;
    }

    @Override
    @Transactional
    public Boolean deletedChargeByIds(String ids) {
        int line = chargesMapper.deletedChargeByIds(ids);
        return line>0;
    }
}
