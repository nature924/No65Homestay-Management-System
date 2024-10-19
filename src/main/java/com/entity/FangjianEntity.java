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
 * 房间信息
 *
 * @author 
 * @email
 */
@TableName("fangjian")
public class FangjianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangjianEntity() {

	}

	public FangjianEntity(T t) {
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
     * 房间名称
     */
    @TableField(value = "fangjian_name")

    private String fangjianName;


    /**
     * 房间图片
     */
    @TableField(value = "fangjian_photo")

    private String fangjianPhoto;


    /**
     * 房间特色
     */
    @TableField(value = "fangjian_tese")

    private String fangjianTese;


    /**
     * 房间配置
     */
    @TableField(value = "fangjian_peizhi")

    private String fangjianPeizhi;


    /**
     * 提供的商品
     */
    @TableField(value = "fangjian_shangpin")

    private String fangjianShangpin;


    /**
     * 提供的服务
     */
    @TableField(value = "fangjian_fuwu")

    private String fangjianFuwu;


    /**
     * 价格（天）
     */
    @TableField(value = "fangjian_money")

    private Double fangjianMoney;


    /**
     * 房间类型
     */
    @TableField(value = "fangjian_types")

    private Integer fangjianTypes;


    /**
     * 房间剩余数量
     */
    @TableField(value = "fangjian_number")

    private Integer fangjianNumber;


    /**
     * 点击次数
     */
    @TableField(value = "fangjian_clicknum")

    private Integer fangjianClicknum;


    /**
     * 房间详情
     */
    @TableField(value = "fangjian_content")

    private String fangjianContent;


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
	 * 设置：房间名称
	 */
    public String getFangjianName() {
        return fangjianName;
    }
    /**
	 * 获取：房间名称
	 */

    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 设置：房间图片
	 */
    public String getFangjianPhoto() {
        return fangjianPhoto;
    }
    /**
	 * 获取：房间图片
	 */

    public void setFangjianPhoto(String fangjianPhoto) {
        this.fangjianPhoto = fangjianPhoto;
    }
    /**
	 * 设置：房间特色
	 */
    public String getFangjianTese() {
        return fangjianTese;
    }
    /**
	 * 获取：房间特色
	 */

    public void setFangjianTese(String fangjianTese) {
        this.fangjianTese = fangjianTese;
    }
    /**
	 * 设置：房间配置
	 */
    public String getFangjianPeizhi() {
        return fangjianPeizhi;
    }
    /**
	 * 获取：房间配置
	 */

    public void setFangjianPeizhi(String fangjianPeizhi) {
        this.fangjianPeizhi = fangjianPeizhi;
    }
    /**
	 * 设置：提供的商品
	 */
    public String getFangjianShangpin() {
        return fangjianShangpin;
    }
    /**
	 * 获取：提供的商品
	 */

    public void setFangjianShangpin(String fangjianShangpin) {
        this.fangjianShangpin = fangjianShangpin;
    }
    /**
	 * 设置：提供的服务
	 */
    public String getFangjianFuwu() {
        return fangjianFuwu;
    }
    /**
	 * 获取：提供的服务
	 */

    public void setFangjianFuwu(String fangjianFuwu) {
        this.fangjianFuwu = fangjianFuwu;
    }
    /**
	 * 设置：价格（天）
	 */
    public Double getFangjianMoney() {
        return fangjianMoney;
    }
    /**
	 * 获取：价格（天）
	 */

    public void setFangjianMoney(Double fangjianMoney) {
        this.fangjianMoney = fangjianMoney;
    }
    /**
	 * 设置：房间类型
	 */
    public Integer getFangjianTypes() {
        return fangjianTypes;
    }
    /**
	 * 获取：房间类型
	 */

    public void setFangjianTypes(Integer fangjianTypes) {
        this.fangjianTypes = fangjianTypes;
    }
    /**
	 * 设置：房间剩余数量
	 */
    public Integer getFangjianNumber() {
        return fangjianNumber;
    }
    /**
	 * 获取：房间剩余数量
	 */

    public void setFangjianNumber(Integer fangjianNumber) {
        this.fangjianNumber = fangjianNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getFangjianClicknum() {
        return fangjianClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setFangjianClicknum(Integer fangjianClicknum) {
        this.fangjianClicknum = fangjianClicknum;
    }
    /**
	 * 设置：房间详情
	 */
    public String getFangjianContent() {
        return fangjianContent;
    }
    /**
	 * 获取：房间详情
	 */

    public void setFangjianContent(String fangjianContent) {
        this.fangjianContent = fangjianContent;
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
        return "Fangjian{" +
            "id=" + id +
            ", fangjianName=" + fangjianName +
            ", fangjianPhoto=" + fangjianPhoto +
            ", fangjianTese=" + fangjianTese +
            ", fangjianPeizhi=" + fangjianPeizhi +
            ", fangjianShangpin=" + fangjianShangpin +
            ", fangjianFuwu=" + fangjianFuwu +
            ", fangjianMoney=" + fangjianMoney +
            ", fangjianTypes=" + fangjianTypes +
            ", fangjianNumber=" + fangjianNumber +
            ", fangjianClicknum=" + fangjianClicknum +
            ", fangjianContent=" + fangjianContent +
            ", createTime=" + createTime +
        "}";
    }
}
