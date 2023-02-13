package com.wj.mall.pms.dao;

import com.wj.mall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:38:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
