package com.dao;

import com.entity.ChongwushenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwushenheView;

/**
 * 动物领养审核 Dao 接口
 *
 * @author 
 */
public interface ChongwushenheDao extends BaseMapper<ChongwushenheEntity> {

   List<ChongwushenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
