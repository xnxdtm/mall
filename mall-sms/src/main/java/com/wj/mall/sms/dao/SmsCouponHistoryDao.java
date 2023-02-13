package com.wj.mall.sms.dao;

import com.wj.mall.sms.entity.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:49:57
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryEntity> {
	
}
