package com.property.management.service;

import com.property.management.entity.Owner;
import com.property.management.entity.Pet;
import com.property.management.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class PetServiceImpl implements PetService{
    @Autowired
    private PetMapper petMapper;

    //查询所有宠物
    @Override
    @Transactional(readOnly = true)
    public List<Pet> query(String petName, String startTime, String endTime) {
        return petMapper.selectAllPet(petName,startTime,endTime);
    }
    //查询宠物总条数
    @Override
    @Transactional(readOnly = true)
    public Long queryCount(String petName, String startTime, String endTime) {
        return petMapper.selectAllCount(petName,startTime,endTime);
    }

    @Override
    @Transactional
    public Boolean deleteById(Integer id) {
        return petMapper.deleteById(id);
    }

    @Override
    @Transactional
    public Boolean deleteByIds(String ids) {
        return petMapper.deleteByIds(ids);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Owner> queryOwnerInfo(Integer id) {
        return petMapper.queryOwner(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Pet queryPetById(Integer id) {
        return petMapper.queryPetById(id);
    }

    @Override
    @Transactional
    public Boolean insert(Pet pet) {
        return petMapper.insert(pet);
    }

    @Override
    @Transactional
    public Boolean update(Pet pet) {
        return petMapper.update(pet);
    }


}
