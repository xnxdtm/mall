package com.wj.mall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.Query;

import com.wj.mall.pms.dao.PmsAttrAttrgroupRelationDao;
import com.wj.mall.pms.entity.PmsAttrAttrgroupRelationEntity;
import com.wj.mall.pms.service.PmsAttrAttrgroupRelationService;


@Service("pmsAttrAttrgroupRelationService")
public class PmsAttrAttrgroupRelationServiceImpl extends ServiceImpl<PmsAttrAttrgroupRelationDao, PmsAttrAttrgroupRelationEntity> implements PmsAttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrAttrgroupRelationEntity> page = this.page(
                new Query<PmsAttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<PmsAttrAttrgroupRelationEntity>()
        );

        return new PageUtils(page);
    }

}