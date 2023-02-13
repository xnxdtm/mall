package com.wj.mall.oms.dao;

import com.wj.mall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:42:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
