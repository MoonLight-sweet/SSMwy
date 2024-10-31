package com.property.management.mapper;

import com.property.management.entity.ActiveEntity;

import java.util.List;

public interface ActiveMapper {
    List<ActiveEntity> selectAll(String activeName);
    Long deleteOne(Integer id);
    Long addOne(ActiveEntity activeEntity);
    Long updateOne(ActiveEntity activeEntity);

    ActiveEntity selectId(Integer id);

    Long deleteById(int parseInt);

    Integer selectCount(String activeName);
}
