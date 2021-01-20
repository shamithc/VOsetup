package com.jocata.MPdemo.vo.investoronboarding.individual;

import java.util.StringJoiner;

public class JointAccountDeclaration {
    private String branchCOde;
    private String givenName;
    private String bankName;
    private String accountNumber;
    private String branch;
    private String bankCountry;

    public JointAccountDeclaration() {
    }

    public String getBranchCOde() {
        return branchCOde;
    }

    public void setBranchCOde(String branchCOde) {
        this.branchCOde = branchCOde;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", JointAccountDeclaration.class.getSimpleName() + "[", "]")
                .add("branchCOde='" + branchCOde + "'")
                .add("givenName='" + givenName + "'")
                .add("bankName='" + bankName + "'")
                .add("accountNumber='" + accountNumber + "'")
                .add("branch='" + branch + "'")
                .add("bankCountry='" + bankCountry + "'")
                .toString();
    }
}
