package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XunchongxinxiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 寻宠请求 服务类
 */
public interface XunchongxinxiService extends IService<XunchongxinxiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}