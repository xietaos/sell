package cn.xt.sell.service;

import cn.xt.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/7/2 20:36
 * @Description: 商品类目 业务逻辑
 */
@Service
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
