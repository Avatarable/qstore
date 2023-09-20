package com.interswitch.qstoreecrservice;

import lombok.Data;

@Data
public class Merchant {
    private Long sn;
    private String merchantId;
    private String name;
    private String status;
    private String createTime;
    private String createBy;
    private String updateTime;
    private String updateBy;
}
