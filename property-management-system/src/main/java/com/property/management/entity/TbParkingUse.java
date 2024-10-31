package com.property.management.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbParkingUse {

  private long id;
  private String cid;
  private String aid;
  private String carNumber;
  private String ownerName;
  private String telephone;
  private String useType;
  private double money;
  private Date startTime;
  private Date endTime;
  private Date createTime;
  private Community community;
  private  DbPark dbPark;


}
