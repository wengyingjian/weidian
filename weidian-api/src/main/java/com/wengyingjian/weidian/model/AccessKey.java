package com.wengyingjian.weidian.model;

import java.io.Serializable;

/**
 * Created by wengyingjian on 16/2/16.
 */
public class AccessKey implements Serializable{
    private String accessToken;
    private Integer expireIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(Integer expireIn) {
        this.expireIn = expireIn;
    }

    public AccessKey(Object json) {
        String bareStr = json.toString().replace("{", "").replace("}", "");
        String[] parts = bareStr.split(",");
        this.accessToken = parts[0].trim().split("=")[1];
        this.expireIn = Integer.parseInt(parts[1].trim().split("=")[1]);
    }
}
