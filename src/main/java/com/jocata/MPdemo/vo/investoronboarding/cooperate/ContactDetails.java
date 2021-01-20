package com.jocata.MPdemo.vo.investoronboarding.cooperate;

import com.jocata.MPdemo.vo.investoronboarding.common.Address;
import com.jocata.MPdemo.vo.investoronboarding.common.PhoneDetails;

import java.util.Arrays;
import java.util.StringJoiner;

public class ContactDetails {
    private Address address;
    private PhoneDetails[] phone;
    private String emailId;

    public ContactDetails() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneDetails[] getPhone() {
        return phone;
    }

    public void setPhone(PhoneDetails[] phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ContactDetails.class.getSimpleName() + "[", "]")
                .add("address=" + address)
                .add("phone=" + Arrays.toString(phone))
                .add("emailId='" + emailId + "'")
                .toString();
    }
}
