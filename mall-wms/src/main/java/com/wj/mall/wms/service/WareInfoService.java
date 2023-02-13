package com.wj.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.wms.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wj
 * @email xnxdtm@gmail.com
 * @date 2023-02-13 16:15:23
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

