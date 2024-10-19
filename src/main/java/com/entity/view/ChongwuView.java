package com.entity.view;

import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 动物领养/捐赠
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwu")
public class ChongwuView extends ChongwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 动物类型的值
		*/
		private String chongwuValue;
		/**
		* 数据类型的值
		*/
		private String statusValue;
		/**
		* 认领状态的值
		*/
		private String jieshuValue;



	public ChongwuView() {

	}

	public ChongwuView(ChongwuEntity chongwuEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

















}
