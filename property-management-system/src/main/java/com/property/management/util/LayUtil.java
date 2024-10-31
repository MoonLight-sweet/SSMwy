package com.property.management.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LayUtil {
    private String code;
    private String msg;
    private Long count;
    private Object data;
}
