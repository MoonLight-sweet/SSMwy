package com.property.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
  private long id;
  private String username;
  private String realname;
  private String password;
  private String phone;
  private String email;
  private Date hiredate;
  private long type;
  private String img;
  private long available;
}
