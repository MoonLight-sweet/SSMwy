package com.property.management.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class Charge {

  private long id;
  private String communituName;
  private String chargeNum;
  private String chargeName;
  private Date createDateTime;

}
