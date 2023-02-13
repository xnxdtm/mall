package com.wj.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.wms.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-10 19:54:36
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

