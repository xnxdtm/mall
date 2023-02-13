package com.wj.mall.pms.controller;

import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.R;
import com.wj.mall.pms.entity.CommentReplayEntity;
import com.wj.mall.pms.service.PmsCommentReplayService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 商品评价回复关系
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:52:57
 */
@RestController
@RequestMapping("pms/pmscommentreplay")
public class PmsCommentReplayController {
    @Autowired
    private PmsCommentReplayService pmsCommentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("pms:pmscommentreplay:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCommentReplayService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("pms:pmscommentreplay:info")
    public R info(@PathVariable("id") Long id){
		CommentReplayEntity pmsCommentReplay = pmsCommentReplayService.getById(id);

        return R.ok().put("pmsCommentReplay", pmsCommentReplay);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("pms:pmscommentreplay:save")
    public R save(@RequestBody CommentReplayEntity pmsCommentReplay){
		pmsCommentReplayService.save(pmsCommentReplay);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("pms:pmscommentreplay:update")
    public R update(@RequestBody CommentReplayEntity pmsCommentReplay){
		pmsCommentReplayService.updateById(pmsCommentReplay);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("pms:pmscommentreplay:delete")
    public R delete(@RequestBody Long[] ids){
		pmsCommentReplayService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
