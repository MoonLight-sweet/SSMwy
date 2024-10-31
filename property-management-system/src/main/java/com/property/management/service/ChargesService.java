package com.property.management.service;

import com.property.management.entity.Charge;
import com.property.management.entity.Community;

import java.util.List;

public interface ChargesService {
    List<Charge> queryByName(String chargeName, String startTime, String endTime);

    Long queryByNameCount(String chargeName, String startTime, String endTime);

    List<Charge> queryById(String id);

    boolean updateCharge(Charge charge);

    List<Community> queryCommunityInfo();

    boolean chargeInsert(Charge charge);

    Boolean deleteChargeById(Integer id);

    Boolean deletedChargeByIds(String ids);
}
