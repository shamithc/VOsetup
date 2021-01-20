package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.Arrays;
import java.util.StringJoiner;

public class OnBoardingDetails {
    private String currentStep;
    private String isCurrentStepCompleted;
    private String dateCreated;
    private String progress;
    private String nextStep;
    private Steps[] steps;
    private String onboardingType;
    private String dateUpdated;

    public OnBoardingDetails() {
    }

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }

    public String getIsCurrentStepCompleted() {
        return isCurrentStepCompleted;
    }

    public void setIsCurrentStepCompleted(String isCurrentStepCompleted) {
        this.isCurrentStepCompleted = isCurrentStepCompleted;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public Steps[] getSteps() {
        return steps;
    }

    public void setSteps(Steps[] steps) {
        this.steps = steps;
    }

    public String getOnboardingType() {
        return onboardingType;
    }

    public void setOnboardingType(String onboardingType) {
        this.onboardingType = onboardingType;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OnBoardingDetails.class.getSimpleName() + "[", "]")
                .add("currentStep='" + currentStep + "'")
                .add("isCurrentStepCompleted='" + isCurrentStepCompleted + "'")
                .add("dateCreated='" + dateCreated + "'")
                .add("progress='" + progress + "'")
                .add("nextStep='" + nextStep + "'")
                .add("steps=" + Arrays.toString(steps))
                .add("onboardingType='" + onboardingType + "'")
                .add("dateUpdated='" + dateUpdated + "'")
                .toString();
    }
}