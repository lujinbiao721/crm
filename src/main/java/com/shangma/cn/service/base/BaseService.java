package com.shangma.cn.service.base;

import com.shangma.cn.vo.PageVo;

import java.util.List;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 19:31
 * @Description
 */

public interface BaseService<T,ID> {

    /**
     * 查询全部
     */
    PageVo<T> findPage();

    /**
     * 有条件查询
     */
    PageVo<T> findPage(Object example);

    /**
     * 根据id查询
     */
    T findById(ID id);

    /**
     * 增加
     */
    int addEntity(T t);

    /**
     * 修改
     */
    int updateEntity(T t);

    /**
     * 删除
     */
    int deleteById(ID id);

    /**
     * 批量添加
     */
    int batchAddEntity(List<T> list);

    /**
     * 批量修改
     */
    int batchUpdateEntity(List<T> list);

    /**
     * 批量添加
     */
    int batchDeleteEntity(List<ID> ids);

    /**
     * 封装分页数据
     */
    PageVo<T> setPageVo(List<T> list);
}
