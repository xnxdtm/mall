package com.wj.mall.sms.dao;

import com.wj.mall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:31:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
