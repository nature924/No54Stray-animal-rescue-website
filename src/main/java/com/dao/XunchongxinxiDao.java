package com.dao;

import com.entity.XunchongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XunchongxinxiView;

/**
 * 寻宠请求 Dao 接口
 *
 * @author 
 */
public interface XunchongxinxiDao extends BaseMapper<XunchongxinxiEntity> {

   List<XunchongxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
