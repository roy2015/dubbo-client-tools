package com.roy.propertyeditor;

import com.roy.vo.targetVO.User;
import com.roy.vo.targetVO.UserA;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserAToUserConverter implements Converter<UserA, User> {
    private String dateFormatStr ;
    private SimpleDateFormat dateFormat;

    public void setDateFormatStr(String dateFormatStr) {
        this.dateFormatStr = dateFormatStr;
        dateFormat = new SimpleDateFormat(dateFormatStr);
    }

    @Override
    public User convert(UserA source) {
        String nameA = source.getNameA();
        String ageA = source.getAgeA();
        String birthDateA = source.getBirthDateA();
        Date birthDate = null;
        try {
            birthDate = dateFormat.parse(birthDateA);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        int i = nameA.indexOf(",");
        String firstName = nameA.substring(0, i);
        String familyName = nameA.substring(i + 1);
        User user = new User();
        user.setAge(Integer.parseInt(ageA) + 100);
        user.setBirthDate(birthDate);
        user.setFamilyName(familyName);
        user.setFirstName(firstName);
        return user;
    }
}
