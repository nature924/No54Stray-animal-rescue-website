package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 动物领养审核
 *
 * @author 
 * @email
 */
@TableName("chongwushenhe")
public class ChongwushenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwushenheEntity() {

	}

	public ChongwushenheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 动物领养
     */
    @TableField(value = "chongwu_id")

    private Integer chongwuId;


    /**
     * 领养用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 认领凭据
     */
    @TableField(value = "chongwushenhe_text")

    private String chongwushenheText;


    /**
     * 申请状态
     */
    @TableField(value = "chongwushenhe_yesno_types")

    private Integer chongwushenheYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "chongwushenhe_yesno_text")

    private String chongwushenheYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：动物领养
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }
    /**
	 * 获取：动物领养
	 */

    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 设置：领养用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：领养用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：认领凭据
	 */
    public String getChongwushenheText() {
        return chongwushenheText;
    }
    /**
	 * 获取：认领凭据
	 */

    public void setChongwushenheText(String chongwushenheText) {
        this.chongwushenheText = chongwushenheText;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getChongwushenheYesnoTypes() {
        return chongwushenheYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setChongwushenheYesnoTypes(Integer chongwushenheYesnoTypes) {
        this.chongwushenheYesnoTypes = chongwushenheYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getChongwushenheYesnoText() {
        return chongwushenheYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setChongwushenheYesnoText(String chongwushenheYesnoText) {
        this.chongwushenheYesnoText = chongwushenheYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwushenhe{" +
            "id=" + id +
            ", chongwuId=" + chongwuId +
            ", yonghuId=" + yonghuId +
            ", chongwushenheText=" + chongwushenheText +
            ", chongwushenheYesnoTypes=" + chongwushenheYesnoTypes +
            ", chongwushenheYesnoText=" + chongwushenheYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
