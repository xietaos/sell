package cn.xt.sell.controller;

import cn.xt.sell.converter.OrderForm2OrderDTOConverter;
import cn.xt.sell.dto.OrderDTO;
import cn.xt.sell.enums.ResultEnum;
import cn.xt.sell.exception.SellException;
import cn.xt.sell.form.OrderForm;
import cn.xt.sell.service.OrderService;
import cn.xt.sell.utils.ResultVOUtil;
import cn.xt.sell.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 16:41
 * @Description:
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    // 创建订单
    // BindingResult 是验证不通过的结果集合
    @RequestMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm,
                                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确，orderForm={}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());

        }

        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }

        OrderDTO createResult = orderService.create(orderDTO);

        Map<String, String> map = new HashMap<>();
        map.put("orderId", createResult.getOrderId());

        return ResultVOUtil.success(map);
    }

    // 订单列表
    @GetMapping("/list")
    public ResultVO<List<OrderDTO>> list(@RequestParam("openid") String openid,
                                         @RequestParam("page") Integer page,
                                         @RequestParam("size") Integer size) {
//        if (StringUtils.isEmpty(openid)) {
//            log.error(("【查询订单列表】"));
//        }
        return null;
    }

    // 订单详情

    // 取消订单

}
