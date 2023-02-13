package com.wj.mall.pms.dao;

import com.wj.mall.pms.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:52:57
 */
@Mapper
public interface PmsCategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
