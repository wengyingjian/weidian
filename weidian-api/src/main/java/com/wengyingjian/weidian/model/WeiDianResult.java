package com.wengyingjian.weidian.model;

/**
 * Created by wengyingjian on 16/2/16.
 */
public class WeiDianResult {
    private Status status;
    private Object result;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static class Status {
        int status_code;
        String status_reason;

        public int getStatus_code() {
            return status_code;
        }

        public void setStatus_code(int status_code) {
            this.status_code = status_code;
        }

        public String getStatus_reason() {
            return status_reason;
        }

        public void setStatus_reason(String status_reason) {
            this.status_reason = status_reason;
        }
    }
}
