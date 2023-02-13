package com.wj.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.sms.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:31:03
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

