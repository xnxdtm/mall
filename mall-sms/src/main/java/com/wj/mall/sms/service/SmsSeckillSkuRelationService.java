package com.wj.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.sms.entity.SmsSeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:49:53
 */
public interface SmsSeckillSkuRelationService extends IService<SmsSeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

