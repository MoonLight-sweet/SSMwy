package com.property.management.mapper;

import com.property.management.entity.RepairEntity;

import java.util.List;

public interface RepairMapper {
    List<RepairEntity> selectAll(String repairName);

    Integer selectCount(String repairName);

    Integer deleteOne(Integer id);

    Integer addOne(RepairEntity activeEntity);

    Integer updateOne(RepairEntity repairEntity);

    RepairEntity selectId(Integer id);

    Integer deleteById(int parseInt);
}
