package com.wj.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.wms.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:54:36
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

