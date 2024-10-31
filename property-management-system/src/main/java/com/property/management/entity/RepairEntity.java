package com.property.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepairEntity {
    private Integer id;
    private String xiaoQu;
    private String repairPersonnel;
    private String repairThing;
    private String repairDescription;
    private Date creatTime;
    private String state;
}
