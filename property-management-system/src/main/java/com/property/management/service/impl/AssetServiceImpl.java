package com.property.management.service.impl;

import com.property.management.entity.Asset;
import com.property.management.entity.Charge;
import com.property.management.mapper.AssetMapper;
import com.property.management.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("assetService")
public class AssetServiceImpl implements AssetService {
    @Autowired
    private AssetMapper assetMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Asset> queryByName(String rateName, String startTime, String endTime) {
        return assetMapper.queryByName(rateName,startTime,endTime);
    }

    @Override
    @Transactional(readOnly = true)
    public Long queryByNameCount(String rateName, String startTime, String endTime) {
        return assetMapper.queryByNameCount(rateName,startTime,endTime);
    }

    @Override
    @Transactional
    public Boolean deleteAssetById(Integer id) {
        int line = assetMapper.deleteAssetById(id);
        return line>0;
    }

    @Override
    @Transactional
    public Boolean deleteAssetByIds(String ids) {
        int line = assetMapper.deleteAssetByIds(ids);
        return line>0;
    }

    @Override
    @Transactional(readOnly = true)
    public Asset queryAssetInfoById(Integer id) {
        return assetMapper.queryAssetInfoById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Charge> qyeryAll() {
        return assetMapper.queryAll();
    }

    @Override
    @Transactional
    public Boolean updateAsset(Asset asset) {
        int line = assetMapper.updateAsset(asset);
        return line>0;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Charge> selectRate(String cName) {
        return assetMapper.selectRate(cName);
    }

    @Override
    @Transactional
    public boolean insertAsset(Asset asset) {
       int line =  assetMapper.insertAsset(asset);
        return line>0;
    }
}
