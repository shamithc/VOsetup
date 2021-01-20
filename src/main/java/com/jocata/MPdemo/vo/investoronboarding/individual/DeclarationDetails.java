package com.jocata.MPdemo.vo.investoronboarding.individual;

import java.util.StringJoiner;

public class DeclarationDetails {
    private String code;
    private String name;
    private String description;
    private String category;
    private String subcategory;
    private String value;

    public DeclarationDetails() {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DeclarationDetails.class.getSimpleName() + "[", "]")
                .add("code='" + code + "'")
                .add("name='" + name + "'")
                .add("description='" + description + "'")
                .add("category='" + category + "'")
                .add("subcategory='" + subcategory + "'")
                .add("value='" + value + "'")
                .toString();
    }
}
