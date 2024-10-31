package com.property.management.service;

import com.property.management.entity.ActiveEntity;

import java.util.List;

public interface ActiveService {
    List<ActiveEntity> selectAll(String activeName);

    boolean deleteOne(Integer id);

    boolean addOne(ActiveEntity activeEntity);

    boolean updateOne(ActiveEntity activeEntity);

    ActiveEntity selectId(Integer id);

    Long deleteById(int parseInt);

    Integer selectCount(String activeName);
}
