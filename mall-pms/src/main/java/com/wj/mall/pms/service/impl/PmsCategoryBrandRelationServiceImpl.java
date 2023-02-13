package com.wj.mall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.Query;
import com.wj.mall.pms.dao.PmsCategoryBrandRelationDao;
import com.wj.mall.pms.entity.CategoryBrandRelationEntity;
import com.wj.mall.pms.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("pmsCategoryBrandRelationService")
public class PmsCategoryBrandRelationServiceImpl extends ServiceImpl<PmsCategoryBrandRelationDao, CategoryBrandRelationEntity> implements PmsCategoryBrandRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandRelationEntity> page = this.page(
                new Query<CategoryBrandRelationEntity>().getPage(params),
                new QueryWrapper<CategoryBrandRelationEntity>()
        );

        return new PageUtils(page);
    }

}