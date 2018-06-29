package cn.xt.sell.dataobject;

import cn.xt.sell.enums.OrderStatusEnum;
import cn.xt.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2018/6/28 23:56
 * @Description:
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    /** 订单id. */
    @Id
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
    private Date createTime;

    /** 更新时间. */
    private Date updateTime;

}
