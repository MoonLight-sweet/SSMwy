package com.property.management.service;

import com.property.management.entity.Community;

import java.util.List;


public interface CommunityService {

     Integer insertInfo(Community community);

    List<Community> queryByName(String communityName, String startTime, String endTime);

    Long queryByNameCount(String communityName, String startTime, String endTime);

    Community queryById(Integer id);

    Boolean deleteById(Integer id);

    Boolean deleteCommunityByIds(String ids);

    Boolean updateCommunity(Community community);

}
