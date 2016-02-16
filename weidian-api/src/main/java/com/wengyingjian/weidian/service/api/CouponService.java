package com.wengyingjian.weidian.service.api;

import com.wengyingjian.kylin.util.HttpUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wengyingjian on 16/2/16.
 */
@Service
public class CouponService {

    String baseUrl = "http://api.vdian.com/api";
    String accessToke = "";
    String version = "";
    String format = "json";

    public String getCoupon(String method,String paramJson) {
        Map<String, String> map = new HashMap<>();
        String publicStr =
                String.format("{\"method\":\"%s\",\"access_token\":\"%s\",\"version\":\"%s\",\"format\":\"%s\"}", method, accessToke, version, format);
        map.put("public", publicStr);
        map.put("param", paramJson);
        HttpUtil.doGet(baseUrl, map);
    return null;
    }
}
