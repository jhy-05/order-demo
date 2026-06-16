package com.order.controller;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.order.common.Result;
import com.order.entity.TbOrder;
import com.order.service.OrderService;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Resource
    private OrderService orderService;
    @PostMapping("/add")
    public Result<String> addOrder(@RequestBody TbOrder order) {
        boolean save = orderService.save(order);
        return save ? Result.success("新增订单成功") : Result.fail("新增失败");
    }
    @GetMapping("/{id}")
    public Result<TbOrder> getById(@PathVariable Long id) {
        TbOrder order = orderService.getById(id);
        return Result.success(order);
    }
    @GetMapping("/list")
    public Result<List<TbOrder>> listAll() {
        List<TbOrder> list = orderService.list();
        return Result.success(list);
    }
    @PutMapping("/update")
    public Result<String> updateOrder(@RequestBody TbOrder order) {
        boolean update = orderService.updateById(order);
        return update ? Result.success("修改成功") : Result.fail("修改失败");
    }
    @DeleteMapping("/{id}")
    public Result<String> deleteOrder(@PathVariable Long id) {
        boolean remove = orderService.removeById(id);
        return remove ? Result.success("删除成功") : Result.fail("删除失败");
    }
}