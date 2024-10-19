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
 * 动物领养/捐赠
 *
 * @author 
 * @email
 */
@TableName("chongwu")
public class ChongwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuEntity() {

	}

	public ChongwuEntity(T t) {
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
     * 标题
     */
    @TableField(value = "chongwu_name")

    private String chongwuName;


    /**
     * 动物类型
     */
    @TableField(value = "chongwu_types")

    private Integer chongwuTypes;


    /**
     * 数据类型
     */
    @TableField(value = "status_types")

    private Integer statusTypes;


    /**
     * 动物图片
     */
    @TableField(value = "chongwu_photo")

    private String chongwuPhoto;


    /**
     * 已获捐数值
     */
    @TableField(value = "chongwu_money")

    private Double chongwuMoney;


    /**
     * 认领状态
     */
    @TableField(value = "jieshu_types")

    private Integer jieshuTypes;


    /**
     * 动物详情
     */
    @TableField(value = "chongwu_content")

    private String chongwuContent;


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
	 * 设置：标题
	 */
    public String getChongwuName() {
        return chongwuName;
    }
    /**
	 * 获取：标题
	 */

    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 设置：动物类型
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }
    /**
	 * 获取：动物类型
	 */

    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 设置：数据类型
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }
    /**
	 * 获取：数据类型
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 设置：动物图片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }
    /**
	 * 获取：动物图片
	 */

    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 设置：已获捐数值
	 */
    public Double getChongwuMoney() {
        return chongwuMoney;
    }
    /**
	 * 获取：已获捐数值
	 */

    public void setChongwuMoney(Double chongwuMoney) {
        this.chongwuMoney = chongwuMoney;
    }
    /**
	 * 设置：认领状态
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }
    /**
	 * 获取：认领状态
	 */

    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 设置：动物详情
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }
    /**
	 * 获取：动物详情
	 */

    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
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
        return "Chongwu{" +
            "id=" + id +
            ", chongwuName=" + chongwuName +
            ", chongwuTypes=" + chongwuTypes +
            ", statusTypes=" + statusTypes +
            ", chongwuPhoto=" + chongwuPhoto +
            ", chongwuMoney=" + chongwuMoney +
            ", jieshuTypes=" + jieshuTypes +
            ", chongwuContent=" + chongwuContent +
            ", createTime=" + createTime +
        "}";
    }
}
