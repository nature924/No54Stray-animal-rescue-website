package com.entity.model;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 动物领养/捐赠
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String chongwuName;


    /**
     * 动物类型
     */
    private Integer chongwuTypes;


    /**
     * 数据类型
     */
    private Integer statusTypes;


    /**
     * 动物图片
     */
    private String chongwuPhoto;


    /**
     * 已获捐数值
     */
    private Double chongwuMoney;


    /**
     * 认领状态
     */
    private Integer jieshuTypes;


    /**
     * 动物详情
     */
    private String chongwuContent;


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
    public String getChongwuName() {
        return chongwuName;
    }


    /**
	 * 设置：标题
	 */
    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 获取：动物类型
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 设置：动物类型
	 */
    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 获取：数据类型
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 设置：数据类型
	 */
    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 获取：动物图片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }


    /**
	 * 设置：动物图片
	 */
    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 获取：已获捐数值
	 */
    public Double getChongwuMoney() {
        return chongwuMoney;
    }


    /**
	 * 设置：已获捐数值
	 */
    public void setChongwuMoney(Double chongwuMoney) {
        this.chongwuMoney = chongwuMoney;
    }
    /**
	 * 获取：认领状态
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 设置：认领状态
	 */
    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 获取：动物详情
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }


    /**
	 * 设置：动物详情
	 */
    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
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
