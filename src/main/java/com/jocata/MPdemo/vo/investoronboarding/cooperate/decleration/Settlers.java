package com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration;

import java.util.StringJoiner;

public class Settlers {
    private String name;
    private String idNumber;
    private String additionalDetails;

    public Settlers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Settlers.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("idNumber='" + idNumber + "'")
                .add("additionalDetails='" + additionalDetails + "'")
                .toString();
    }
}