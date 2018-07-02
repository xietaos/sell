package cn.xt.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2018/7/2 20:12
 * @Description: 商品类目 模型
 */
@Data
@Entity
@DynamicUpdate  // 在每次数据更新的时候动态更新时间
public class ProductCategory {

    /** 商品类目. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名称. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    /** 创建时间. */
    private Date createTime;

    /** 更新时间. */
    private Date updateTime;

    public ProductCategory() {}

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
