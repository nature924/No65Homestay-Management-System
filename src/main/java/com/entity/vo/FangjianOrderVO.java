package com.entity.vo;

import com.entity.FangjianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房间预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangjian_order")
public class FangjianOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 房间
     */

    @TableField(value = "fangjian_id")
    private Integer fangjianId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "fangjian_order_time")
    private Date fangjianOrderTime;


    /**
     * 预约备注
     */

    @TableField(value = "fangjian_order_text")
    private String fangjianOrderText;


    /**
     * 订单状态
     */

    @TableField(value = "fangjian_order_types")
    private Integer fangjianOrderTypes;


    /**
     * 创建时间
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
	 * 设置：房间
	 */
    public Integer getFangjianId() {
        return fangjianId;
    }


    /**
	 * 获取：房间
	 */

    public void setFangjianId(Integer fangjianId) {
        this.fangjianId = fangjianId;
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
	 * 设置：预约日期
	 */
    public Date getFangjianOrderTime() {
        return fangjianOrderTime;
    }


    /**
	 * 获取：预约日期
	 */

    public void setFangjianOrderTime(Date fangjianOrderTime) {
        this.fangjianOrderTime = fangjianOrderTime;
    }
    /**
	 * 设置：预约备注
	 */
    public String getFangjianOrderText() {
        return fangjianOrderText;
    }


    /**
	 * 获取：预约备注
	 */

    public void setFangjianOrderText(String fangjianOrderText) {
        this.fangjianOrderText = fangjianOrderText;
    }
    /**
	 * 设置：订单状态
	 */
    public Integer getFangjianOrderTypes() {
        return fangjianOrderTypes;
    }


    /**
	 * 获取：订单状态
	 */

    public void setFangjianOrderTypes(Integer fangjianOrderTypes) {
        this.fangjianOrderTypes = fangjianOrderTypes;
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

}
