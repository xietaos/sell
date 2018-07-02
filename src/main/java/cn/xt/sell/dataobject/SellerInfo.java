package cn.xt.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Auther: xietao
 * @Date: 2018/7/2
 * @Description:
 */
@Data
@Entity
public class SellerInfo {
    @Id
    private String sellerId;
    private String username;
    private String password;
    private String openid;
}
