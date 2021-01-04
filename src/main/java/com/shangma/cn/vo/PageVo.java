package com.shangma.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 19:35
 * @Description
 */

@Data
public class PageVo<T> {

    private long total;
    private List<T> list;

}
