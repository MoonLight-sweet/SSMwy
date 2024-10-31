package com.property.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Owner {

  private long id;
  private long cid;
  private long hid;
  private String oname;
  private String picture;
  private String idcard;
  private String telephone;
  private String profession;
  private long sex;
  private long type;
  private String remark;
  private Date createTime;
  private String birthday;


  private Home home;

  private Community community;






}
