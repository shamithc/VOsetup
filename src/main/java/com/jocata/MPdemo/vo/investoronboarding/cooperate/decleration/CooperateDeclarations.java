package com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration;

import com.jocata.MPdemo.vo.investoronboarding.common.Declarations;

import java.util.StringJoiner;

public class CooperateDeclarations extends Declarations {
    private PartnersDeclaration partnersDeclaration;
    private CorpNetAsset corpNetAsset;
    private TrustProperty trustProperty;
    private ShareHolder shareHolder;
    private Beneficiaries beneficiaries;
    private Settlers settlers;

    public CooperateDeclarations() {
    }

    public PartnersDeclaration getPartnersDeclaration() {
        return partnersDeclaration;
    }

    public void setPartnersDeclaration(PartnersDeclaration partnersDeclaration) {
        this.partnersDeclaration = partnersDeclaration;
    }

    public CorpNetAsset getCorpNetAsset() {
        return corpNetAsset;
    }

    public void setCorpNetAsset(CorpNetAsset corpNetAsset) {
        this.corpNetAsset = corpNetAsset;
    }

    public TrustProperty getTrustProperty() {
        return trustProperty;
    }

    public void setTrustProperty(TrustProperty trustProperty) {
        this.trustProperty = trustProperty;
    }

    public ShareHolder getShareHolder() {
        return shareHolder;
    }

    public void setShareHolder(ShareHolder shareHolder) {
        this.shareHolder = shareHolder;
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
        return new StringJoiner(", ", CooperateDeclarations.class.getSimpleName() + "[", "]")
                .add("partnersDeclaration=" + partnersDeclaration)
                .add("corpNetAsset=" + corpNetAsset)
                .add("trustProperty=" + trustProperty)
                .add("shareHolder=" + shareHolder)
                .add("beneficiaries=" + beneficiaries)
                .add("settlers=" + settlers)
                .toString();
    }
}
