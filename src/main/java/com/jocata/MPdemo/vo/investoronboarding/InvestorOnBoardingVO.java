package com.jocata.MPdemo.vo.investoronboarding;


import com.jocata.MPdemo.vo.investoronboarding.common.AccountDetail;
import com.jocata.MPdemo.vo.investoronboarding.common.Document;
import com.jocata.MPdemo.vo.investoronboarding.common.OnBoardingDetails;
import com.jocata.MPdemo.vo.investoronboarding.cooperate.CompanyDetails;
import com.jocata.MPdemo.vo.investoronboarding.cooperate.EmailRequest;

import java.util.Arrays;
import java.util.StringJoiner;

public class InvestorOnBoardingVO {
    private OnBoardingDetails onboardingDetails;
    private EmailRequest emailRequest;
    private CompanyDetails companyDetails;
    private AccountDetail accountDetail;
    private Document[] documents;

    public InvestorOnBoardingVO() {
    }

    public OnBoardingDetails getOnboardingDetails() {
        return onboardingDetails;
    }

    public void setOnboardingDetails(OnBoardingDetails onboardingDetails) {
        this.onboardingDetails = onboardingDetails;
    }

    public EmailRequest getEmailRequest() {
        return emailRequest;
    }

    public void setEmailRequest(EmailRequest emailRequest) {
        this.emailRequest = emailRequest;
    }

    public CompanyDetails getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public Document[] getDocuments() {
        return documents;
    }

    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", InvestorOnBoardingVO.class.getSimpleName() + "[", "]")
                .add("onboardingDetails=" + onboardingDetails)
                .add("emailRequest=" + emailRequest)
                .add("companyDetails=" + companyDetails)
                .add("accountDetail=" + accountDetail)
                .add("documents=" + Arrays.toString(documents))
                .toString();
    }
}
