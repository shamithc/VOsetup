package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.Arrays;
import java.util.StringJoiner;

public class AccountDetail {
    private BankAccount bankAccount;
    private String lastName;
    private Occupation occupation;
    private String fullName;
    private Industry industry;
    private String title;
    private String birthDate;
    private ContactDetails contactDetails;
    private Declarations declarations;
    private String firstName;
    private String riskAppetite;
    private Identification identification;
    private Nationality nationality;
    private String middleName;
    private String designation;
    private RiskAssessment[] riskAssessment;

    public AccountDetail() {
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Declarations getDeclarations() {
        return declarations;
    }

    public void setDeclarations(Declarations declarations) {
        this.declarations = declarations;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRiskAppetite() {
        return riskAppetite;
    }

    public void setRiskAppetite(String riskAppetite) {
        this.riskAppetite = riskAppetite;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public RiskAssessment[] getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(RiskAssessment[] riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AccountDetail.class.getSimpleName() + "[", "]")
                .add("bankAccount=" + bankAccount)
                .add("lastName='" + lastName + "'")
                .add("occupation=" + occupation)
                .add("fullName='" + fullName + "'")
                .add("industry=" + industry)
                .add("title='" + title + "'")
                .add("birthDate='" + birthDate + "'")
                .add("contactDetails=" + contactDetails)
                .add("declarations=" + declarations)
                .add("firstName='" + firstName + "'")
                .add("riskAppetite='" + riskAppetite + "'")
                .add("identification=" + identification)
                .add("nationality=" + nationality)
                .add("middleName='" + middleName + "'")
                .add("designation='" + designation + "'")
                .add("riskAssessment=" + Arrays.toString(riskAssessment))
                .toString();
    }
}