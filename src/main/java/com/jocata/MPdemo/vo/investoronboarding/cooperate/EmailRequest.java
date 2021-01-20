package com.jocata.MPdemo.vo.investoronboarding.cooperate;

import java.util.StringJoiner;

public class EmailRequest {
    private String requestType;
    private String emailId;
    private String url;
    private String remarks;

    public EmailRequest() {
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", EmailRequest.class.getSimpleName() + "[", "]")
                .add("requestType='" + requestType + "'")
                .add("emailId='" + emailId + "'")
                .add("url='" + url + "'")
                .add("remarks='" + remarks + "'")
                .toString();
    }
}