package com.wj.mall.ums.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wj.mall.ums.entity.UmsMemberCollectSubjectEntity;
import com.wj.mall.ums.service.UmsMemberCollectSubjectService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.R;



/**
 * 会员收藏的专题活动
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:53:47
 */
@RestController
@RequestMapping("ums/umsmembercollectsubject")
public class UmsMemberCollectSubjectController {
    @Autowired
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("ums:umsmembercollectsubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberCollectSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("ums:umsmembercollectsubject:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberCollectSubjectEntity umsMemberCollectSubject = umsMemberCollectSubjectService.getById(id);

        return R.ok().put("umsMemberCollectSubject", umsMemberCollectSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("ums:umsmembercollectsubject:save")
    public R save(@RequestBody UmsMemberCollectSubjectEntity umsMemberCollectSubject){
		umsMemberCollectSubjectService.save(umsMemberCollectSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("ums:umsmembercollectsubject:update")
    public R update(@RequestBody UmsMemberCollectSubjectEntity umsMemberCollectSubject){
		umsMemberCollectSubjectService.updateById(umsMemberCollectSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("ums:umsmembercollectsubject:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberCollectSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}