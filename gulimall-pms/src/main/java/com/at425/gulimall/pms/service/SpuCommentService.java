package com.at425.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.at425.gulimall.pms.entity.SpuCommentEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author zhangbin
 * @email zhangbin@416.com
 * @date 2020-02-25 14:21:34
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

