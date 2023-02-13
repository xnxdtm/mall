package com.wj.mall.pms.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wj.mall.pms.entity.SpuInfoEntity;
import com.wj.mall.pms.service.PmsSpuInfoService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.R;



/**
 * spu信息
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:52:52
 */
@RestController
@RequestMapping("pms/pmsspuinfo")
public class PmsSpuInfoController {
    @Autowired
    private PmsSpuInfoService pmsSpuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("pms:pmsspuinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("pms:pmsspuinfo:info")
    public R info(@PathVariable("id") Long id){
		SpuInfoEntity pmsSpuInfo = pmsSpuInfoService.getById(id);

        return R.ok().put("pmsSpuInfo", pmsSpuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmsspuinfo:save")
    public R save(@RequestBody SpuInfoEntity pmsSpuInfo){
		pmsSpuInfoService.save(pmsSpuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmsspuinfo:update")
    public R update(@RequestBody SpuInfoEntity pmsSpuInfo){
		pmsSpuInfoService.updateById(pmsSpuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmsspuinfo:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
