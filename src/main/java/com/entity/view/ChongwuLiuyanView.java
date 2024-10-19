package com.entity.view;

import com.entity.ChongwuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 动物留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwu_liuyan")
public class ChongwuLiuyanView extends ChongwuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 chongwu
			/**
			* 标题
			*/
			private String chongwuName;
			/**
			* 动物类型
			*/
			private Integer chongwuTypes;
				/**
				* 动物类型的值
				*/
				private String chongwuValue;
			/**
			* 数据类型
			*/
			private Integer statusTypes;
				/**
				* 数据类型的值
				*/
				private String statusValue;
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
				* 认领状态的值
				*/
				private String jieshuValue;
			/**
			* 动物详情
			*/
			private String chongwuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ChongwuLiuyanView() {

	}

	public ChongwuLiuyanView(ChongwuLiuyanEntity chongwuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set chongwu

					/**
					* 获取： 标题
					*/
					public String getChongwuName() {
						return chongwuName;
					}
					/**
					* 设置： 标题
					*/
					public void setChongwuName(String chongwuName) {
						this.chongwuName = chongwuName;
					}

					/**
					* 获取： 动物类型
					*/
					public Integer getChongwuTypes() {
						return chongwuTypes;
					}
					/**
					* 设置： 动物类型
					*/
					public void setChongwuTypes(Integer chongwuTypes) {
						this.chongwuTypes = chongwuTypes;
					}


						/**
						* 获取： 动物类型的值
						*/
						public String getChongwuValue() {
							return chongwuValue;
						}
						/**
						* 设置： 动物类型的值
						*/
						public void setChongwuValue(String chongwuValue) {
							this.chongwuValue = chongwuValue;
						}

					/**
					* 获取： 数据类型
					*/
					public Integer getStatusTypes() {
						return statusTypes;
					}
					/**
					* 设置： 数据类型
					*/
					public void setStatusTypes(Integer statusTypes) {
						this.statusTypes = statusTypes;
					}


						/**
						* 获取： 数据类型的值
						*/
						public String getStatusValue() {
							return statusValue;
						}
						/**
						* 设置： 数据类型的值
						*/
						public void setStatusValue(String statusValue) {
							this.statusValue = statusValue;
						}

					/**
					* 获取： 动物图片
					*/
					public String getChongwuPhoto() {
						return chongwuPhoto;
					}
					/**
					* 设置： 动物图片
					*/
					public void setChongwuPhoto(String chongwuPhoto) {
						this.chongwuPhoto = chongwuPhoto;
					}

					/**
					* 获取： 已获捐数值
					*/
					public Double getChongwuMoney() {
						return chongwuMoney;
					}
					/**
					* 设置： 已获捐数值
					*/
					public void setChongwuMoney(Double chongwuMoney) {
						this.chongwuMoney = chongwuMoney;
					}

					/**
					* 获取： 认领状态
					*/
					public Integer getJieshuTypes() {
						return jieshuTypes;
					}
					/**
					* 设置： 认领状态
					*/
					public void setJieshuTypes(Integer jieshuTypes) {
						this.jieshuTypes = jieshuTypes;
					}


						/**
						* 获取： 认领状态的值
						*/
						public String getJieshuValue() {
							return jieshuValue;
						}
						/**
						* 设置： 认领状态的值
						*/
						public void setJieshuValue(String jieshuValue) {
							this.jieshuValue = jieshuValue;
						}

					/**
					* 获取： 动物详情
					*/
					public String getChongwuContent() {
						return chongwuContent;
					}
					/**
					* 设置： 动物详情
					*/
					public void setChongwuContent(String chongwuContent) {
						this.chongwuContent = chongwuContent;
					}


































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
