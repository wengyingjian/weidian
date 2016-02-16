package com.wengyingjian.weidian.service.api;

import com.wengyingjian.kylin.util.HttpUtil;
import com.wengyingjian.kylin.util.JsonUtil;
import com.wengyingjian.weidian.model.AccessKey;
import com.wengyingjian.weidian.model.WeiDianResult;
import org.springframework.stereotype.Service;

/**
 * Created by wengyingjian on 16/2/16.
 */
@Service
public class TokenService {

    String appKey = "647551";
    String secret = "0136901458ebecbd039cf12deee0b384";

    public AccessKey getAccessKey() {
        String url = String.format("https://api.vdian.com/token?grant_type=client_credential&appkey=%s&secret=%s", appKey, secret);
        String token = HttpUtil.doGet(url, null);
        WeiDianResult tokenResult = JsonUtil.getObjectFromJson(token, WeiDianResult.class);
        System.out.println("tokenResult:" + tokenResult.getResult());
        return new AccessKey(tokenResult.getResult());
    }


}
