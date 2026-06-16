package com.order.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order.entity.TbOrder;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OrderMapper extends BaseMapper<TbOrder> {}