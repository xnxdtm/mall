package com.wj.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.sms.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:30:24
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

