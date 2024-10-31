package com.property.management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor@Data
@Builder
public class Park {
    private long id;
    private long zid;
    private String parkNum;
    private String parkName;
    private Date craterTime;
    private long state;
    private Community community;
}
