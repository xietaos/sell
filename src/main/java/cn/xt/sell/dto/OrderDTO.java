package cn.xt.sell.dto;

import cn.xt.sell.dataobject.OrderDetail;
import cn.xt.sell.enums.OrderStatusEnum;
import cn.xt.sell.enums.PayStatusEnum;
import cn.xt.sell.utils.Date2LongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 02:02
 * @Description:
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** 订单id. */
    private String orderId;

    /** 卖家名字. */
    private String buyerName;

    /** 卖家手机号. */
    private String buyerPhone;

    /** 卖家地址. */
    private String buyerAddress;

    /** 卖家微信openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态，默认为0新下单. */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认为0未支付. */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
