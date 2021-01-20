package com.jocata.MPdemo.vo.investoronboarding.cooperate;

import com.jocata.MPdemo.vo.investoronboarding.common.Identification;
import com.jocata.MPdemo.vo.investoronboarding.common.Nationality;
import com.jocata.MPdemo.vo.investoronboarding.common.PhoneDetails;

import java.util.Arrays;
import java.util.StringJoiner;

public class DirectorDetails {
    private String firstName;
    private String lastName;
    private Identification identification;
    private Nationality nationality;
    private PhoneDetails[] phone;
    private String isPrimary;
    private String fullName;
    private String middleName;
    private String designation;
    private String title;
    private String email;

    public DirectorDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public PhoneDetails[] getPhone() {
        return phone;
    }

    public void setPhone(PhoneDetails[] phone) {
        this.phone = phone;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DirectorDetails.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("identification=" + identification)
                .add("nationality=" + nationality)
                .add("phone=" + Arrays.toString(phone))
                .add("isPrimary='" + isPrimary + "'")
                .add("fullName='" + fullName + "'")
                .add("middleName='" + middleName + "'")
                .add("designation='" + designation + "'")
                .add("title='" + title + "'")
                .add("email='" + email + "'")
                .toString();
    }
}