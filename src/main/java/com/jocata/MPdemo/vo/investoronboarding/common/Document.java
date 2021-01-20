package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class Document {
    private String originalFileName;
    private String fileName;
    private String code;
    private String base64;
    private String description;
    private String category;
    private String subcategory;

    public Document() {
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", Document.class.getSimpleName() + "[", "]")
                .add("originalFileName='" + originalFileName + "'")
                .add("fileName='" + fileName + "'")
                .add("code='" + code + "'")
                .add("base64='" + base64 + "'")
                .add("description='" + description + "'")
                .add("category='" + category + "'")
                .add("subcategory='" + subcategory + "'")
                .toString();
    }
}