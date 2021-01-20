package com.jocata.MPdemo.vo.investoronboarding.common;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration.*;
import com.jocata.MPdemo.vo.investoronboarding.individual.DeclarationDetails;
import com.jocata.MPdemo.vo.investoronboarding.individual.IndividualDeclarations;
import com.jocata.MPdemo.vo.investoronboarding.individual.JointAccountDeclaration;

import java.util.Arrays;
import java.util.StringJoiner;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = IndividualDeclarations.class, name = "INCOME"),
        @JsonSubTypes.Type(value = IndividualDeclarations.class, name = "ASSET"),
        @JsonSubTypes.Type(value = IndividualDeclarations.class, name = "JOINT_ACCOUNT"),
        @JsonSubTypes.Type(value = CooperateDeclarations.class, name = "NET_ASSET"),
        @JsonSubTypes.Type(value = CooperateDeclarations.class, name = "SHARE_OWNERSHIP"),
        @JsonSubTypes.Type(value = CooperateDeclarations.class, name = "PARTNERS"),
        @JsonSubTypes.Type(value = CooperateDeclarations.class, name = "TRUST_PROPERTY"),
        @JsonSubTypes.Type(value = CooperateDeclarations.class, name = "BENEFECIARIES"),
        @JsonSubTypes.Type(value = CooperateDeclarations.class, name = "SETTLERS")
})
public class Declarations {
    private String type;
    private String total;
    private Currency currency;

    public Declarations() {
    }

    protected Declarations(String type, String total, Currency currency) {
        this.type = type;
        this.total = total;
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
