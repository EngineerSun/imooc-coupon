package com.imooc.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName GoodInfo
 * @Description TODO
 * @Author Administrator
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsInfo {

    /*商品类型*/

    private Integer type;

    /*商品价格*/
    private  Double price;

    /*商品数量*/
    private Integer count;
}
