package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 19:21
 * @Description
 */

@Data
public class BaseEntity {

    private Long id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

}
