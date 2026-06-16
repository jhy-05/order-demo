package com.order.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.order.entity.TbOrder;
import com.order.mapper.OrderMapper;
import com.order.service.OrderService;
import org.springframework.stereotype.Service;
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, TbOrder> implements OrderService {}