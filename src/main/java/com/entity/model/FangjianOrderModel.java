package com.entity.model;

import com.entity.FangjianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房间预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangjianOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房间
     */
    private Integer fangjianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fangjianOrderTime;


    /**
     * 预约备注
     */
    private String fangjianOrderText;


    /**
     * 订单状态
     */
    private Integer fangjianOrderTypes;


    /**
     * 创建时间
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
	 * 获取：房间
	 */
    public Integer getFangjianId() {
        return fangjianId;
    }


    /**
	 * 设置：房间
	 */
    public void setFangjianId(Integer fangjianId) {
        this.fangjianId = fangjianId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约日期
	 */
    public Date getFangjianOrderTime() {
        return fangjianOrderTime;
    }


    /**
	 * 设置：预约日期
	 */
    public void setFangjianOrderTime(Date fangjianOrderTime) {
        this.fangjianOrderTime = fangjianOrderTime;
    }
    /**
	 * 获取：预约备注
	 */
    public String getFangjianOrderText() {
        return fangjianOrderText;
    }


    /**
	 * 设置：预约备注
	 */
    public void setFangjianOrderText(String fangjianOrderText) {
        this.fangjianOrderText = fangjianOrderText;
    }
    /**
	 * 获取：订单状态
	 */
    public Integer getFangjianOrderTypes() {
        return fangjianOrderTypes;
    }


    /**
	 * 设置：订单状态
	 */
    public void setFangjianOrderTypes(Integer fangjianOrderTypes) {
        this.fangjianOrderTypes = fangjianOrderTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
