package com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration;

import com.jocata.MPdemo.vo.investoronboarding.common.Industry;
import com.jocata.MPdemo.vo.investoronboarding.common.Occupation;

import java.util.StringJoiner;

public class ShareHolder {
    private Occupation occupation;
    private String totalPercentShares;
    private String name;
    private String sharesAmount;
    private Industry industry;
    private String idNumber;

    public ShareHolder() {
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public String getTotalPercentShares() {
        return totalPercentShares;
    }

    public void setTotalPercentShares(String totalPercentShares) {
        this.totalPercentShares = totalPercentShares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSharesAmount() {
        return sharesAmount;
    }

    public void setSharesAmount(String sharesAmount) {
        this.sharesAmount = sharesAmount;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ShareHolder.class.getSimpleName() + "[", "]")
                .add("occupation=" + occupation)
                .add("totalPercentShares='" + totalPercentShares + "'")
                .add("name='" + name + "'")
                .add("sharesAmount='" + sharesAmount + "'")
                .add("industry=" + industry)
                .add("idNumber='" + idNumber + "'")
                .toString();
    }
}






