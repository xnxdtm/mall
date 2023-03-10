package com.wj.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.pms.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:38:27
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

