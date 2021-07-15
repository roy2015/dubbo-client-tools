package com.roy.vo.targetVO;

import org.springframework.stereotype.Component;

import java.util.Date;

public class User {

    private Date birthDate;
    private Integer age;
    private String firstName;
    private String familyName;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "birthDate=" + birthDate +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
