package com.entity.view;

import com.entity.FangjianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房间评论/投诉
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangjian_liuyan")
public class FangjianLiuyanView extends FangjianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 fangjian
			/**
			* 房间名称
			*/
			private String fangjianName;
			/**
			* 房间图片
			*/
			private String fangjianPhoto;
			/**
			* 房间特色
			*/
			private String fangjianTese;
			/**
			* 房间配置
			*/
			private String fangjianPeizhi;
			/**
			* 提供的商品
			*/
			private String fangjianShangpin;
			/**
			* 提供的服务
			*/
			private String fangjianFuwu;
			/**
			* 价格（天）
			*/
			private Double fangjianMoney;
			/**
			* 房间类型
			*/
			private Integer fangjianTypes;
				/**
				* 房间类型的值
				*/
				private String fangjianValue;
			/**
			* 房间剩余数量
			*/
			private Integer fangjianNumber;
			/**
			* 点击次数
			*/
			private Integer fangjianClicknum;
			/**
			* 房间详情
			*/
			private String fangjianContent;

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

	public FangjianLiuyanView() {

	}

	public FangjianLiuyanView(FangjianLiuyanEntity fangjianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, fangjianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set fangjian

					/**
					* 获取： 房间名称
					*/
					public String getFangjianName() {
						return fangjianName;
					}
					/**
					* 设置： 房间名称
					*/
					public void setFangjianName(String fangjianName) {
						this.fangjianName = fangjianName;
					}

					/**
					* 获取： 房间图片
					*/
					public String getFangjianPhoto() {
						return fangjianPhoto;
					}
					/**
					* 设置： 房间图片
					*/
					public void setFangjianPhoto(String fangjianPhoto) {
						this.fangjianPhoto = fangjianPhoto;
					}

					/**
					* 获取： 房间特色
					*/
					public String getFangjianTese() {
						return fangjianTese;
					}
					/**
					* 设置： 房间特色
					*/
					public void setFangjianTese(String fangjianTese) {
						this.fangjianTese = fangjianTese;
					}

					/**
					* 获取： 房间配置
					*/
					public String getFangjianPeizhi() {
						return fangjianPeizhi;
					}
					/**
					* 设置： 房间配置
					*/
					public void setFangjianPeizhi(String fangjianPeizhi) {
						this.fangjianPeizhi = fangjianPeizhi;
					}

					/**
					* 获取： 提供的商品
					*/
					public String getFangjianShangpin() {
						return fangjianShangpin;
					}
					/**
					* 设置： 提供的商品
					*/
					public void setFangjianShangpin(String fangjianShangpin) {
						this.fangjianShangpin = fangjianShangpin;
					}

					/**
					* 获取： 提供的服务
					*/
					public String getFangjianFuwu() {
						return fangjianFuwu;
					}
					/**
					* 设置： 提供的服务
					*/
					public void setFangjianFuwu(String fangjianFuwu) {
						this.fangjianFuwu = fangjianFuwu;
					}

					/**
					* 获取： 价格（天）
					*/
					public Double getFangjianMoney() {
						return fangjianMoney;
					}
					/**
					* 设置： 价格（天）
					*/
					public void setFangjianMoney(Double fangjianMoney) {
						this.fangjianMoney = fangjianMoney;
					}

					/**
					* 获取： 房间类型
					*/
					public Integer getFangjianTypes() {
						return fangjianTypes;
					}
					/**
					* 设置： 房间类型
					*/
					public void setFangjianTypes(Integer fangjianTypes) {
						this.fangjianTypes = fangjianTypes;
					}


						/**
						* 获取： 房间类型的值
						*/
						public String getFangjianValue() {
							return fangjianValue;
						}
						/**
						* 设置： 房间类型的值
						*/
						public void setFangjianValue(String fangjianValue) {
							this.fangjianValue = fangjianValue;
						}

					/**
					* 获取： 房间剩余数量
					*/
					public Integer getFangjianNumber() {
						return fangjianNumber;
					}
					/**
					* 设置： 房间剩余数量
					*/
					public void setFangjianNumber(Integer fangjianNumber) {
						this.fangjianNumber = fangjianNumber;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getFangjianClicknum() {
						return fangjianClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setFangjianClicknum(Integer fangjianClicknum) {
						this.fangjianClicknum = fangjianClicknum;
					}

					/**
					* 获取： 房间详情
					*/
					public String getFangjianContent() {
						return fangjianContent;
					}
					/**
					* 设置： 房间详情
					*/
					public void setFangjianContent(String fangjianContent) {
						this.fangjianContent = fangjianContent;
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
