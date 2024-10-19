package com.entity.model;

import com.entity.ChongwushenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 动物领养审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwushenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 动物领养
     */
    private Integer chongwuId;


    /**
     * 领养用户
     */
    private Integer yonghuId;


    /**
     * 认领凭据
     */
    private String chongwushenheText;


    /**
     * 申请状态
     */
    private Integer chongwushenheYesnoTypes;


    /**
     * 申请结果
     */
    private String chongwushenheYesnoText;


    /**
     * 创建时间 show3 photoShow
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
	 * 获取：动物领养
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 设置：动物领养
	 */
    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 获取：领养用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：领养用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：认领凭据
	 */
    public String getChongwushenheText() {
        return chongwushenheText;
    }


    /**
	 * 设置：认领凭据
	 */
    public void setChongwushenheText(String chongwushenheText) {
        this.chongwushenheText = chongwushenheText;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getChongwushenheYesnoTypes() {
        return chongwushenheYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setChongwushenheYesnoTypes(Integer chongwushenheYesnoTypes) {
        this.chongwushenheYesnoTypes = chongwushenheYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getChongwushenheYesnoText() {
        return chongwushenheYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setChongwushenheYesnoText(String chongwushenheYesnoText) {
        this.chongwushenheYesnoText = chongwushenheYesnoText;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
