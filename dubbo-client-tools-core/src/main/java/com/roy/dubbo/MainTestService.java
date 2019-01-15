package com.roy.dubbo;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.mph.coreapi.promotion.service.MphPromotionCornerService;
import com.rogrand.coreapi.goods.entity.GoodsCorner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2018/12/12 0012
 * @Version: 1.0
 */

@Service
public class MainTestService {

    @Autowired
    MphPromotionCornerService mphPromotionCornerService;

    private final static String ACT_URL = "https://act.test.wdyy.com.cn";

    /**
     *通过商品ID、站点ID,获取商品大促活动角标信息
     * @param siteId
     * @param goodsIds
     * @param actHostAndPort
     */
    public void getGoodsCornerWithGoodsIds(int siteId, String goodsIds){
        Map<String, GoodsCorner> resultMap = mphPromotionCornerService.getGoodsCornerWithGoodsIds(3, "11847480", ACT_URL).getResult();
        System.out.println("大促活动角标：" +  JSON.toJSONString(resultMap));

    }

    /*public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"dubbo-service.xml"});
        context.start();
        MphPromotionCornerService mphPromotionCornerService = (MphPromotionCornerService)context.getBean("mphPromotionCornerService"); // 获取远程服务代理
        Map<String, GoodsCorner> resultMap = mphPromotionCornerService.getGoodsCornerWithGoodsIds(3, "11847480", ACT_URL).getResult();
        System.out.println("大促活动角标：" +  JSON.toJSONString(resultMap));
    }*/
}
