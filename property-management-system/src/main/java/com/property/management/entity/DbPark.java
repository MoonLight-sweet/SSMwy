package com.property.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DbPark {

  private long id;
  private long zid;
  private String parkNum;
  private String parkName;
  private java.sql.Timestamp craterTime;
  private long state;




}
