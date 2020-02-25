package com.at425.gulimall.pms.dao;

import com.at425.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangbin
 * @email zhangbin@416.com
 * @date 2020-02-25 14:21:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
