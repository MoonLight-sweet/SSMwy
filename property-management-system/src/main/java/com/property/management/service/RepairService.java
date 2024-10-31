package com.property.management.service;

import com.property.management.entity.RepairEntity;

import java.util.List;

public interface RepairService {
    List<RepairEntity> selectAll(String repairName);

    Integer selectCount(String repairName);

    boolean deleteOne(Integer id);

    boolean addOne(RepairEntity repairEntity);

    RepairEntity selectId(Integer id);

    boolean updateOne(RepairEntity repairEntity);

    Long deleteById(int parseInt);
}
