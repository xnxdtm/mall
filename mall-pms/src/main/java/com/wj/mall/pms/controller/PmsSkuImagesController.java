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

import com.wj.mall.pms.entity.SkuImagesEntity;
import com.wj.mall.pms.service.PmsSkuImagesService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.R;



/**
 * sku图片
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:52:57
 */
@RestController
@RequestMapping("pms/pmsskuimages")
public class PmsSkuImagesController {
    @Autowired
    private PmsSkuImagesService pmsSkuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("pms:pmsskuimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("pms:pmsskuimages:info")
    public R info(@PathVariable("id") Long id){
		SkuImagesEntity pmsSkuImages = pmsSkuImagesService.getById(id);

        return R.ok().put("pmsSkuImages", pmsSkuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmsskuimages:save")
    public R save(@RequestBody SkuImagesEntity pmsSkuImages){
		pmsSkuImagesService.save(pmsSkuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmsskuimages:update")
    public R update(@RequestBody SkuImagesEntity pmsSkuImages){
		pmsSkuImagesService.updateById(pmsSkuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmsskuimages:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
