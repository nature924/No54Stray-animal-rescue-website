package com.entity.vo;

import com.entity.XunchongxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 寻宠请求
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xunchongxinxi")
public class XunchongxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "xunchongxinxi_name")
    private String xunchongxinxiName;


    /**
     * 宠物类型
     */

    @TableField(value = "chongwu_types")
    private Integer chongwuTypes;


    /**
     * 宠物图片
     */

    @TableField(value = "xunchongxinxi_photo")
    private String xunchongxinxiPhoto;


    /**
     * 已获捐数值
     */

    @TableField(value = "xunchongxinxi_money")
    private Double xunchongxinxiMoney;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 寻宠状态
     */

    @TableField(value = "jieshu_types")
    private Integer jieshuTypes;


    /**
     * 宠物详情
     */

    @TableField(value = "xunchongxinxi_content")
    private String xunchongxinxiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
    public String getXunchongxinxiName() {
        return xunchongxinxiName;
    }


    /**
	 * 获取：标题
	 */

    public void setXunchongxinxiName(String xunchongxinxiName) {
        this.xunchongxinxiName = xunchongxinxiName;
    }
    /**
	 * 设置：宠物类型
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 获取：宠物类型
	 */

    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 设置：宠物图片
	 */
    public String getXunchongxinxiPhoto() {
        return xunchongxinxiPhoto;
    }


    /**
	 * 获取：宠物图片
	 */

    public void setXunchongxinxiPhoto(String xunchongxinxiPhoto) {
        this.xunchongxinxiPhoto = xunchongxinxiPhoto;
    }
    /**
	 * 设置：已获捐数值
	 */
    public Double getXunchongxinxiMoney() {
        return xunchongxinxiMoney;
    }


    /**
	 * 获取：已获捐数值
	 */

    public void setXunchongxinxiMoney(Double xunchongxinxiMoney) {
        this.xunchongxinxiMoney = xunchongxinxiMoney;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：寻宠状态
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 获取：寻宠状态
	 */

    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 设置：宠物详情
	 */
    public String getXunchongxinxiContent() {
        return xunchongxinxiContent;
    }


    /**
	 * 获取：宠物详情
	 */

    public void setXunchongxinxiContent(String xunchongxinxiContent) {
        this.xunchongxinxiContent = xunchongxinxiContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
