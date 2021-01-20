package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class Currency {
    private String symbol;
    private String code;
    private String decimalPrecision;

    public Currency() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDecimalPrecision() {
        return decimalPrecision;
    }

    public void setDecimalPrecision(String decimalPrecision) {
        this.decimalPrecision = decimalPrecision;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Currency.class.getSimpleName() + "[", "]")
                .add("symbol='" + symbol + "'")
                .add("code='" + code + "'")
                .add("decimalPrecision='" + decimalPrecision + "'")
                .toString();
    }
}
