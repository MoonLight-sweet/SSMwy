package com.property.management.mapper;

import com.property.management.entity.ComplainEntity;

import java.util.List;

public interface ComplainMapper {
    List<ComplainEntity> selectAll(String complainName);

    Integer selectCount(String complainName);

    Integer deleteOne(Integer id);

    Integer addOne(ComplainEntity complainEntity);

    ComplainEntity selectId(Integer id);

    Integer updateOne(ComplainEntity complainEntity);

    Integer deleteById(int parseInt);
}
