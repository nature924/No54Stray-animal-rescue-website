package com.entity.vo;

import com.entity.ChongwushenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 动物领养审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwushenhe")
public class ChongwushenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show3 photoShow
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
	 * 设置：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
