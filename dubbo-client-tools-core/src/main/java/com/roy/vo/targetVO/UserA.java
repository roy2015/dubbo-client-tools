package com.roy.vo.targetVO;

import org.springframework.stereotype.Component;

public class UserA {
    private String birthDateA;
    private String ageA;
    private String nameA;

    public void setBirthDateA(String birthDateA) {
        this.birthDateA = birthDateA;
    }

    public void setAgeA(String ageA) {
        this.ageA = ageA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getBirthDateA() {
        return birthDateA;
    }

    public String getAgeA() {
        return ageA;
    }

    public String getNameA() {
        return nameA;
    }
}
