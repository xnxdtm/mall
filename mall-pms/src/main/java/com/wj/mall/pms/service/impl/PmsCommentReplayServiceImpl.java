package com.wj.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.Query;

import com.wj.mall.pms.dao.PmsCommentReplayDao;
import com.wj.mall.pms.entity.CommentReplayEntity;
import com.wj.mall.pms.service.PmsCommentReplayService;


@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayDao, CommentReplayEntity> implements PmsCommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}