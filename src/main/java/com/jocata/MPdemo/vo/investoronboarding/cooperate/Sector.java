package com.jocata.MPdemo.vo.investoronboarding.cooperate;

import java.util.StringJoiner;

public class Sector {
    private String code;
    private String name;

    public Sector() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sector.class.getSimpleName() + "[", "]")
                .add("code='" + code + "'")
                .add("name='" + name + "'")
                .toString();
    }
}
