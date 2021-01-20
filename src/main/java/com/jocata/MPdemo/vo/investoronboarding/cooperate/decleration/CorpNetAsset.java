package com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration;

import java.util.StringJoiner;

public class CorpNetAsset {
    private String assets;
    private String auditor;
    private String yearAssessed;

    public CorpNetAsset() {
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
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
        return new StringJoiner(", ", CorpNetAsset.class.getSimpleName() + "[", "]")
                .add("assets='" + assets + "'")
                .add("auditor='" + auditor + "'")
                .add("yearAssessed='" + yearAssessed + "'")
                .toString();
    }
}