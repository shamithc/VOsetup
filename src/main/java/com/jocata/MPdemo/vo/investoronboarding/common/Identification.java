package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class Identification {
    private String expiryDate;
    private String issuedDate;
    private String type;
    private String idNumber;

    public Identification() {
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Identification.class.getSimpleName() + "[", "]")
                .add("expiryDate='" + expiryDate + "'")
                .add("issuedDate='" + issuedDate + "'")
                .add("type='" + type + "'")
                .add("idNumber='" + idNumber + "'")
                .toString();
    }
}