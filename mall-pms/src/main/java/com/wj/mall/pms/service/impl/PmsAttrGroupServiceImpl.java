package com.wj.mall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.Query;
import com.wj.mall.pms.dao.PmsAttrGroupDao;
import com.wj.mall.pms.entity.AttrGroupEntity;
import com.wj.mall.pms.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl extends ServiceImpl<PmsAttrGroupDao, AttrGroupEntity> implements PmsAttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}