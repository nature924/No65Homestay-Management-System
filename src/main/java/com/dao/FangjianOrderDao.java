package com.dao;

import com.entity.FangjianOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianOrderView;

/**
 * 房间预约 Dao 接口
 *
 * @author 
 */
public interface FangjianOrderDao extends BaseMapper<FangjianOrderEntity> {

   List<FangjianOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
