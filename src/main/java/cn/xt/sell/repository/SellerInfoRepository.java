package cn.xt.sell.repository;

import cn.xt.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: xietao
 * @Date: 2018/7/2
 * @Description:
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
