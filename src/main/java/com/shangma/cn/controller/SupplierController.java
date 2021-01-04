package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 20:37
 * @Description
 */

@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    private BaseService<Supplier,Long> baseService;

    @GetMapping
    public AxiosResult<PageVo<Supplier>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                                  @RequestParam(defaultValue = "5") int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        return AxiosResult.success(baseService.findPage());
    }

    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable Long id){
        return AxiosResult.success(baseService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier t){
        return toAxios(baseService.addEntity(t));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier t){
        return toAxios(baseService.updateEntity(t));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id){
        return toAxios(baseService.deleteById(id));
    }

    public AxiosResult<Void> toAxios(int row){
        return row > 0?AxiosResult.success():AxiosResult.error();
    }
}
