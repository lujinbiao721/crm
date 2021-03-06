package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Category;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 20:05
 * @Description
 */

@Service
@Transactional
public class SupplierServiceImpl extends BaseServiceImpl<Supplier,Long> implements SupplierService {
}
