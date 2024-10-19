package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwushenheEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 动物领养审核 服务类
 */
public interface ChongwushenheService extends IService<ChongwushenheEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}