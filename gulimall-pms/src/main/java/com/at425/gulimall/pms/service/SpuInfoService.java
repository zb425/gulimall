package com.at425.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.at425.gulimall.pms.entity.SpuInfoEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * spu信息
 *
 * @author zhangbin
 * @email zhangbin@416.com
 * @date 2020-02-25 14:21:34
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

