package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class Steps {
    private String code;
    private String sequenceNo;
    private String name;
    private String description;
    private String category;
    private String subcategory;
    private String status;

    public Steps() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Steps.class.getSimpleName() + "[", "]")
                .add("code='" + code + "'")
                .add("sequenceNo='" + sequenceNo + "'")
                .add("name='" + name + "'")
                .add("description='" + description + "'")
                .add("category='" + category + "'")
                .add("subcategory='" + subcategory + "'")
                .add("status='" + status + "'")
                .toString();
    }
}