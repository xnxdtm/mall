package com.wj.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.pms.entity.PmsSkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:52:57
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
