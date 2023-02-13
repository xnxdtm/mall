package com.wj.mall.oms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mall.common.utils.PageUtils;
import com.wj.mall.common.utils.Query;
import com.wj.mall.oms.dao.OmsOrderDao;
import com.wj.mall.oms.entity.OmsOrderEntity;
import com.wj.mall.oms.service.OmsOrderService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrderEntity> implements OmsOrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderEntity> page = this.page(
                new Query<OmsOrderEntity>().getPage(params),
                new QueryWrapper<OmsOrderEntity>()
        );

        return new PageUtils(page);
    }

}