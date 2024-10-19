package com.entity.model;

import com.entity.FangjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房间信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangjianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：房间名称
	 */
    public String getFangjianName() {
        return fangjianName;
    }


    /**
	 * 设置：房间名称
	 */
    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 获取：房间图片
	 */
    public String getFangjianPhoto() {
        return fangjianPhoto;
    }


    /**
	 * 设置：房间图片
	 */
    public void setFangjianPhoto(String fangjianPhoto) {
        this.fangjianPhoto = fangjianPhoto;
    }
    /**
	 * 获取：房间特色
	 */
    public String getFangjianTese() {
        return fangjianTese;
    }


    /**
	 * 设置：房间特色
	 */
    public void setFangjianTese(String fangjianTese) {
        this.fangjianTese = fangjianTese;
    }
    /**
	 * 获取：房间配置
	 */
    public String getFangjianPeizhi() {
        return fangjianPeizhi;
    }


    /**
	 * 设置：房间配置
	 */
    public void setFangjianPeizhi(String fangjianPeizhi) {
        this.fangjianPeizhi = fangjianPeizhi;
    }
    /**
	 * 获取：提供的商品
	 */
    public String getFangjianShangpin() {
        return fangjianShangpin;
    }


    /**
	 * 设置：提供的商品
	 */
    public void setFangjianShangpin(String fangjianShangpin) {
        this.fangjianShangpin = fangjianShangpin;
    }
    /**
	 * 获取：提供的服务
	 */
    public String getFangjianFuwu() {
        return fangjianFuwu;
    }


    /**
	 * 设置：提供的服务
	 */
    public void setFangjianFuwu(String fangjianFuwu) {
        this.fangjianFuwu = fangjianFuwu;
    }
    /**
	 * 获取：价格（天）
	 */
    public Double getFangjianMoney() {
        return fangjianMoney;
    }


    /**
	 * 设置：价格（天）
	 */
    public void setFangjianMoney(Double fangjianMoney) {
        this.fangjianMoney = fangjianMoney;
    }
    /**
	 * 获取：房间类型
	 */
    public Integer getFangjianTypes() {
        return fangjianTypes;
    }


    /**
	 * 设置：房间类型
	 */
    public void setFangjianTypes(Integer fangjianTypes) {
        this.fangjianTypes = fangjianTypes;
    }
    /**
	 * 获取：房间剩余数量
	 */
    public Integer getFangjianNumber() {
        return fangjianNumber;
    }


    /**
	 * 设置：房间剩余数量
	 */
    public void setFangjianNumber(Integer fangjianNumber) {
        this.fangjianNumber = fangjianNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getFangjianClicknum() {
        return fangjianClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setFangjianClicknum(Integer fangjianClicknum) {
        this.fangjianClicknum = fangjianClicknum;
    }
    /**
	 * 获取：房间详情
	 */
    public String getFangjianContent() {
        return fangjianContent;
    }


    /**
	 * 设置：房间详情
	 */
    public void setFangjianContent(String fangjianContent) {
        this.fangjianContent = fangjianContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
