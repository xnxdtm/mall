package com.wj.mall.sms.dao;

import com.wj.mall.sms.entity.SmsCouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:49:57
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
