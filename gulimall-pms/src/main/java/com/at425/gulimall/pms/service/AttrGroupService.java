package com.at425.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.at425.gulimall.pms.entity.AttrGroupEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author zhangbin
 * @email zhangbin@416.com
 * @date 2020-02-25 14:21:34
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

