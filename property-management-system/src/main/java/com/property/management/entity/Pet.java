package com.property.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

  private long id;
  private String picture;
  private long oid;
  private String name;
  private String color;
  private String remark;
//  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private String adoptTime;
  private Owner owner;



}
