package com.wj.mall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.Query;
import com.wj.mall.pms.dao.CategoryDao;
import com.wj.mall.pms.entity.CategoryEntity;
import com.wj.mall.pms.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryCategoryWithTree() {
        List<CategoryEntity> categories = baseMapper.selectList(null);
        List<CategoryEntity> list = categories.stream().filter(entity -> entity.getParentCid() == 0)
                .map(entity -> {
                    entity.setChildren(generateCategoryChildren(entity, categories));
                    return entity;
                }).sorted(Comparator.comparingInt(c -> (c.getSort() == null ? 0 : c.getSort())))
                .collect(Collectors.toList());
        return list;
    }

    private List<CategoryEntity> generateCategoryChildren(CategoryEntity parent, List<CategoryEntity> categories) {
        return categories.stream().filter(entity -> entity.getParentCid().equals(parent.getCatId()))
                .map(entity -> {
                    entity.setChildren(generateCategoryChildren(entity, categories));
                    return entity;
                }).sorted(Comparator.comparingInt(c -> (c.getSort() == null ? 0 : c.getSort())))
                .collect(Collectors.toList());
    }

}