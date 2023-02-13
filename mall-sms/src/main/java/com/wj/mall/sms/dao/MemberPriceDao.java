package com.wj.mall.sms.dao;

import com.wj.mall.sms.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:30:24
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
