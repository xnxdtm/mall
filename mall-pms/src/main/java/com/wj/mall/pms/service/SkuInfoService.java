package com.wj.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.pms.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:38:27
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

