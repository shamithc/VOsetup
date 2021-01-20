package com.jocata.MPdemo.vo.investoronboarding.common;

import java.util.Arrays;
import java.util.StringJoiner;

public class ContactDetails {
    private Address[] addresses;
    private PhoneDetails[] phoneDetails;

    public ContactDetails() {
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public PhoneDetails[] getPhoneDetails() {
        return phoneDetails;
    }

    public void setPhoneDetails(PhoneDetails[] phoneDetails) {
        this.phoneDetails = phoneDetails;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ContactDetails.class.getSimpleName() + "[", "]")
                .add("addresses=" + Arrays.toString(addresses))
                .add("phoneDetails=" + Arrays.toString(phoneDetails))
                .toString();
    }
}

