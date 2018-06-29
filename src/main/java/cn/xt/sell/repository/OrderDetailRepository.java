package cn.xt.sell.repository;

import cn.xt.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 00:45
 * @Description:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

}
