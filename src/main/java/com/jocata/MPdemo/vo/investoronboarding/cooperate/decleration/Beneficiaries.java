package com.jocata.MPdemo.vo.investoronboarding.cooperate.decleration;

import java.util.StringJoiner;

public class Beneficiaries {
    private String name;
    private String idNumber;
    private String appointmentDate;

    public Beneficiaries() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Beneficiaries.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("idNumber='" + idNumber + "'")
                .add("appointmentDate='" + appointmentDate + "'")
                .toString();
    }
}

