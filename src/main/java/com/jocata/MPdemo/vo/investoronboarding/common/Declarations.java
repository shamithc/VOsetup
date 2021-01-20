package com.jocata.MPdemo.vo.investoronboarding.common;


import com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration.*;
import com.jocata.MPdemo.vo.investoronboarding.individual.DeclarationDetails;
import com.jocata.MPdemo.vo.investoronboarding.individual.JointAccountDeclaration;

import java.util.Arrays;
import java.util.StringJoiner;

public class Declarations {
    private PartnersDeclaration partnersDeclaration;
    private String total;
    private CorpNetAsset corpNetAsset;
    private DeclarationDetails[] declarationDetails;
    private TrustProperty trustProperty;
    private JointAccountDeclaration jointAccountDeclaration;
    private Currency currency;
    private ShareHolder shareHolder;
    private String type;
    private Beneficiaries beneficiaries;
    private Settlers settlers;

    public Declarations() {
    }

    public PartnersDeclaration getPartnersDeclaration() {
        return partnersDeclaration;
    }

    public void setPartnersDeclaration(PartnersDeclaration partnersDeclaration) {
        this.partnersDeclaration = partnersDeclaration;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public CorpNetAsset getCorpNetAsset() {
        return corpNetAsset;
    }

    public void setCorpNetAsset(CorpNetAsset corpNetAsset) {
        this.corpNetAsset = corpNetAsset;
    }

    public DeclarationDetails[] getDeclarationDetails() {
        return declarationDetails;
    }

    public void setDeclarationDetails(DeclarationDetails[] declarationDetails) {
        this.declarationDetails = declarationDetails;
    }

    public TrustProperty getTrustProperty() {
        return trustProperty;
    }

    public void setTrustProperty(TrustProperty trustProperty) {
        this.trustProperty = trustProperty;
    }

    public JointAccountDeclaration getJointAccountDeclaration() {
        return jointAccountDeclaration;
    }

    public void setJointAccountDeclaration(JointAccountDeclaration jointAccountDeclaration) {
        this.jointAccountDeclaration = jointAccountDeclaration;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public ShareHolder getShareHolder() {
        return shareHolder;
    }

    public void setShareHolder(ShareHolder shareHolder) {
        this.shareHolder = shareHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Beneficiaries getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(Beneficiaries beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public Settlers getSettlers() {
        return settlers;
    }

    public void setSettlers(Settlers settlers) {
        this.settlers = settlers;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Declarations.class.getSimpleName() + "[", "]")
                .add("partnersDeclaration=" + partnersDeclaration)
                .add("total='" + total + "'")
                .add("corpNetAsset=" + corpNetAsset)
                .add("declarationDetails=" + Arrays.toString(declarationDetails))
                .add("trustProperty=" + trustProperty)
                .add("jointAccountDeclaration=" + jointAccountDeclaration)
                .add("currency=" + currency)
                .add("shareHolder=" + shareHolder)
                .add("type='" + type + "'")
                .add("beneficiaries=" + beneficiaries)
                .add("settlers=" + settlers)
                .toString();
    }
}
