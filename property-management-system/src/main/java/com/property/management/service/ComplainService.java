package com.property.management.service;

import com.property.management.entity.ComplainEntity;

import java.util.List;

public interface ComplainService {
    List<ComplainEntity> selectAll(String complainName);

    Integer selectCount(String complainName);

    boolean deleteOne(Integer id);

    boolean addOne(ComplainEntity complainEntity);

    ComplainEntity selectId(Integer id);

    boolean updateOne(ComplainEntity complainEntity);

    Long deleteById(int parseInt);
}
