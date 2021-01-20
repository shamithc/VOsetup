package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class PhoneDetails {
    private String phoneNumber;
    private String countryCode;
    private String formatted;
    private String type;

    public PhoneDetails() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PhoneDetails.class.getSimpleName() + "[", "]")
                .add("phoneNumber='" + phoneNumber + "'")
                .add("countryCode='" + countryCode + "'")
                .add("formatted='" + formatted + "'")
                .add("type='" + type + "'")
                .toString();
    }
}

