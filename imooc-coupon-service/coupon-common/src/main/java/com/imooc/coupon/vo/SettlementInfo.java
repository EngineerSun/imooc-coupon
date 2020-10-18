package com.imooc.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName SettlementInfo
 * @Description TODO
 * @Author Administrator
 * @Version 1.0
 * <h1>结算信息对象</h1>
 * 包含：
 * 1.userId
 * 2.商品信息列表
 * 3.优惠券列表
 * 4.结算结果金额
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SettlementInfo {
    /*用户id*/
    private Long userId;

    /*商品信息列表*/
    private List<GoodsInfo> goodsInfos;

    /*优惠券列表*/
    private List<CouponAndTemplateInfo> couponAndTemplateInfos;
    /* 是否使结算生效，即核销*/
    private Boolean employ;
    /*结算结果金额*/
    private Double cost;






    /*内部类 优惠券和模板信息*/
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CouponAndTemplateInfo{
        /*Coupon 的主键*/
        private Integer id;
        /*优惠券对应的模板对象*/
        private CouponTemplateSDK template;
    }

}
