package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.StringJoiner;

public class RiskAssessment {
    private String answerCode;
    private String questionCode;

    public RiskAssessment() {
    }

    public String getAnswerCode() {
        return answerCode;
    }

    public void setAnswerCode(String answerCode) {
        this.answerCode = answerCode;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RiskAssessment.class.getSimpleName() + "[", "]")
                .add("answerCode='" + answerCode + "'")
                .add("questionCode='" + questionCode + "'")
                .toString();
    }
}