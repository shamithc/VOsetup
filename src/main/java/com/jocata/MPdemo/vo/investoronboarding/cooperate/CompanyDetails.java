package com.jocata.MPdemo.vo.investoronboarding.cooperate;


import java.util.Arrays;
import java.util.StringJoiner;

public class CompanyDetails {
    private String registeredAddress;
    private String isInstitutionalInvestor;
    private String name;
    private String yearsInOperation;
    private Sector sector;
    private ContactDetails contactDetails;
    private DirectorDetails[] directorDetails;
    private String registeredNumber;

    public CompanyDetails() {

    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getIsInstitutionalInvestor() {
        return isInstitutionalInvestor;
    }

    public void setIsInstitutionalInvestor(String isInstitutionalInvestor) {
        this.isInstitutionalInvestor = isInstitutionalInvestor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearsInOperation() {
        return yearsInOperation;
    }

    public void setYearsInOperation(String yearsInOperation) {
        this.yearsInOperation = yearsInOperation;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public DirectorDetails[] getDirectorDetails() {
        return directorDetails;
    }

    public void setDirectorDetails(DirectorDetails[] directorDetails) {
        this.directorDetails = directorDetails;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CompanyDetails.class.getSimpleName() + "[", "]")
                .add("registeredAddress='" + registeredAddress + "'")
                .add("isInstitutionalInvestor='" + isInstitutionalInvestor + "'")
                .add("name='" + name + "'")
                .add("yearsInOperation='" + yearsInOperation + "'")
                .add("sector=" + sector)
                .add("contactDetails=" + contactDetails)
                .add("directorDetails=" + Arrays.toString(directorDetails))
                .add("registeredNumber='" + registeredNumber + "'")
                .toString();
    }
}