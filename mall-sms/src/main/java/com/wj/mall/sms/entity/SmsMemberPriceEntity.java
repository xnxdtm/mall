package com.wj.mall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品会员价格
 * 
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:49:53
 */
@Data
@TableName("sms_member_price")
public class SmsMemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 会员等级id
	 */
	private Long memberLevelId;
	/**
	 * 会员等级名
	 */
	private String memberLevelName;
	/**
	 * 会员对应价格
	 */
	private BigDecimal memberPrice;
	/**
	 * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
	 */
	private Integer addOther;

}
