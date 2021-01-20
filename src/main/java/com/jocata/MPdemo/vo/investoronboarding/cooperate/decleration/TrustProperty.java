package com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration;

import java.util.StringJoiner;

public class TrustProperty {
    private String trustProperty;
    private String auditor;
    private String yearAssessed;

    public TrustProperty() {
    }

    public String getTrustProperty() {
        return trustProperty;
    }

    public void setTrustProperty(String trustProperty) {
        this.trustProperty = trustProperty;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getYearAssessed() {
        return yearAssessed;
    }

    public void setYearAssessed(String yearAssessed) {
        this.yearAssessed = yearAssessed;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TrustProperty.class.getSimpleName() + "[", "]")
                .add("trustProperty='" + trustProperty + "'")
                .add("auditor='" + auditor + "'")
                .add("yearAssessed='" + yearAssessed + "'")
                .toString();
    }
}