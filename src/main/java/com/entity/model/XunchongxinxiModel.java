package com.entity.model;

import com.entity.XunchongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 寻宠请求
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunchongxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String xunchongxinxiName;


    /**
     * 宠物类型
     */
    private Integer chongwuTypes;


    /**
     * 宠物图片
     */
    private String xunchongxinxiPhoto;


    /**
     * 已获捐数值
     */
    private Double xunchongxinxiMoney;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 寻宠状态
     */
    private Integer jieshuTypes;


    /**
     * 宠物详情
     */
    private String xunchongxinxiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getXunchongxinxiName() {
        return xunchongxinxiName;
    }


    /**
	 * 设置：标题
	 */
    public void setXunchongxinxiName(String xunchongxinxiName) {
        this.xunchongxinxiName = xunchongxinxiName;
    }
    /**
	 * 获取：宠物类型
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 设置：宠物类型
	 */
    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 获取：宠物图片
	 */
    public String getXunchongxinxiPhoto() {
        return xunchongxinxiPhoto;
    }


    /**
	 * 设置：宠物图片
	 */
    public void setXunchongxinxiPhoto(String xunchongxinxiPhoto) {
        this.xunchongxinxiPhoto = xunchongxinxiPhoto;
    }
    /**
	 * 获取：已获捐数值
	 */
    public Double getXunchongxinxiMoney() {
        return xunchongxinxiMoney;
    }


    /**
	 * 设置：已获捐数值
	 */
    public void setXunchongxinxiMoney(Double xunchongxinxiMoney) {
        this.xunchongxinxiMoney = xunchongxinxiMoney;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：寻宠状态
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 设置：寻宠状态
	 */
    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 获取：宠物详情
	 */
    public String getXunchongxinxiContent() {
        return xunchongxinxiContent;
    }


    /**
	 * 设置：宠物详情
	 */
    public void setXunchongxinxiContent(String xunchongxinxiContent) {
        this.xunchongxinxiContent = xunchongxinxiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
