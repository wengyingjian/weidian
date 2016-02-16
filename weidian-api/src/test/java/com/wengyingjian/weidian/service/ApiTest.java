package com.wengyingjian.weidian.service;

import com.wengyingjian.kylin.util.JsonUtil;
import com.wengyingjian.weidian.service.api.TokenService;
import org.junit.Test;

/**
 * Created by wengyingjian on 16/2/16.
 */
public class ApiTest {

    private TokenService tokenService = new TokenService();

    @Test
    public void testGet() {
        Object token = tokenService.getAccessKey();
        System.out.println(JsonUtil.getJsonFromObject(token));
    }
}
