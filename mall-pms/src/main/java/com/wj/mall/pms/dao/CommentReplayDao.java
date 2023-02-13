package com.wj.mall.pms.dao;

import com.wj.mall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:38:20
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
