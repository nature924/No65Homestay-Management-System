package com.dao;

import com.entity.FangjianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianLiuyanView;

/**
 * 房间评论/投诉 Dao 接口
 *
 * @author 
 */
public interface FangjianLiuyanDao extends BaseMapper<FangjianLiuyanEntity> {

   List<FangjianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
