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

import com.wj.mall.pms.entity.SpuCommentEntity;
import com.wj.mall.pms.service.PmsSpuCommentService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.R;



/**
 * 商品评价
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:52:52
 */
@RestController
@RequestMapping("pms/pmsspucomment")
public class PmsSpuCommentController {
    @Autowired
    private PmsSpuCommentService pmsSpuCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("pms:pmsspucomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("pms:pmsspucomment:info")
    public R info(@PathVariable("id") Long id){
		SpuCommentEntity pmsSpuComment = pmsSpuCommentService.getById(id);

        return R.ok().put("pmsSpuComment", pmsSpuComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmsspucomment:save")
    public R save(@RequestBody SpuCommentEntity pmsSpuComment){
		pmsSpuCommentService.save(pmsSpuComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmsspucomment:update")
    public R update(@RequestBody SpuCommentEntity pmsSpuComment){
		pmsSpuCommentService.updateById(pmsSpuComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmsspucomment:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
